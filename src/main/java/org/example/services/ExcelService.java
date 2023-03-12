package org.example.services;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.example.model.ProcessInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static org.example.common.Constants.CURRENT_USERNAME;

public class ExcelService {
    public File writeProcessesInfo(List<ProcessInfo> processesInfo) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(String.format("Processes info for user '%s'", CURRENT_USERNAME));

        int rownum = 0;
        Row row = sheet.createRow(rownum);

        Cell cell = row.createCell(0);
        cell.setCellValue("Image name");
        cell = row.createCell(1);
        cell.setCellValue("PID");
        cell = row.createCell(2);
        cell.setCellValue("Session name");
        cell = row.createCell(3);
        cell.setCellValue("Session#");
        cell = row.createCell(4);
        cell.setCellValue("Memory usage");
        cell = row.createCell(5);
        cell.setCellValue("Status");
        cell = row.createCell(6);
        cell.setCellValue("Username");
        cell = row.createCell(7);
        cell.setCellValue("CPU time");
        cell = row.createCell(8);
        cell.setCellValue("Window title");

        for (ProcessInfo processInfo : processesInfo) {
            row = sheet.createRow(++rownum);
            cell = row.createCell(0);
            cell.setCellValue(processInfo.getImageName());
            cell = row.createCell(1);
            cell.setCellValue(processInfo.getPid());
            cell = row.createCell(2);
            cell.setCellValue(processInfo.getSessionName());
            cell = row.createCell(3);
            cell.setCellValue(processInfo.getSessionNum());
            cell = row.createCell(4);
            cell.setCellValue(processInfo.getMemoryUsage());
            cell = row.createCell(5);
            cell.setCellValue(processInfo.getStatus());
            cell = row.createCell(6);
            cell.setCellValue(processInfo.getUsername());
            cell = row.createCell(7);
            cell.setCellValue(processInfo.getCpuTime());
            cell = row.createCell(8);
            cell.setCellValue(processInfo.getTitle());
        }

        File file = new File("C:\\Users\\dmso0321\\Desktop\\devbox\\processesInfo.xls");
        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        workbook.close();
        return file;
    }
}
