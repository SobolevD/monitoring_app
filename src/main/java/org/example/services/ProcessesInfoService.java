package org.example.services;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.example.model.MemoryUsage;
import org.example.model.ProcessInfo;
import org.example.utils.CommandExecutor;
import org.example.utils.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.example.common.Constants.SYS_32_FOLDER;
import static org.example.common.Constants.WIN_DIR;

public class ProcessesInfoService {

    private static final String GET_PROCESSES_INFO_CSV_COMMAND =
            "%s\\%s\\tasklist /v /fo csv /fi \"USERNAME eq %s\"";

    public List<ProcessInfo> getInfo(String username) {

        List<ProcessInfo> processesInfo = new ArrayList<>();
        String command = String.format(GET_PROCESSES_INFO_CSV_COMMAND, WIN_DIR, SYS_32_FOLDER, username);

        try (BufferedReader processesRawInfo = CommandExecutor.executeAndGetOutput(command)) {
            File processesInfoCsv = FileHelper.collectConsoleOutput(processesRawInfo);

            Reader in = new FileReader(processesInfoCsv);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader("Image Name","PID","Session Name",
                            "Session#","Mem Usage","Status",
                            "User Name","CPU Time","Window Title")
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord record : records) {
                processesInfo.add(ProcessInfo.builder()
                        .imageName(record.get("Image Name"))
                        .pid(Integer.parseInt(record.get("PID")))
                        .sessionName(record.get("Session Name"))
                        .sessionNum(Short.parseShort(record.get("Session#")))
                        .memoryUsage(record.get("Mem Usage"))
                        .status(record.get("Status"))
                        .username(record.get("User Name"))
                        .cpuTime(record.get("CPU Time"))
                        .title(record.get("Window Title"))
                        .build());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return processesInfo;
    }
}
