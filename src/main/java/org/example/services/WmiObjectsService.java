package org.example.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.entity.powershell.WMIObjectInfo;
import org.example.model.entity.powershell.WMIObjectsListInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.common.Commands.GET_WMI_OBJECT_CLASS_INFO_COMMAND;
import static org.example.common.Commands.GET_WMI_OBJECT_INFO_LIST_COMMAND;

public class WmiObjectsService {

    public List<WMIObjectsListInfo> getWmiObjectsListInfo()
            throws IOException, InterruptedException {
        File consoleOutput = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_WMI_OBJECT_INFO_LIST_COMMAND);
        return Arrays.asList(new ObjectMapper().readValue(consoleOutput, WMIObjectsListInfo[].class));
    }

    public List<WMIObjectInfo> getWmiObjectsClassInfo(String wmiObjectClass)
            throws IOException, InterruptedException {

        List<WMIObjectInfo> wmiObjectsInfo = new ArrayList<>();

        String command = String.format(GET_WMI_OBJECT_CLASS_INFO_COMMAND, wmiObjectClass);

        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(command);

        JsonNode allWmiObjects = new ObjectMapper().readTree(processResourcesFile);

        for (JsonNode wmiObjectContent : allWmiObjects) {
            wmiObjectsInfo.add(new WMIObjectInfo(wmiObjectContent));
        }

        return wmiObjectsInfo;
    }
}
