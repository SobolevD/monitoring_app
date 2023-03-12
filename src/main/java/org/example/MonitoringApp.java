package org.example;

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

public class MonitoringApp {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    public static void main(String[] args) throws IOException, InterruptedException {

        PropertiesLoader.loadProps(PROPERTIES_FILE_PATH);
        Properties properties = PropertiesLoader.getProperties();

        System.out.println("Getting processes info for user " + CURRENT_USERNAME + "...");
        ProcessesInfoService processesInfoService = new ProcessesInfoService();

        List<ProcessResources> processResources = processesInfoService.getProcessResources();

        System.out.println("Creating report file...");

        TrustedProcesses trustedProcesses = TrustedProcesses.fromFile(TRUSTED_PROCESSES_FILE_PATH);
        List<ProcessResources> untrustedProcesses =
                processesInfoService.getUntrustedProcesses(processResources, trustedProcesses);

        System.out.println("Sending message to email " +
                properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP) + "...");

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTime());

        ExcelService excelService = new ExcelService();

        File processResourcesFile = excelService.writeProcessesResources(processResources, "All processes info");

        File untrustedProcessesFile = excelService.writeProcessesResources(untrustedProcesses, "Untrusted processes info");

        emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                message, Arrays.asList(processResourcesFile, untrustedProcessesFile));

    }

    private static String getCurrentTime() {
        SimpleDateFormat dateFormatGMT = new SimpleDateFormat(DATE_FORMAT);
        dateFormatGMT.setTimeZone(TimeZone.getTimeZone("GMT+4"));
        return dateFormatGMT.format(new Date());
    }
}