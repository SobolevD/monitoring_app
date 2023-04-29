package org.example.providers.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.ObjectMetadata;
import org.example.model.common.Report;
import org.example.providers.ExcelReportProvider;
import org.example.services.ExcelService;
import org.example.services.SimplePowerShellService;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.util.Objects.isNull;

@Slf4j
public class SimplePowerShellExcelReportProvider implements ExcelReportProvider {

    public Report getReport(ObjectMetadata objectMetadata,
                            String sheetName,
                            String workBookName) throws IOException, InterruptedException {

        Class<? extends Object[]> objectArrayClass = objectMetadata.getObjectArrayClass();
        Class<?> objectClass = objectMetadata.getObjectClass();

        String command = objectMetadata.getCommand();

        log.info("Getting report for objects '{}'...",
                isNull(objectArrayClass)? objectClass.getSimpleName() : objectArrayClass.getSimpleName());
        SimplePowerShellService powerShellService = new SimplePowerShellService();

        List<?> objectsInfo = null;

        int triesCount = 50;
        for (int tryNum = 0; tryNum < triesCount; ++tryNum) {
            try {
                if (isNull(objectMetadata.getObjectClass())) {
                    objectsInfo = powerShellService.getInfoForObjectsInJsonFormat(command, objectArrayClass);
                } else {
                    objectsInfo = powerShellService.getInfoForSingleObjectInJsonFormat(command, objectClass);
                }
                break;
            } catch (IOException | InterruptedException e) {
                Thread.sleep(2000);
                if (tryNum == triesCount - 1) {
                    log.error("Unable to collect objects '{}' info by command '{}' because of error",
                            isNull(objectArrayClass) ? objectClass.getSimpleName() : objectArrayClass.getSimpleName(), command, e);
                    throw new RuntimeException(e);
                }
            }
        }

        String[] columnNames = objectMetadata.getColumns();
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
