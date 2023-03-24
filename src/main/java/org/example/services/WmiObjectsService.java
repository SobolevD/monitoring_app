package org.example.services;

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
import java.util.List;

public class WmiObjectsService {

    private static final String GET_WMI_OBJECT_INFO_LIST_COMMAND = "Get-WMIObject -List";
    private static final String GET_WMI_OBJECT_CLASS_INFO_COMMAND = "Get-WMIObject \"%s\"";

    public List<WMIObjectsListInfo> getWmiObjectsListInfo()
            throws IOException, InterruptedException {

        List<WMIObjectsListInfo> wmiObjectsListInfo = new ArrayList<>();

        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(GET_WMI_OBJECT_INFO_LIST_COMMAND);

        Reader in = new FileReader(processResourcesFile);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(WMIObjectsListInfo.COLUMN_NAMES)
                .withFirstRecordAsHeader()
                .parse(in);

        int columnNum;

        for (CSVRecord record : records) {
            columnNum = 0;
            wmiObjectsListInfo.add(WMIObjectsListInfo.builder()
                    .psComputerName(record.get(WMIObjectsListInfo.COLUMN_NAMES[columnNum]))
                    .name(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .genus(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .clazz(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .superClass(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .dynasty(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .relpath(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .propertyCount(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .derivation(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .server(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .namespace(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .path(record.get(WMIObjectsListInfo.COLUMN_NAMES[++columnNum]))
                    .build());
        }
        return wmiObjectsListInfo;
    }

    public List<WMIObjectInfo> getWmiObjectsClassInfo(String wmiObjectClass)
            throws IOException, InterruptedException {

        List<WMIObjectInfo> wmiObjectsClassInfo = new ArrayList<>();

        String command = String.format(GET_WMI_OBJECT_CLASS_INFO_COMMAND, wmiObjectClass);

        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(command);

        Reader in = new FileReader(processResourcesFile);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(WMIObjectInfo.COLUMN_NAMES)
                .withFirstRecordAsHeader()
                .parse(in);

        int columnNum;

        for (CSVRecord record : records) {
            columnNum = 0;
            wmiObjectsClassInfo.add(WMIObjectInfo.builder()
                    .psComputerName(record.get(WMIObjectInfo.COLUMN_NAMES[columnNum]))
                    .name(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .genus(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .clazz(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .superClass(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .dynasty(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .relpath(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .propertyCount(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .derivation(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .server(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .namespace(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .path(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .availability(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .caption(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .configManagerErrorCode(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .configManagerUserConfig(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .creationClassName(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .description(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .deviceId(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .errorCleared(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .errorDescription(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .installDate(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .isLocked(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .lastErrorCode(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .layout(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .name(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .numberOfFunctionKeys(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .password(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .pnpDeviceId(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .powerManagementCapabilities(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .powerManagementSupported(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .status(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .statusInfo(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .systemCreationClassName(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .systemName(record.get(WMIObjectInfo.COLUMN_NAMES[++columnNum]))
                    .build());
        }
        return wmiObjectsClassInfo;
    }
}
