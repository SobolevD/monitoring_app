package org.example.providers;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.entity.EventLogGeneralInfo;
import org.example.model.entity.EventLogInfo;
import org.example.model.entity.WMIObjectInfo;
import org.example.model.entity.WMIObjectsListInfo;
import org.example.services.ExcelService;
import org.example.services.WmiObjectsService;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Slf4j
public class WmiObjectsReportProvider {

    public File getReport() throws IOException {
        log.info("Getting WMI objects list report...");
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

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();

        try {
            excelService.addToXls(workbook, "WMI Objects Classes list", WMIObjectsListInfo.COLUMN_NAMES, wmiObjectsListInfo);
            for (Map.Entry<String, List<WMIObjectInfo>> classAndWmiObjectInfo : classNameAndWmiObjectInfoMapping.entrySet()) {

                String sheetName = classAndWmiObjectInfo.getKey();
                List<WMIObjectInfo> wmiObjectsInfo = classAndWmiObjectInfo.getValue();

                if (isNull(wmiObjectsInfo) || wmiObjectsInfo.isEmpty()) {
                    continue;
                }

                List<JsonNode> wmiObjectJsonNodes = wmiObjectsInfo.stream()
                        .map(WMIObjectInfo::getContent)
                        .collect(Collectors.toList());

                excelService.addToXls(workbook, sheetName, wmiObjectsInfo.get(0).getFields(), wmiObjectJsonNodes);
            }
        } catch (IOException e) {
            log.error("Unable to save: ", e);
        }

        return excelService.saveReport(workbook, "OS WMI Objects");
    }
}
