package org.example.services;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.example.model.ProcessInfo;
import org.example.model.ProcessResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static org.example.common.Constants.CURRENT_USERNAME;
import static org.example.model.ProcessResources.COLUMN_NAMES;

public class ExcelService {

    public File writeProcessesResources(List<ProcessResources> processResources, String filename)
            throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(String.format("Process resources for user '%s'", CURRENT_USERNAME));

        int rownum = 0;
        int cellNum = -1;
        Row row = sheet.createRow(rownum);

        Cell cell;

        for (String columnName : COLUMN_NAMES) {
            cell = row.createCell(++cellNum);
            cell.setCellValue(columnName);
        }

        for (ProcessResources processResource : processResources) {
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

        File file = File.createTempFile(filename, ".xls");
        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        workbook.close();
        file.deleteOnExit();
        return file;
    }
}
