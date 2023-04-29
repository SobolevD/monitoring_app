package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.ObjectMetadata;
import org.example.model.common.EmailCredentials;
import org.example.model.common.Report;
import org.example.model.entity.powershell.PrinterInfo;
import org.example.providers.SimplePowerShellReportProvider;
import org.example.services.AudioService;
import org.example.services.EmailService;
import org.example.utils.PropertiesLoader;
import org.example.utils.ZipUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static org.example.common.ObjectsMetadataDictionary.getObjectMetadata;
import static org.example.common.ObjectsMetadataDictionary.getObjectMetadataByGroup;
import static org.example.common.PropertiesNames.*;

@Slf4j
public class CollectReport extends TimerTask {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    private final Properties properties;
    private final String group;
    private final SimplePowerShellReportProvider powerShellReportProvider;
    private final ExecutorService executorService;

    public CollectReport(String group) {
        this.executorService = Executors.newFixedThreadPool(4);
        this.group = group;
        this.properties = PropertiesLoader.getProperties();
        this.powerShellReportProvider = new SimplePowerShellReportProvider();
    }

    @Override
    public void run() {

        List<ObjectMetadata> objectsMetadata = getObjectMetadataByGroup(group);

        List<Report> reports = new ArrayList<>();
        for (ObjectMetadata metadata : objectsMetadata) {
            executorService.submit(
                    () -> {
                        Report report;
                        try {
                            report = powerShellReportProvider.getReport(metadata,
                                    metadata.getSimpleName(),
                                    metadata.getGroup());
                            reports.add(report);
                        } catch (IOException | InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        List<File> entireReport = collectReport(reports);

        File zipArchive = ZipUtils.createZip(entireReport, "OS User Report.zip");

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

    private List<File> collectReport(List<Report> reports) {
        return collectReport(reports.toArray(new Report[0]));
    }
}
