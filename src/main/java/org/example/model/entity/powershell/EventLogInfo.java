package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class EventLogInfo {

    public static final String[] COLUMN_NAMES = {"EventID", "MachineName", "Data",
            "Index", "Category", "CategoryNumber", "EntryType",
            "Message", "Source", "ReplacementStrings", "InstanceId",
            "TimeGenerated", "TimeWritten", "UserName", "Site", "Container"};

    @JsonProperty("EventID")
    private String eventId;

    @JsonProperty("MachineName")
    private String machineName;

    @JsonProperty("Data")
    private List<String> data;

    @JsonProperty("Index")
    private String index;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("CategoryNumber")
    private String categoryNumber;

    @JsonProperty("EntryType")
    private String entryType;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("ReplacementStrings")
    private List<String> replacementStrings;

    @JsonProperty("InstanceId")
    private String instanceId;

    @JsonProperty("TimeGenerated")
    private String timeGenerated;

    @JsonProperty("TimeWritten")
    private String timeWritten;

    @JsonProperty("UserName")
    private String username;

    @JsonProperty("Site")
    private String site;

    @JsonProperty("Container")
    private String container;
}
