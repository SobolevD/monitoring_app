package org.example.providers;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.example.model.common.Report;
import org.example.model.entity.docker.DockerContainerInfo;
import org.example.model.entity.docker.DockerImageInfo;
import org.example.services.DockerService;
import org.example.services.ExcelService;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class DockerReportProvider {

    public Report getReport() throws IOException {
        log.info("Getting docker report...");
        DockerService dockerService = new DockerService();
        ExcelService excelService = new ExcelService();

        List<DockerContainerInfo> dockerContainersInfo;
        try {
            dockerContainersInfo = dockerService.getAllDockerContainersInfo();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect docker containers information because of error", e);
            throw new RuntimeException(e);
        }

        List<DockerImageInfo> dockerImagesInfo;
        try {
            dockerImagesInfo = dockerService.getAllDockerImagesInfo();
        } catch (IOException | InterruptedException e) {
            log.error("Unable to collect docker images information because of error", e);
            throw new RuntimeException(e);
        }

        HSSFWorkbook workbook = excelService.createBlankReport();
        excelService.addToXls(workbook, "Docker containers", DockerContainerInfo.COLUMN_NAMES, dockerContainersInfo);
        excelService.addToXls(workbook, "Docker images", DockerImageInfo.COLUMN_NAMES, dockerImagesInfo);

        File file = excelService.saveReportAndGetFile(workbook, "OS Docker");

        return new Report(Arrays.asList(dockerImagesInfo, dockerContainersInfo), file);
    }
}
