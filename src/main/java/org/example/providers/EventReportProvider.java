package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.entity.EventLogGeneralInfo;
import org.example.model.entity.EventLogInfo;
import org.example.services.EventsInfoService;
import org.example.services.ExcelService;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class EventReportProvider {

    public File getReport() {
        log.info("Getting events...");
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
        for (String eventLogName : eventLogNames) {
            List<EventLogInfo> eventLogInfos;
            try {
                log.info("Collecting '{}' event log...", eventLogName);
                eventLogInfos = eventsInfoService.getEventLogInfo(eventLogName);
                nameAndEventLogInfoMapping.put(eventLogName, eventLogInfos);
            } catch (IOException | InterruptedException e) {
                log.error("Unable to collect event log with name '{}' because of error", eventLogName, e);
                throw new RuntimeException(e);
            }
        }

        log.info("Creating report file...");

        ExcelService excelService = new ExcelService();

        HSSFWorkbook eventsLogReport = excelService.createEmptyReport();
        try {
            excelService.writeEventLogGeneralInfo(eventsLogReport,
                    eventLogGeneralInfos);

            for (Map.Entry<String, List<EventLogInfo>> eventsLog : nameAndEventLogInfoMapping.entrySet()) {

                String eventLogName = eventsLog.getKey();

                excelService.writeEventLogInfo(eventsLogReport,
                        eventsLog.getValue(), eventLogName);
            }
            return excelService.saveReport(eventsLogReport, "Event log report");
        } catch (IOException e) {
            log.info("Unable to create excel report files because of error: ", e);
            throw new RuntimeException(e);
        }
    }



}
