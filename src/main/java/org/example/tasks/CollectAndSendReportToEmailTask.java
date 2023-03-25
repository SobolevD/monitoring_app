package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.EmailCredentials;
import org.example.model.Report;
import org.example.model.entity.NetworkConnectionProfileInfo;
import org.example.model.entity.ProcessResourcesInfo;
import org.example.model.entity.ScheduledTaskInfo;
import org.example.model.entity.ServiceInfo;
import org.example.providers.EventReportProvider;
import org.example.providers.SimplePowerShellReportProvider;
import org.example.providers.WmiObjectsReportProvider;
import org.example.services.EmailService;
import org.example.utils.PropertiesLoader;
import org.example.utils.ZipUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static org.example.common.Commands.*;
import static org.example.common.PropertiesNames.*;

@Slf4j
public class CollectAndSendReportToEmailTask extends TimerTask {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    private final Properties properties;

    private final EventReportProvider eventReportProvider;
    private final WmiObjectsReportProvider wmiObjectsReportProvider;
    private final SimplePowerShellReportProvider powerShellReportProvider;

    public CollectAndSendReportToEmailTask() {
        this.properties = PropertiesLoader.getProperties();
        this.eventReportProvider = new EventReportProvider();
        this.wmiObjectsReportProvider = new WmiObjectsReportProvider();
        this.powerShellReportProvider = new SimplePowerShellReportProvider();
    }

    @Override
    public void run() {

        Report reportForProcesses;
        try {
            reportForProcesses = powerShellReportProvider.getReport(POWERSHELL_GET_PROCESSES_COMMAND,
                    ProcessResourcesInfo[].class,
                    ProcessResourcesInfo.COLUMN_NAMES,
                    "Processes",
                    "OS Processes"
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Report reportForEventLog;
        try {
            reportForEventLog = eventReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Report reportForServices;
        try {
            reportForServices = powerShellReportProvider.getReport(POWERSHELL_GET_SERVICES_COMMAND,
                    ServiceInfo[].class,
                    ServiceInfo.COLUMN_NAMES,
                    "Services",
                    "OS Services");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Report reportForWmiObjects;
        try {
            reportForWmiObjects = wmiObjectsReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Report reportForNetConnectionProfiles;
        try {
            reportForNetConnectionProfiles = powerShellReportProvider.getReportForSingleObject(
                    POWERSHELL_GET_NET_CONNECTION_PROFILES_COMMAND,
                    NetworkConnectionProfileInfo.class,
                    NetworkConnectionProfileInfo.COLUMN_NAMES,
                    "Net connection profiles",
                    "OS Net Connection Profiles");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Report reportForScheduledTasks;
        try {
            reportForScheduledTasks = powerShellReportProvider.getReport(POWERSHELL_GET_SCHEDULED_TASKS_COMMAND,
                    ScheduledTaskInfo[].class,
                    ScheduledTaskInfo.COLUMN_NAMES,
                    "Scheduled tasks",
                    "OS Scheduled tasks");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<File> entireReport = collectReport(reportForProcesses,
                reportForServices,
                reportForScheduledTasks,
                reportForNetConnectionProfiles,
                reportForEventLog,
                reportForWmiObjects);

        File zipArchive = ZipUtils.createZip(entireReport, "C:\\Users\\dmso0321\\Downloads\\OS User Report.zip");

        log.info("Sending message to email '{}'...", properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP));

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTime());

        try {
            emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                    message, zipArchive);
            zipArchive.deleteOnExit();
        } catch (Exception e) {
            log.error("Unable to send message to recipient because of error", e);
        }
    }

    private String getCurrentTime() {
        SimpleDateFormat dateFormatGMT = new SimpleDateFormat(DATE_FORMAT);
        dateFormatGMT.setTimeZone(TimeZone.getTimeZone("GMT+4"));
        return dateFormatGMT.format(new Date());
    }

    private List<File> collectReport(Report... reports) {
        return Arrays.stream(reports).map(Report::getExcelReport).collect(Collectors.toList());
    }
}
