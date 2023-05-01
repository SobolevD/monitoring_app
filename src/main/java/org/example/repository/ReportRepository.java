package org.example.repository;

import org.example.model.common.Report;

import java.io.File;

public interface ReportRepository {
    void saveReport(File zipReport, String username);
}
