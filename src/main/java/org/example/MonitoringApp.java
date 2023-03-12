package org.example;

import org.example.model.EmailCredentials;
import org.example.model.ProcessResources;
import org.example.services.EmailService;
import org.example.services.ExcelService;
import org.example.services.ProcessesInfoService;
import org.example.utils.PropertiesLoader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.example.common.Constants.CURRENT_USERNAME;
import static org.example.common.Constants.PROPERTIES_FILE_PATH;
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
        ExcelService excelService = new ExcelService();

        File sheets = excelService.writeProcessesResources(processResources);

        System.out.println("Sending message to email " +
                properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP) + "...");

        EmailService emailService = new EmailService();
        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty(EMAIL_SENDER_ADDRESS_PROP))
                .password(properties.getProperty(EMAIL_SENDER_EXTERNAL_PASSWORD_PROP))
                .build();
        String message = String.format("Please do not reply to this message. Report time: %s", getCurrentTime());

        emailService.sendMessage(properties.getProperty(EMAIL_RECIPIENT_ADDRESS_PROP), credentials,
                message, Collections.singletonList(sheets));
    }

    private static String getCurrentTime() {
        SimpleDateFormat dateFormatGMT = new SimpleDateFormat(DATE_FORMAT);
        dateFormatGMT.setTimeZone(TimeZone.getTimeZone("GMT+4"));
        return dateFormatGMT.format(new Date());
    }
}