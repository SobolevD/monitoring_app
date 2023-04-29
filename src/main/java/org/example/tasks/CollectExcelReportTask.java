package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.ObjectMetadata;
import org.example.model.common.Report;
import org.example.providers.ExcelReportProvider;
import org.example.utils.PropertiesLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.example.common.ObjectsMetadataDictionary.getObjectMetadataByGroup;

@Slf4j
public class CollectExcelReportTask extends ReportTask {
    private final String group;
    private final ExcelReportProvider excelReportProvider;

    public CollectExcelReportTask(String group, ExcelReportProvider excelReportProvider) {
        super(PropertiesLoader.getProperties());
        this.group = group;
        this.excelReportProvider = excelReportProvider;
    }

    @Override
    public void run() {

        List<ObjectMetadata> objectsMetadata = getObjectMetadataByGroup(group);

        List<Report> reports = new ArrayList<>();
        for (ObjectMetadata metadata : objectsMetadata) {
            Report report;
            try {
                report = excelReportProvider.getReport(metadata,
                        metadata.getSimpleName(),
                        metadata.getGroup());
                reports.add(report);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        collectAndSendReport(reports);
    }
}
