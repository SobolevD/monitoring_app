//package org.example.providers;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.example.model.entity.WMIObjectInfo;
//import org.example.model.entity.WMIObjectsListInfo;
//import org.example.services.ExcelService;
//import org.example.services.WmiObjectsService;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Slf4j
//public class WmiObjectsReportProvider {
//
//    public File getReport() {
//        log.info("Getting WMI objects list report...");
//        WmiObjectsService wmiObjectsService = new WmiObjectsService();
//
//        List<WMIObjectsListInfo> wmiObjectsListInfo;
//        try {
//            wmiObjectsListInfo = wmiObjectsService.getWmiObjectsListInfo();
//        } catch (IOException | InterruptedException e) {
//            log.error("Unable to collect WMI objects general information because of error", e);
//            throw new RuntimeException(e);
//        }
//
//        List<String> wmiObjectClasses = wmiObjectsListInfo.stream()
//                .map(WMIObjectsListInfo::getClazz)
//                .collect(Collectors.toList());
//
//        log.info("Available wmi object classes: '{}'", wmiObjectClasses);
//
//        Map<String, List<WMIObjectInfo>> classNameAndWmiObjectInfoMapping = new HashMap<>();
//        for (String wmiObjectClass : wmiObjectClasses) {
//            List<WMIObjectInfo> wmiObjectInfos;
//            try {
//                log.info("Collecting '{}' WMI object info...", wmiObjectClass);
//                wmiObjectInfos = wmiObjectsService.getWmiObjectsClassInfo(wmiObjectClass);
//                classNameAndWmiObjectInfoMapping.put(wmiObjectClass, wmiObjectInfos);
//            } catch (IOException | InterruptedException e) {
//                log.error("Unable to collect wmi object class's info with name '{}' " +
//                        "because of error", wmiObjectClass, e);
//                throw new RuntimeException(e);
//            }
//        }
//
//        log.info("Creating report file...");
//
//        ExcelService excelService = new ExcelService();
//
//        HSSFWorkbook eventsLogReport = excelService.createEmptyReport();
//        try {
//            excelService.writeWmiObjectGeneralInfo(eventsLogReport,
//                    wmiObjectsListInfo);
//
//            for (Map.Entry<String, List<WMIObjectInfo>> wmiObjectInfo : classNameAndWmiObjectInfoMapping.entrySet()) {
//
//                String wmiObjectClassName = wmiObjectInfo.getKey();
//
//                excelService.writeWmiObjectClassInfo(eventsLogReport,
//                        wmiObjectInfo.getValue(), wmiObjectClassName);
//            }
//            return excelService.saveReport(eventsLogReport, "WMI objects report");
//        } catch (IOException e) {
//            log.info("Unable to create excel report files because of error: ", e);
//            throw new RuntimeException(e);
//        }
//    }
//
//
//
//}
