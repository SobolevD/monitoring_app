package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.entity.ServiceInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ServiceInfoService {

    private static final String GET_SERVICES_COMMAND = "Get-Service";

    public List<ServiceInfo> getServicesInfo()
            throws IOException, InterruptedException {
        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_SERVICES_COMMAND);
        return Arrays.asList(new ObjectMapper().readValue(processResourcesFile, ServiceInfo[].class));
    }
}
