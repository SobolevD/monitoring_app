package org.example.providers.impl;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.ObjectMetadata;
import org.example.model.common.Report;
import org.example.model.entity.powershell.WMIObjectInfo;
import org.example.model.entity.powershell.WMIObjectsListInfo;
import org.example.providers.ExcelReportProvider;
import org.example.services.ExcelService;
import org.example.services.WmiObjectsService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Slf4j
public class WmiObjectsExcelReportProvider implements ExcelReportProvider {

    public Report getReport(ObjectMetadata objectMetadata,
                            String sheetName,
                            String workBookName) throws IOException {
        log.info("Getting WMI objects report...");
        WmiObjectsService wmiObjectsService = new WmiObjectsService();

        List<WMIObjectsListInfo> wmiObjectsListInfo;
        try {
            wmiObjectsListInfo = wmiObjectsService.getWmiObjectsListInfo();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect WMI objects general information because of error", e);
            throw new RuntimeException(e);
        }

        List<String> wmiObjectClasses = wmiObjectsListInfo.stream()
                .map(WMIObjectsListInfo::getClazz)
                .collect(Collectors.toList());

        log.info("Available wmi object classes: '{}'", wmiObjectClasses);
        Map<String, List<WMIObjectInfo>> classNameAndWmiObjectInfoMapping = new HashMap<>();
        for (String wmiObjectClass : wmiObjectClasses) {
            List<WMIObjectInfo> wmiObjectInfos;
            try {
                log.info("Collecting '{}' WMI object info...", wmiObjectClass);
                wmiObjectInfos = wmiObjectsService.getWmiObjectsClassInfo(wmiObjectClass);
                classNameAndWmiObjectInfoMapping.put(wmiObjectClass, wmiObjectInfos);
            } catch (IOException | InterruptedException e) {
                log.error("Unable to collect wmi object class's info with name '{}' " +
                        "because of error", wmiObjectClass, e);
                throw new RuntimeException(e);
            }
        }

        log.info("Creating report file...");

        List<List<?>> objectsForComplexReport = new ArrayList<>();
        objectsForComplexReport.add(wmiObjectsListInfo);

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();

        try {
            excelService.addToXls(workbook, sheetName, WMIObjectsListInfo.COLUMN_NAMES, wmiObjectsListInfo);
            for (Map.Entry<String, List<WMIObjectInfo>> classAndWmiObjectInfo : classNameAndWmiObjectInfoMapping.entrySet()) {

                String currentSheetName = classAndWmiObjectInfo.getKey();
                List<WMIObjectInfo> wmiObjectsInfo = classAndWmiObjectInfo.getValue();

                if (isNull(wmiObjectsInfo) || wmiObjectsInfo.isEmpty()) {
                    continue;
                }

                List<JsonNode> wmiObjectJsonNodes = wmiObjectsInfo.stream()
                        .map(WMIObjectInfo::getContent)
                        .collect(Collectors.toList());

                excelService.addToXls(workbook, currentSheetName, wmiObjectsInfo.get(0).getFields(), wmiObjectJsonNodes);
                objectsForComplexReport.add(wmiObjectJsonNodes);
            }
        } catch (IOException e) {
            log.error("Unable to save: ", e);
        }

        File excelReport = excelService.saveReportAndGetFile(workbook, "OS WMI Objects");
        return new Report(objectsForComplexReport, excelReport);
    }
}
