package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.entity.ScheduledTaskInfo;
import org.example.model.entity.ServiceInfo;
import org.example.services.ExcelService;
import org.example.services.ScheduledTasksService;
import org.example.services.ServiceInfoService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
public class ScheduledTasksReportProvider {

    public File getReport() throws IOException {
        log.info("Getting schedules tasks report...");

        ScheduledTasksService serviceInfoService = new ScheduledTasksService();

        List<ScheduledTaskInfo> scheduledTasksInfo;
        try {
            scheduledTasksInfo = serviceInfoService.getScheduledTasksInfo();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect scheduled tasks info because of error", e);
            throw new RuntimeException(e);
        }

        log.info("Creating report file...");

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();
        try {
            excelService.addToXls(workbook, "Scheduled tasks", ScheduledTaskInfo.COLUMN_NAMES, scheduledTasksInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return excelService.saveReport(workbook, "OS Scheduled tasks");
    }
}
