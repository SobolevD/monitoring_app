package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.entity.NetworkConnectionProfileInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NetworkConnectionInfoService {

    private static final String GET_NET_CONNECTION_PROFILE_COMMAND = "Get-NetConnectionProfile";

    public List<NetworkConnectionProfileInfo> getNetConnectionProfiles()
            throws IOException, InterruptedException {
        File consoleOutput = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_NET_CONNECTION_PROFILE_COMMAND);
        return Arrays.asList(new ObjectMapper().readValue(consoleOutput, NetworkConnectionProfileInfo.class));
    }
}
