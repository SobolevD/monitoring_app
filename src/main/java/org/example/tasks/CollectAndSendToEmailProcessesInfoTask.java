package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.EmailCredentials;
import org.example.model.ProcessResources;
import org.example.model.TrustedProcesses;
import org.example.services.EmailService;
import org.example.services.ExcelService;
import org.example.services.ProcessesInfoService;
import org.example.utils.PropertiesLoader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.example.common.Constants.*;
import static org.example.common.PropertiesNames.*;
import static org.example.common.PropertiesNames.EMAIL_RECIPIENT_ADDRESS_PROP;

@Slf4j
public class CollectAndSendToEmailProcessesInfoTask extends TimerTask {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    private final Properties properties;

    public CollectAndSendToEmailProcessesInfoTask() {
        this.properties = PropertiesLoader.getProperties();
    }

    @Override
    public void run() {
        log.info("Getting processes info for user '{}'...", CURRENT_USERNAME);
        ProcessesInfoService processesInfoService = new ProcessesInfoService();

        List<ProcessResources> processResources;
        try {
            processResources = processesInfoService.getProcessResources();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect processes resources because of error", e);
            throw new RuntimeException(e);
        }

        log.info("Creating report file...");

        TrustedProcesses trustedProcesses;
        try {
            trustedProcesses = TrustedProcesses.fromFile(TRUSTED_PROCESSES_FILE_PATH);
        } catch (IOException e) {
            log.error("Unable to get trusted processes from file because of error", e);
            throw new RuntimeException(e);
        }

        List<ProcessResources> untrustedProcesses =
                processesInfoService.getUntrustedProcesses(processResources, trustedProcesses);

        log.info("Sending message to email '{}'...", properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP));

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTime());

        ExcelService excelService = new ExcelService();

        try {
            File processResourcesFile = excelService.writeProcessesResources(processResources, "All processes info");
            File untrustedProcessesFile = excelService.writeProcessesResources(untrustedProcesses, "Untrusted processes info");
            emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                    message, Arrays.asList(processResourcesFile, untrustedProcessesFile));
        } catch (IOException e) {
            log.info("Unable to create excel file and send it to email because of error: ", e);
            throw new RuntimeException(e);
        }
    }

    private String getCurrentTime() {
        SimpleDateFormat dateFormatGMT = new SimpleDateFormat(DATE_FORMAT);
        dateFormatGMT.setTimeZone(TimeZone.getTimeZone("GMT+4"));
        return dateFormatGMT.format(new Date());
    }
}
