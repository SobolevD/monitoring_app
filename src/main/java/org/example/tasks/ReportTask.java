package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.EmailCredentials;
import org.example.model.common.Report;
import org.example.repository.ReportRepository;
import org.example.repository.ReportRepositoryResolver;
import org.example.services.EmailService;
import org.example.services.storage.StorageService;
import org.example.services.storage.StorageServiceResolver;
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

    private final ReportRepositoryResolver reportRepositoryResolver;
    private final StorageServiceResolver storageServiceResolver;

    protected Properties properties;

    public ReportTask(Properties properties) {
        this.properties = properties;
        this.reportRepositoryResolver = new ReportRepositoryResolver();
        this.storageServiceResolver = new StorageServiceResolver();
    }

    protected final void collectAndSendReport(List<Report> reports) {

        boolean storeToDatabase =
                Boolean.parseBoolean(properties.getProperty(REPORT_STORE_TO_DATABASE_PROP));

        if (storeToDatabase) {
            storeToDatabase(reports);
        }

        boolean storeToStorage =
                Boolean.parseBoolean(properties.getProperty(REPORT_STORE_TO_STORAGE_PROP));

        if (storeToStorage) {
            saveToStorage(reports);
        }

        boolean sendToEmail =
                Boolean.parseBoolean(properties.getProperty(REPORT_SEND_TO_EMAIL_PROP));

        if (sendToEmail) {
            sendReportToEmail(reports);
        }
    }

    private List<File> collectReport(Report... reports) {
        return Arrays.stream(reports).map(Report::getReport).collect(Collectors.toList());
    }

    private List<File> collectReport(List<Report> reports) {
        return collectReport(reports.toArray(new Report[0]));
    }

    private void sendReportToEmail(List<Report> reports) {

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

    private void storeToDatabase(List<Report> reports) {
        ReportRepository reportRepository = reportRepositoryResolver.resolve();

        for (Report report : reports) {
            reportRepository.saveReport(report);
        }
    }

    private void saveToStorage(List<Report> reports) {
        StorageService storageService = storageServiceResolver.resolve();

        for (Report report : reports) {
            storageService.storeReport(report);
        }
    }

}
