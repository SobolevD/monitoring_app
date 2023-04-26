package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutologgerConfigInfo {
    public static final String[] COLUMN_NAMES = {"LogFileMode", "LoggingModeNames", "ClockType", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "BufferSize", "DisableRealtimePersistence", "FileCount", "FileMax", "FlushTimer", "Guid", "InitStatus", "LocalFilePath", "MaximumBuffers", "MaximumFileSize", "MinimumBuffers", "Start", "PSComputerName"};



    @JsonProperty("LogFileMode")
    private String logFileMode;

    @JsonProperty("LoggingModeNames")
    private String loggingModeNames;

    @JsonProperty("ClockType")
    private String clockType;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("BufferSize")
    private String bufferSize;

    @JsonProperty("DisableRealtimePersistence")
    private String disableRealtimePersistence;

    @JsonProperty("FileCount")
    private String fileCount;

    @JsonProperty("FileMax")
    private String fileMax;

    @JsonProperty("FlushTimer")
    private String flushTimer;

    @JsonProperty("Guid")
    private String guid;

    @JsonProperty("InitStatus")
    private String initStatus;

    @JsonProperty("LocalFilePath")
    private String localFilePath;

    @JsonProperty("MaximumBuffers")
    private String maximumBuffers;

    @JsonProperty("MaximumFileSize")
    private String maximumFileSize;

    @JsonProperty("MinimumBuffers")
    private String minimumBuffers;

    @JsonProperty("Start")
    private String start;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
