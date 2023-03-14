package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.EmailCredentials;
import org.example.providers.EventReportProvider;
import org.example.providers.ProcessesReportProvider;
import org.example.services.EmailService;
import org.example.utils.PropertiesLoader;
import org.example.utils.ZipUtils;

import java.io.File;
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

    public CollectAndSendReportToEmailTask() {
        this.properties = PropertiesLoader.getProperties();
        this.processesReportProvider = new ProcessesReportProvider();
        this.eventReportProvider = new EventReportProvider();
    }

    @Override
    public void run() {

        File reportForProcesses = processesReportProvider.getReportForUser(CURRENT_USERNAME);
        File reportForEventLog = eventReportProvider.getReport();

        List<File> entireReport = collectReport(reportForProcesses,
                reportForEventLog);

        File zipArchive = ZipUtils.createZip(entireReport, "temp.zip");

        log.info("Sending message to email '{}'...", properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP));

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTime());

        emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                message, zipArchive);
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
