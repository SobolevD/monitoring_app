package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.EmailCredentials;
import org.example.providers.*;
import org.example.services.EmailService;
import org.example.utils.PropertiesLoader;
import org.example.utils.ZipUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.example.common.Constants.CURRENT_USERNAME;
import static org.example.common.PropertiesNames.*;

@Slf4j
public class CollectAndSendReportToEmailTask extends TimerTask {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    private final Properties properties;

    private final ProcessesReportProvider processesReportProvider;
    private final EventReportProvider eventReportProvider;
    private final ServicesReportProvider servicesReportProvider;
    private final WmiObjectsReportProvider wmiObjectsReportProvider;
    private final NetworkConnectionProfilesProviderProvider netConnectionProfileReportProvider;
    private final ScheduledTasksReportProvider scheduledTasksReportProvider;

    public CollectAndSendReportToEmailTask() {
        this.properties = PropertiesLoader.getProperties();
        this.processesReportProvider = new ProcessesReportProvider();
        this.eventReportProvider = new EventReportProvider();
        this.servicesReportProvider = new ServicesReportProvider();
        this.wmiObjectsReportProvider = new WmiObjectsReportProvider();
        this.netConnectionProfileReportProvider = new NetworkConnectionProfilesProviderProvider();
        this.scheduledTasksReportProvider = new ScheduledTasksReportProvider();
    }

    @Override
    public void run() {

        File reportForProcesses;
        try {
            reportForProcesses = processesReportProvider.getReportForUser(CURRENT_USERNAME);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File reportForEventLog;
        try {
            reportForEventLog = eventReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File reportForServices;
        try {
            reportForServices = servicesReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File reportForWmiObjects;
        try {
            reportForWmiObjects = wmiObjectsReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File reportForNetConnectionProfiles;
        try {
            reportForNetConnectionProfiles = netConnectionProfileReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File reportForScheduledTasks;
        try {
            reportForScheduledTasks = scheduledTasksReportProvider.getReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<File> entireReport = collectReport(reportForProcesses,
                reportForEventLog,
                reportForServices,
                reportForWmiObjects,
                reportForNetConnectionProfiles,
                reportForScheduledTasks);

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

    private List<File> collectReport(File... reports) {
        return new ArrayList<>(Arrays.asList(reports));
    }
}
