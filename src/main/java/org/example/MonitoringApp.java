package org.example;

import org.example.tasks.CollectAndSendToEmailProcessesInfoTask;
import org.example.utils.PropertiesLoader;

import java.util.Properties;
import java.util.Timer;

import static org.example.common.Constants.PROPERTIES_FILE_PATH;
import static org.example.common.PropertiesNames.TASK_COLLECT_PROCESSES_DELAY_SECONDS_PROP;
import static org.example.common.PropertiesNames.TASK_COLLECT_PROCESSES_PERIOD_SECONDS_PROP;

public class MonitoringApp {


    public static void main(String[] args) {
        PropertiesLoader.loadProps(PROPERTIES_FILE_PATH);
        scheduleTasks();
    }

    private static void scheduleTasks() {
        Properties properties = PropertiesLoader.getProperties();
        String collectProcessTaskDelay = properties.getProperty(TASK_COLLECT_PROCESSES_DELAY_SECONDS_PROP);
        String collectProcessTaskPeriod = properties.getProperty(TASK_COLLECT_PROCESSES_PERIOD_SECONDS_PROP);

        new Timer().schedule(new CollectAndSendToEmailProcessesInfoTask(),
                Long.parseLong(collectProcessTaskDelay),
                Long.parseLong(collectProcessTaskPeriod));
    }


}