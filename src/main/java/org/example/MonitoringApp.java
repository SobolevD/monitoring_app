package org.example;

import org.example.tasks.CollectReport;
import org.example.utils.PropertiesLoader;

import java.util.Properties;
import java.util.Timer;

import static org.example.common.Constants.PROPERTIES_FILE_PATH_IN_ARCHIVE;
import static org.example.common.Constants.PROPERTIES_FILE_PATH_IN_PROJECT;
import static org.example.common.Groups.*;
import static org.example.common.PropertiesNames.TASK_COLLECT_PROCESSES_DELAY_SECONDS_PROP;
import static org.example.common.PropertiesNames.TASK_COLLECT_PROCESSES_PERIOD_SECONDS_PROP;

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
        String collectProcessTaskDelay = properties.getProperty(TASK_COLLECT_PROCESSES_DELAY_SECONDS_PROP);
        String collectProcessTaskPeriod = properties.getProperty(TASK_COLLECT_PROCESSES_PERIOD_SECONDS_PROP);

        new Timer().schedule(new CollectReport(SECURITY),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(APPLICATION),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(BRANCH_CACHE),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(COMMON_INFO),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(DIRECT_ACCESS),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(STORAGE),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(DNS_CLIENT),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(REALTIME_MANAGEMENT),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(NETWORK),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(SYSTEM_INFO),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(PNP_DEVICE),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));

        new Timer().schedule(new CollectReport(PRINT_MANAGEMENT),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));
    }


}