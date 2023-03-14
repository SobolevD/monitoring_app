package org.example.services;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.example.model.entity.EventLogGeneralInfo;
import org.example.model.entity.EventLogInfo;
import org.example.model.entity.ProcessResourcesInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelService {

    public HSSFWorkbook createEmptyReport() {
        return new HSSFWorkbook();
    }

    public File saveReport(HSSFWorkbook report, String filename) throws IOException {
        File file = File.createTempFile(filename, ".xls");
        FileOutputStream outFile = new FileOutputStream(file);
        report.write(outFile);
        report.close();
        file.deleteOnExit();
        return file;
    }

    public void writeProcessesResources(HSSFWorkbook workbook,
                                        List<ProcessResourcesInfo> processResourceInfos,
                                        String sheetName)
            throws IOException {
        HSSFSheet sheet = workbook.createSheet(sheetName);

        int rownum = 0;
        int cellNum = -1;
        Row row = sheet.createRow(rownum);

        Cell cell;

        for (String columnName : ProcessResourcesInfo.COLUMN_NAMES) {
            cell = row.createCell(++cellNum);
            cell.setCellValue(columnName);
        }

        for (ProcessResourcesInfo processResource : processResourceInfos) {
            cellNum = 0;
            row = sheet.createRow(++rownum);
            cell = row.createCell(cellNum);
            cell.setCellValue(processResource.getName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getSystemIndex());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getHandles());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getVirtualMemory());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getWs());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPhysicalMemoryUsage());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getNumberOfProcessesInMemory());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPath());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getCompany());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getCpu());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getFileVersion());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getProductVersion());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getDescription());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getProduct());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getNounName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getBasePriority());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getExitCode());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getHasExited());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getExitTime());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getHandle());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getSafeHandle());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getHandleCount());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPid());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getMachineName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getMainWindowHandle());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getMainWindowTitle());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getMainModule());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getMaxWorkingSet());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getMinWorkingSet());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getModules());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getNonpagedSystemMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getNonpagedSystemMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPagedMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPagedMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPagedSystemMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPagedSystemMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPeakPagedMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPeakPagedMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPeakWorkingSet());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPeakWorkingSet64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPeakVirtualMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPeakVirtualMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPriorityBoostEnabled());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPriorityClass());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPrivateMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPrivateMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getPrivilegedProcessorTime());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getProcessName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getProcessorAffinity());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getResponding());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getSessionId());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getStartInfo());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getStartTime());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getSynchronizingObject());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getThreads());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getTotalProcessorTime());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getUserProcessorTime());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getVirtualMemorySize());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getVirtualMemorySize64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getEnableRaisingEvents());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getStandardInput());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getStandardOutput());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getStandardError());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getWorkingSet());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getWorkingSet64());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getSite());
            cell = row.createCell(++cellNum);
            cell.setCellValue(processResource.getContainer());
        }
    }

    public void writeEventLogGeneralInfo(HSSFWorkbook workbook,
                                         List<EventLogGeneralInfo> eventLogGeneralInfos)
            throws IOException {
        HSSFSheet sheet = workbook.createSheet("Event log general info");

        int rownum = 0;
        int cellNum = -1;
        Row row = sheet.createRow(rownum);

        Cell cell;

        for (String columnName : EventLogGeneralInfo.COLUMN_NAMES) {
            cell = row.createCell(++cellNum);
            cell.setCellValue(columnName);
        }

        for (EventLogGeneralInfo eventLogGeneralInfoRecord : eventLogGeneralInfos) {
            cellNum = 0;
            row = sheet.createRow(++rownum);
            cell = row.createCell(cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getEntries());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getLogDisplayName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getLog());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getMachineName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getMaximumKilobytes());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getOverflowAction());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getMinimumRetentionDays());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getEnableRaisingEvents());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getSynchronizingObject());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getSource());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getSite());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogGeneralInfoRecord.getContainer());
        }
    }

    public void writeEventLogInfo(HSSFWorkbook workbook,
                                  List<EventLogInfo> eventLogInfos,
                                  String eventLogName)
            throws IOException {
        HSSFSheet sheet = workbook.createSheet(String.format("Event log '%s' info", eventLogName));

        int rownum = 0;
        int cellNum = -1;
        Row row = sheet.createRow(rownum);

        Cell cell;

        for (String columnName : EventLogInfo.COLUMN_NAMES) {
            cell = row.createCell(++cellNum);
            cell.setCellValue(columnName);
        }

        for (EventLogInfo eventLogInfoRecord : eventLogInfos) {
            cellNum = 0;
            row = sheet.createRow(++rownum);
            cell = row.createCell(cellNum);
            cell.setCellValue(eventLogInfoRecord.getEventId());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getMachineName());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getData());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getIndex());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getCategory());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getCategoryNumber());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getEntryType());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getMessage());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getSource());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getReplacementStrings());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getInstanceId());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getTimeGenerated());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getTimeWritten());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getSite());
            cell = row.createCell(++cellNum);
            cell.setCellValue(eventLogInfoRecord.getContainer());
        }
    }
}
