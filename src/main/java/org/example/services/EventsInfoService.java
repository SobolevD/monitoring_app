package org.example.services;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.example.model.entity.EventLogGeneralInfo;
import org.example.model.entity.EventLogInfo;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class EventsInfoService {

    private static final String GET_EVENT_LOG_LIST_COMMAND = "Get-EventLog -List";
    private static final String GET_EVENT_LOG_COMMAND = "Get-EventLog \"%s\"";

    public List<EventLogGeneralInfo> getEventLogGeneralInfo()
            throws IOException, InterruptedException {
        List<EventLogGeneralInfo> eventLogGeneralInfo = new ArrayList<>();
        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInCsvFormat(GET_EVENT_LOG_LIST_COMMAND);

        Reader in = new FileReader(processResourcesFile);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(EventLogGeneralInfo.COLUMN_NAMES)
                .withFirstRecordAsHeader()
                .parse(in);

        int columnNum;

        for (CSVRecord record : records) {
            columnNum = 0;
            eventLogGeneralInfo.add(EventLogGeneralInfo.builder()
                    .entries(record.get(EventLogGeneralInfo.COLUMN_NAMES[columnNum]))
                    .logDisplayName(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .log(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .machineName(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .maximumKilobytes(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .overflowAction(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .minimumRetentionDays(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .enableRaisingEvents(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .synchronizingObject(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .source(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .site(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .container(record.get(EventLogGeneralInfo.COLUMN_NAMES[++columnNum]))
                    .build());
        }
        return eventLogGeneralInfo;
    }

    public List<EventLogInfo> getEventLogInfo(String logName)
            throws IOException, InterruptedException {
        List<EventLogInfo> eventLogInfo = new ArrayList<>();

        String command = String.format(GET_EVENT_LOG_COMMAND, logName);

        File processResourcesFile = CommandExecutor.executeWithPowershellAndGetOutputInCsvFormat(command);

        Reader in = new FileReader(processResourcesFile);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(EventLogInfo.COLUMN_NAMES)
                .withFirstRecordAsHeader()
                .parse(in);

        int columnNum;

        for (CSVRecord record : records) {
            columnNum = 0;
            eventLogInfo.add(EventLogInfo.builder()
                    .eventId(record.get(EventLogInfo.COLUMN_NAMES[columnNum]))
                    .machineName(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .data(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .index(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .category(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .categoryNumber(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .entryType(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .message(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .source(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .replacementStrings(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .instanceId(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .timeGenerated(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .timeWritten(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .site(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .container(record.get(EventLogInfo.COLUMN_NAMES[++columnNum]))
                    .build());
        }
        return eventLogInfo;
    }
}
