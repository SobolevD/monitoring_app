package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.entity.ServiceInfo;
import org.example.services.ExcelService;
import org.example.services.ServiceInfoService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
public class ServicesReportProvider {

    public File getReport() throws IOException {
        log.info("Getting services info...");
        ServiceInfoService serviceInfoService = new ServiceInfoService();

        List<ServiceInfo> servicesInfo;
        try {
            servicesInfo = serviceInfoService.getServicesInfo();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect services info because of error", e);
            throw new RuntimeException(e);
        }

        log.info("Creating report file...");

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();
        try {
            excelService.addToXls(workbook, "Services", ServiceInfo.COLUMN_NAMES, servicesInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return excelService.saveReport(workbook, "OS Services");
    }
}
