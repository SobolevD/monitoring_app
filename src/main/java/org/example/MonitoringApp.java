package org.example;

import org.example.common.ResourcesGroupMetadataDictionary;
import org.example.model.GroupMetadata;
import org.example.providers.ExcelReportProvider;
import org.example.providers.impl.SimplePowerShellExcelReportProvider;
import org.example.tasks.CollectAudioReportTask;
import org.example.tasks.CollectExcelReportTask;
import org.example.tasks.CollectVideoReportTask;
import org.example.utils.PropertiesLoader;
import org.example.utils.ReportProviderResolver;

import java.util.Properties;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static org.example.common.Constants.PROPERTIES_FILE_PATH_IN_ARCHIVE;
import static org.example.common.Constants.PROPERTIES_FILE_PATH_IN_PROJECT;
import static org.example.common.Groups.*;
import static org.example.common.PropertiesNames.*;

public class MonitoringApp {

    public static void main(String[] args) {
        try {
            PropertiesLoader.loadProps(PROPERTIES_FILE_PATH_IN_PROJECT);
        } catch (RuntimeException e) {
            PropertiesLoader.loadProps(PROPERTIES_FILE_PATH_IN_ARCHIVE);
        }
        scheduleTasks();
    }

    private static void scheduleTasks() {
        Properties properties = PropertiesLoader.getProperties();

        String groupsAsString = properties.getProperty(REPORT_GROUPS_TO_PROCESS_PROP);

        String[] groups = groupsAsString.split(",");

        for (String group : groups) {

            GroupMetadata groupMetadata = ResourcesGroupMetadataDictionary.getGroupMetadataByGroup(group);

            String taskDelay = properties.getProperty(groupMetadata.getDelayPropertyName());
            String taskPeriod = properties.getProperty(groupMetadata.getPeriodPropertyName());

            if (AUDIO.equals(group)) {
                String durationStr = properties.getProperty(TASK_COLLECT_AUDIO_DURATION_SECONDS_PROP);

                long durationMillis = TimeUnit.SECONDS.toMillis(Integer.parseInt(durationStr));

                new Timer().schedule(new CollectAudioReportTask(durationMillis),
                        Long.parseLong(taskDelay),
                        Long.parseLong(taskPeriod));
                continue;
            }

            if (VIDEO.equals(group)) {
                String durationStr = properties.getProperty(TASK_COLLECT_VIDEO_DURATION_SECONDS_PROP);
                String delayBetweenImagesStr = properties.getProperty(TASK_COLLECT_VIDEO_DELAY_BETWEEN_IMAGES_PROP);

                long durationMillis = TimeUnit.SECONDS.toMillis(Integer.parseInt(durationStr));
                int delayBetweenImagesMillis = Integer.parseInt(delayBetweenImagesStr);

                new Timer().schedule(new CollectVideoReportTask(durationMillis, delayBetweenImagesMillis),
                        Long.parseLong(taskDelay),
                        Long.parseLong(taskPeriod));
                continue;
            }

            if (GROUPS_WITH_CUSTOM_EXCEL_REPORT_PROVIDERS.contains(group)) {
                ExcelReportProvider excelReportProvider = ReportProviderResolver.resolve(group);

                createTaskToCollectExcelReport(group,
                        taskDelay,
                        taskPeriod,
                        excelReportProvider);
            } else {
                createTaskToCollectExcelReport(group,
                        taskDelay,
                        taskPeriod,
                        new SimplePowerShellExcelReportProvider());
            }
        }
    }

    private static void createTaskToCollectExcelReport(String group, String delay, String period, ExcelReportProvider excelReportProvider) {
        new Timer().schedule(new CollectExcelReportTask(group, excelReportProvider),
                Long.parseLong(delay),
                Long.parseLong(period));
    }
}