package org.example.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class EventLogInfo {

    public static final String[] COLUMN_NAMES = {"EventID", "MachineName", "Data",
            "Index", "Category", "CategoryNumber", "EntryType",
            "Message", "Source", "ReplacementStrings", "InstanceId",
            "TimeGenerated", "TimeWritten", "Site", "Container"};

    private String eventId;
    private String machineName;
    private String data;
    private String index;
    private String category;
    private String categoryNumber;
    private String entryType;
    private String message;
    private String source;
    private String replacementStrings;
    private String instanceId;
    private String timeGenerated;
    private String timeWritten;
    private String site;
    private String container;
}
