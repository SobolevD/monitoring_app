package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.entity.NetworkConnectionProfileInfo;
import org.example.model.entity.ServiceInfo;
import org.example.services.ExcelService;
import org.example.services.NetworkConnectionInfoService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
public class NetworkConnectionProfilesProviderProvider {

    public File getReport() throws IOException {
        log.info("Getting network connection profiles report...");
        NetworkConnectionInfoService netConnectionInfoService = new NetworkConnectionInfoService();

        List<NetworkConnectionProfileInfo> networkConnectionProfilesInfo;
        try {
            networkConnectionProfilesInfo = netConnectionInfoService.getNetConnectionProfiles();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect network connection profiles info because of error", e);
            throw new RuntimeException(e);
        }

        log.info("Creating report file...");

        ExcelService excelService = new ExcelService();

        HSSFWorkbook workbook = excelService.createBlankReport();
        try {
            excelService.addToXls(workbook, "Network connection profiles info",
                    NetworkConnectionProfileInfo.COLUMN_NAMES, networkConnectionProfilesInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return excelService.saveReport(workbook, "OS Network connection profiles info");
    }
}
