package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.entity.ScheduledTaskInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ScheduledTasksService {

    private static final String GET_SCHEDULED_TASKS_COMMAND = "Get-ScheduledTask";

    public List<ScheduledTaskInfo> getScheduledTasksInfo()
            throws IOException, InterruptedException {
        File consoleOutput = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_SCHEDULED_TASKS_COMMAND);
        return Arrays.asList(new ObjectMapper().readValue(consoleOutput, ScheduledTaskInfo[].class));
    }
}
