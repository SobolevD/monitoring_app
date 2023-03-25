package org.example.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.example.model.entity.WMIObjectInfo;
import org.example.model.entity.WMIObjectsListInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WmiObjectsService {

    private static final String GET_WMI_OBJECT_INFO_LIST_COMMAND = "Get-WMIObject -List";
    private static final String GET_WMI_OBJECT_CLASS_INFO_COMMAND = "Get-WMIObject \"%s\"";

    public List<WMIObjectsListInfo> getWmiObjectsListInfo()
            throws IOException, InterruptedException {
        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_WMI_OBJECT_INFO_LIST_COMMAND);
        return Arrays.asList(new ObjectMapper().readValue(processResourcesFile, WMIObjectsListInfo[].class));
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
