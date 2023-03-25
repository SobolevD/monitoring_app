package org.example.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelService {

    public HSSFWorkbook createBlankReport() {
        return new HSSFWorkbook();
    }

    public File saveReportAndGetFile(HSSFWorkbook report, String filename) throws IOException {
        File file = File.createTempFile(filename + "_", "_report.xls");
        FileOutputStream outFile = new FileOutputStream(file);
        report.write(outFile);
        report.close();
        file.deleteOnExit();
        return file;
    }

    public void addToXls(HSSFWorkbook workbook,
                         String sheetName,
                         String[] columnNames,
                         List<?> objects)
            throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        String objectsAsJson = mapper.writeValueAsString(objects);
        JsonNode objectsJsonArray = new ObjectMapper().readTree(objectsAsJson);

        HSSFSheet sheet = workbook.createSheet(sheetName);

        int rownum = 0;
        int cellNum = 0;

        Row row = sheet.createRow(rownum++);
        Cell cell;

        for (String columnName : columnNames) {
            cell = row.createCell(cellNum++);
            cell.setCellValue(columnName);
        }

        for (JsonNode objectJson : objectsJsonArray) {
            cellNum = 0;
            row = sheet.createRow(rownum++);

            for (JsonNode objectField : objectJson) {
                cell = row.createCell(cellNum++);

                if (objectField.isObject() || objectField.isArray()) {
                    String value = objectField.toString();

                    if (value.length() > 32767) {
                        value = value.substring(0, 32767);
                    }

                    cell.setCellValue(value);
                } else {
                    cell.setCellValue(objectField.asText());
                }

            }
        }
    }


}