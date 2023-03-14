package org.example.services;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.example.model.TrustedProcesses;
import org.example.model.entity.ProcessResourcesInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.model.entity.ProcessResourcesInfo.COLUMN_NAMES;

public class ProcessesInfoService {

    private static final String GET_PROCESS_RESOURCES_COMMAND = "Get-Process | ? {$_.SI -eq (Get-Process -PID $PID).SessionId}";

    public List<ProcessResourcesInfo> getProcessResources() throws IOException, InterruptedException {
        List<ProcessResourcesInfo> processResourceInfos = new ArrayList<>();
        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInCsvFormat(GET_PROCESS_RESOURCES_COMMAND);

        Reader in = new FileReader(processResourcesFile);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(COLUMN_NAMES)
                .withFirstRecordAsHeader()
                .parse(in);

        int columnNum;

        for (CSVRecord record : records) {
            columnNum = 0;
            processResourceInfos.add(ProcessResourcesInfo.builder()
                            .name(record.get(COLUMN_NAMES[columnNum]))
                            .systemIndex(record.get(COLUMN_NAMES[++columnNum]))
                            .handles(record.get(COLUMN_NAMES[++columnNum]))
                            .virtualMemory(record.get(COLUMN_NAMES[++columnNum]))
                            .ws(record.get(COLUMN_NAMES[++columnNum]))
                            .physicalMemoryUsage(record.get(COLUMN_NAMES[++columnNum]))
                            .numberOfProcessesInMemory(record.get(COLUMN_NAMES[++columnNum]))
                            .path(record.get(COLUMN_NAMES[++columnNum]))
                            .company(record.get(COLUMN_NAMES[++columnNum]))
                            .cpu(record.get(COLUMN_NAMES[++columnNum]))
                            .fileVersion(record.get(COLUMN_NAMES[++columnNum]))
                            .productVersion(record.get(COLUMN_NAMES[++columnNum]))
                            .description(record.get(COLUMN_NAMES[++columnNum]))
                            .product(record.get(COLUMN_NAMES[++columnNum]))
                            .nounName(record.get(COLUMN_NAMES[++columnNum]))
                            .basePriority(record.get(COLUMN_NAMES[++columnNum]))
                            .exitCode(record.get(COLUMN_NAMES[++columnNum]))
                            .hasExited(record.get(COLUMN_NAMES[++columnNum]))
                            .exitTime(record.get(COLUMN_NAMES[++columnNum]))
                            .handle(record.get(COLUMN_NAMES[++columnNum]))
                            .safeHandle(record.get(COLUMN_NAMES[++columnNum]))
                            .handleCount(record.get(COLUMN_NAMES[++columnNum]))
                            .pid(record.get(COLUMN_NAMES[++columnNum]))
                            .machineName(record.get(COLUMN_NAMES[++columnNum]))
                            .mainWindowHandle(record.get(COLUMN_NAMES[++columnNum]))
                            .mainWindowTitle(record.get(COLUMN_NAMES[++columnNum]))
                            .mainModule(record.get(COLUMN_NAMES[++columnNum]))
                            .maxWorkingSet(record.get(COLUMN_NAMES[++columnNum]))
                            .minWorkingSet(record.get(COLUMN_NAMES[++columnNum]))
                            .modules(record.get(COLUMN_NAMES[++columnNum]))
                            .nonpagedSystemMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .nonpagedSystemMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .pagedMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .pagedMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .pagedSystemMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .pagedSystemMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .peakPagedMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .peakPagedMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .peakWorkingSet(record.get(COLUMN_NAMES[++columnNum]))
                            .peakWorkingSet64(record.get(COLUMN_NAMES[++columnNum]))
                            .peakVirtualMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .peakVirtualMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .priorityBoostEnabled(record.get(COLUMN_NAMES[++columnNum]))
                            .priorityClass(record.get(COLUMN_NAMES[++columnNum]))
                            .privateMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .privateMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .privilegedProcessorTime(record.get(COLUMN_NAMES[++columnNum]))
                            .processName(record.get(COLUMN_NAMES[++columnNum]))
                            .processorAffinity(record.get(COLUMN_NAMES[++columnNum]))
                            .responding(record.get(COLUMN_NAMES[++columnNum]))
                            .sessionId(record.get(COLUMN_NAMES[++columnNum]))
                            .startInfo(record.get(COLUMN_NAMES[++columnNum]))
                            .startTime(record.get(COLUMN_NAMES[++columnNum]))
                            .synchronizingObject(record.get(COLUMN_NAMES[++columnNum]))
                            .threads(record.get(COLUMN_NAMES[++columnNum]))
                            .totalProcessorTime(record.get(COLUMN_NAMES[++columnNum]))
                            .userProcessorTime(record.get(COLUMN_NAMES[++columnNum]))
                            .virtualMemorySize(record.get(COLUMN_NAMES[++columnNum]))
                            .virtualMemorySize64(record.get(COLUMN_NAMES[++columnNum]))
                            .enableRaisingEvents(record.get(COLUMN_NAMES[++columnNum]))
                            .standardInput(record.get(COLUMN_NAMES[++columnNum]))
                            .standardOutput(record.get(COLUMN_NAMES[++columnNum]))
                            .standardError(record.get(COLUMN_NAMES[++columnNum]))
                            .workingSet(record.get(COLUMN_NAMES[++columnNum]))
                            .workingSet64(record.get(COLUMN_NAMES[++columnNum]))
                            .site(record.get(COLUMN_NAMES[++columnNum]))
                            .container(record.get(COLUMN_NAMES[++columnNum]))
                    .build());
        }
        return processResourceInfos;
    }

    public List<ProcessResourcesInfo> getUntrustedProcesses(List<ProcessResourcesInfo> processResourcesInfoToFilter,
                                                            TrustedProcesses trustedProcesses) {
        return processResourcesInfoToFilter.stream()
                .filter(processResourcesInfo -> !trustedProcesses.containsProcessName(processResourcesInfo.getProcessName()))
                .filter(processResourcesInfo -> !trustedProcesses.containsPathPrefix(processResourcesInfo.getPath()))
                .filter(processResourcesInfo -> !trustedProcesses.containsCompany(processResourcesInfo.getCompany()))
                .collect(Collectors.toList());
    }
}
