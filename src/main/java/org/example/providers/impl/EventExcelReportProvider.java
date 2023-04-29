package org.example.providers.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.ObjectMetadata;
import org.example.model.common.Report;
import org.example.model.entity.powershell.EventLogGeneralInfo;
import org.example.model.entity.powershell.EventLogInfo;
import org.example.providers.ExcelReportProvider;
import org.example.services.EventsInfoService;
import org.example.services.ExcelService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class EventExcelReportProvider implements ExcelReportProvider {

    public Report getReport(ObjectMetadata objectMetadata,
                            String sheetName,
                            String workBookName) throws IOException {
        log.info("Getting events report...");
        EventsInfoService eventsInfoService = new EventsInfoService();

        List<EventLogGeneralInfo> eventLogGeneralInfos;
        try {
            eventLogGeneralInfos = eventsInfoService.getEventLogGeneralInfo();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect event log general information because of error", e);
            throw new RuntimeException(e);
        }

        List<String> eventLogNames = eventLogGeneralInfos.stream()
                .map(EventLogGeneralInfo::getLog)
                .collect(Collectors.toList());

        log.info("Available event log names: '{}'", eventLogNames);

        Map<String, List<EventLogInfo>> nameAndEventLogInfoMapping = new HashMap<>();
        for (EventLogGeneralInfo eventLogInfo : eventLogGeneralInfos) {
            List<EventLogInfo> eventLogInfos;

            String eventLogName = eventLogInfo.getLog();
            try {
                log.info("Collecting '{}' event log...", eventLogName);

                eventLogInfos = eventsInfoService.getEventLogInfo(eventLogName);
                nameAndEventLogInfoMapping.put(eventLogName, eventLogInfos);
            } catch (IOException | InterruptedException e) {
                log.error("Unable to collect event log with name '{}' because of error", eventLogName, e);
            }
        }

        log.info("Creating report file...");

        List<List<?>> objectsForComplexReport = new ArrayList<>();
        objectsForComplexReport.add(eventLogGeneralInfos);

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();
        try {
            excelService.addToXls(workbook, sheetName, EventLogGeneralInfo.COLUMN_NAMES, eventLogGeneralInfos);
            for (Map.Entry<String, List<EventLogInfo>> nameAndEventLog : nameAndEventLogInfoMapping.entrySet()) {
                String currentSheetName = nameAndEventLog.getKey();
                List<EventLogInfo> eventLogList = nameAndEventLog.getValue();
                excelService.addToXls(workbook, currentSheetName, EventLogInfo.COLUMN_NAMES, eventLogList);

                objectsForComplexReport.add(eventLogList);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File excelReport = excelService.saveReportAndGetFile(workbook, "OS Events");
        return new Report(objectsForComplexReport, excelReport);
    }



}
