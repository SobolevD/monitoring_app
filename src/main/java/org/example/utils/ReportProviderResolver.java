package org.example.utils;

import org.example.providers.ExcelReportProvider;
import org.example.providers.impl.EventExcelReportProvider;
import org.example.providers.impl.WmiObjectsExcelReportProvider;

import static org.example.common.Groups.EVENT_LOG;
import static org.example.common.Groups.WMI_OBJECTS;

public abstract class ReportProviderResolver {
    public static ExcelReportProvider resolve(String group) {
        switch (group) {
            case EVENT_LOG -> {
                return new EventExcelReportProvider();
            }
            case WMI_OBJECTS -> {
                return new WmiObjectsExcelReportProvider();
            }
            default -> {
                throw new RuntimeException("Unable to resolve report provider for group: " + group);
            }
        }
    }
}
