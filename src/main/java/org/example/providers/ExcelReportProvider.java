package org.example.providers;

import org.example.model.ObjectMetadata;
import org.example.model.common.Report;

import java.io.IOException;

public interface ExcelReportProvider {
    Report getReport(ObjectMetadata objectMetadata, String sheetName, String workBookName)
            throws IOException, InterruptedException;
}
