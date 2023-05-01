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
import java.util.zip.ZipFile;

import static org.example.common.PropertiesNames.*;
import static org.example.utils.DateTimeHelper.getCurrentTimeAsString;
import static org.example.utils.DateTimeHelper.getCurrentTimeForFileName;

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
        log.info("Collecting report to a zip archive...");

        String username = reports.stream().findAny().get().getUsername();

        List<File> entireReport = collectReport(reports);

        String fileName = String.format("OS User Report_%s_%s.zip", getCurrentTimeForFileName(), username);

        File zipArchive = ZipUtils.createZip(entireReport, fileName);
        zipArchive.deleteOnExit();

        boolean storeToDatabase =
                Boolean.parseBoolean(properties.getProperty(REPORT_STORE_TO_DATABASE_PROP));

        if (storeToDatabase) {
            log.info("Report will be saved to database");
            storeToDatabase(zipArchive, username);
        }

        boolean storeToStorage =
                Boolean.parseBoolean(properties.getProperty(REPORT_STORE_TO_STORAGE_PROP));

        if (storeToStorage) {
            log.info("Report will be saved to storage");
            saveToStorage(zipArchive);
        }

        boolean sendToEmail =
                Boolean.parseBoolean(properties.getProperty(REPORT_SEND_TO_EMAIL_PROP));

        if (sendToEmail) {
            log.info("Report will be sent to email");
            sendReportToEmail(zipArchive);
        }
    }

    private List<File> collectReport(Report... reports) {
        return Arrays.stream(reports).map(Report::getReport).collect(Collectors.toList());
    }

    private List<File> collectReport(List<Report> reports) {
        return collectReport(reports.toArray(new Report[0]));
    }

    private void sendReportToEmail(File zipFile) {

        long fileSizeInBytes = zipFile.length();
        long maxAllowableFileSizeMegabytes = Long.parseLong(properties.getProperty(MAX_REPORT_SIZE_MEGABYTES_FOR_EMAIL_PROP));
        long maxAllowableFileSizeBytes = maxAllowableFileSizeMegabytes * 1024 * 1024;

        if (fileSizeInBytes > maxAllowableFileSizeBytes) {
            log.error("Unable to send report to {}: max file size is {}, but report size is {}. Send cancelled!",
                    properties.getProperty(EMAIL_SENDER_ADDRESS_PROP), maxAllowableFileSizeBytes, fileSizeInBytes);
            return;
        }

        log.info("Sending message to email '{}'...", properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP));

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTimeAsString());

        try {
            emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                    message, zipFile);
        } catch (Exception e) {
            log.error("Unable to send message to recipient because of error", e);
        }
    }

    private void storeToDatabase(File reports, String username) {
        ReportRepository reportRepository = reportRepositoryResolver.resolve();

        reportRepository.saveReport(reports, username);
    }

    private void saveToStorage(File zipReport) {
        StorageService storageService = storageServiceResolver.resolve();
        storageService.storeReport(zipReport);
    }

}
