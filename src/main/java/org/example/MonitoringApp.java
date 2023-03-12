package org.example;

import org.example.model.EmailCredentials;
import org.example.model.ProcessInfo;
import org.example.services.EmailService;
import org.example.services.ExcelService;
import org.example.services.ProcessesInfoService;
import org.example.utils.PropertiesLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import static org.example.common.Constants.CURRENT_USERNAME;

public class MonitoringApp {
    public static void main(String[] args) throws IOException {

        PropertiesLoader.loadProps("src/main/resources/application.properties");
        Properties properties = PropertiesLoader.getProperties();

        System.out.println("Getting processes info for user " + CURRENT_USERNAME);
        ProcessesInfoService processesInfoService = new ProcessesInfoService();
        List<ProcessInfo> processesInfo = processesInfoService.getInfo(CURRENT_USERNAME);

        System.out.println("Creating EXCEL file with info");
        ExcelService excelService = new ExcelService();
        File sheets = excelService.writeProcessesInfo(processesInfo);

        System.out.println("Sending message...");
        EmailService emailService = new EmailService();

        EmailCredentials credentials = EmailCredentials.builder()
                .email(properties.getProperty("mail.sender.noreply.address"))
                .password("mail.sender.noreply.external.password")
                .build();
        emailService.sendMessage(properties.getProperty("mail.sender.noreply.recipient"), credentials,
                processesInfo.toString(), Collections.singletonList(sheets));
    }
}