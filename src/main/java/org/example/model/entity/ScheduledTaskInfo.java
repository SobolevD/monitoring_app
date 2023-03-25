package org.example.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledTaskInfo {

    public static final String[] COLUMN_NAMES = {"CimClass", "CimInstanceProperties", "CimSystemProperties",
            "State", "Actions", "Author", "Date",
            "Description", "Documentation", "Principal", "SecurityDescriptor",
            "Settings", "Source", "TaskName", "TaskPath", "Triggers", "URI", "Version", "PSComputerName"};

    @JsonProperty("CimClass")
    private JsonNode cimClass;

    @JsonProperty("CimInstanceProperties")
    private List<String> cimInstanceProperties;

    @JsonProperty("CimSystemProperties")
    private JsonNode cimSystemProperties;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Actions")
    private List<String> actions;

    @JsonProperty("Author")
    private String author;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Documentation")
    private String documentation;

    @JsonProperty("Principal")
    private JsonNode principal;

    @JsonProperty("SecurityDescriptor")
    private String securityDescriptor;

    @JsonProperty("Settings")
    private JsonNode settings;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("TaskName")
    private String taskName;

    @JsonProperty("TaskPath")
    private String taskPath;

    @JsonProperty("Triggers")
    private List<String> triggers;

    @JsonProperty("URI")
    private String uri;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("PSComputerName")
    private String psComputerName;
}
