package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.TrustedProcesses;
import org.example.model.entity.ProcessResourcesInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessesInfoService {

    private static final String GET_PROCESS_RESOURCES_COMMAND = "Get-Process | ? {$_.SI -eq (Get-Process -PID $PID).SessionId}";

    public List<ProcessResourcesInfo> getProcessResources() throws IOException, InterruptedException {
        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_PROCESS_RESOURCES_COMMAND);
        return Arrays.asList(new ObjectMapper().readValue(processResourcesFile, ProcessResourcesInfo[].class));
    }

    public List<ProcessResourcesInfo> getUntrustedProcesses(List<ProcessResourcesInfo> processResourcesInfoToFilter,
                                                            TrustedProcesses trustedProcesses) {
        return processResourcesInfoToFilter.stream()
                .filter(processResourcesInfo -> !trustedProcesses.containsProcessName(processResourcesInfo.getProcessName()))
                .filter(processResourcesInfo -> !trustedProcesses.containsPathPrefix(processResourcesInfo.getPath()))
                .filter(processResourcesInfo -> !trustedProcesses.containsCompany(processResourcesInfo.getCompany()))
                .collect(Collectors.toList());
    }
}
