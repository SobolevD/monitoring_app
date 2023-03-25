package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimplePowerShellService {

    public List<?> getInfoForObjectsInJsonFormat(String command, Class<? extends Object[]> objectClass)
            throws IOException, InterruptedException {
        File consoleOutput = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(command);
        return Arrays.asList(new ObjectMapper().readValue(consoleOutput, objectClass));
    }

    public List<?> getInfoForSingleObjectInJsonFormat(String command, Class<?> objectClass)
            throws IOException, InterruptedException {
        File consoleOutput = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(command);
        return Collections.singletonList(new ObjectMapper().readValue(consoleOutput, objectClass));
    }

}
