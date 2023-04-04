package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.common.Report;
import org.example.services.ExcelService;
import org.example.services.SimplePowerShellService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
public class SimplePowerShellReportProvider {

    public Report getReport(String command,
                            Class<? extends Object[]> objectClass,
                            String[] columnNames,
                            String sheetName,
                            String workBookName) throws IOException {

        log.info("Getting report for objects '{}'...", objectClass.getSimpleName());
        SimplePowerShellService powerShellService = new SimplePowerShellService();

        List<?> objectsInfo;
        try {
            objectsInfo = powerShellService.getInfoForObjectsInJsonFormat(command, objectClass);
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect objects '{}' info by command '{}' because of error",
                    objectClass.getSimpleName(), command, e);
            throw new RuntimeException(e);
        }

        return createReport(sheetName, workBookName, columnNames, objectsInfo);
    }

    public Report getReportForSingleObject(String command,
                          Class<?> objectClass,
                          String[] columnNames,
                          String sheetName,
                          String workBookName) throws IOException {

        log.info("Getting report for single object '{}'...", objectClass.getSimpleName());
        SimplePowerShellService powerShellService = new SimplePowerShellService();

        List<?> objectsInfo;
        try {
            objectsInfo = powerShellService.getInfoForSingleObjectInJsonFormat(command, objectClass);
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect single object '{}' info by command '{}' because of error",
                    objectClass.getSimpleName(), command, e);
            throw new RuntimeException(e);
        }

        return createReport(sheetName, workBookName, columnNames, objectsInfo);
    }

    private Report createReport(String sheetName,
                             String workbookName,
                             String[] columnNames,
                             List<?> objectsInfo)
            throws IOException {

        log.info("Creating report file...");

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();
        try {
            excelService.addToXls(workbook, sheetName, columnNames, objectsInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File excelReport = excelService.saveReportAndGetFile(workbook, workbookName);
        return new Report(objectsInfo, excelReport);
    }
}
