package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.EmailCredentials;
import org.example.model.common.Report;
import org.example.services.EmailService;
import org.example.utils.ZipUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.TimerTask;
import java.util.stream.Collectors;

import static org.example.common.PropertiesNames.*;
import static org.example.utils.DateTimeHelper.getCurrentTimeAsString;

@Slf4j
public abstract class ReportTask extends TimerTask {


    protected Properties properties;

    public ReportTask(Properties properties) {
        this.properties = properties;
    }

    protected void collectAndSendReport(List<Report> reports) {
        List<File> entireReport = collectReport(reports);

        File zipArchive = ZipUtils.createZip(entireReport, "OS User Report.zip");

        log.info("Sending message to email '{}'...", properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP));

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTimeAsString());

        try {
            emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                    message, zipArchive);
            zipArchive.deleteOnExit();
        } catch (Exception e) {
            log.error("Unable to send message to recipient because of error", e);
        }
    }

    private List<File> collectReport(Report... reports) {
        return Arrays.stream(reports).map(Report::getReport).collect(Collectors.toList());
    }

    private List<File> collectReport(List<Report> reports) {
        return collectReport(reports.toArray(new Report[0]));
    }


}
