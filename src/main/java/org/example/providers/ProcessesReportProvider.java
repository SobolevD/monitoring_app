package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.TrustedProcesses;
import org.example.model.entity.ProcessResourcesInfo;
import org.example.services.ExcelService;
import org.example.services.ProcessesInfoService;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.example.common.Constants.TRUSTED_PROCESSES_FILE_PATH;

@Slf4j
public class ProcessesReportProvider {
    public File getReportForUser(String username) {
        log.info("Getting processes info for user '{}'...", username);
        ProcessesInfoService processesInfoService = new ProcessesInfoService();

        List<ProcessResourcesInfo> processResourceInfos;
        try {
            processResourceInfos = processesInfoService.getProcessResources();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect processes resources because of error", e);
            throw new RuntimeException(e);
        }

        log.info("Collecting untrusted processes information...");

        TrustedProcesses trustedProcesses;
        try {
            trustedProcesses = TrustedProcesses.fromFile(TRUSTED_PROCESSES_FILE_PATH);
        } catch (IOException e) {
            log.error("Unable to get trusted processes from file because of error", e);
            throw new RuntimeException(e);
        }

        List<ProcessResourcesInfo> untrustedProcesses =
                processesInfoService.getUntrustedProcesses(processResourceInfos, trustedProcesses);

        log.info("Creating report file...");

        ExcelService excelService = new ExcelService();

        HSSFWorkbook processesReport = excelService.createEmptyReport();

        try {
            excelService.writeProcessesResources(processesReport,
                    processResourceInfos, "All Processes Info");
            excelService.writeProcessesResources(processesReport,
                    untrustedProcesses, "Untrusted Processes Info");
            return excelService.saveReport(processesReport, "Processes info report");
        } catch (IOException e) {
            log.info("Unable to create excel report files because of error: ", e);
            throw new RuntimeException(e);
        }
    }
}
