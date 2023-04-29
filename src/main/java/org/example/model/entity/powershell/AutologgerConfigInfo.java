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

    public static final String[] COLUMN_NAMES = {"FileCount", "Status", "FileMax", "LoggingModeNames", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "ClockType", "BufferSize", "MinimumBuffers", "InitStatus", "LocalFilePath", "MaximumBuffers", "DisableRealtimePersistence", "HealthState", "PSComputerName", "Description", "Start", "LogFileMode", "CommunicationStatus", "Guid", "Name", "FlushTimer", "OperatingStatus", "ElementName", "DetailedStatus", "InstanceID", "MaximumFileSize", "StatusDescriptions"};

    @JsonProperty("FileCount")
    private String fileCount;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("FileMax")
    private String fileMax;

    @JsonProperty("LoggingModeNames")
    private String loggingModeNames;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("ClockType")
    private String clockType;

    @JsonProperty("BufferSize")
    private String bufferSize;

    @JsonProperty("MinimumBuffers")
    private String minimumBuffers;

    @JsonProperty("InitStatus")
    private String initStatus;

    @JsonProperty("LocalFilePath")
    private String localFilePath;

    @JsonProperty("MaximumBuffers")
    private String maximumBuffers;

    @JsonProperty("DisableRealtimePersistence")
    private String disableRealtimePersistence;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Start")
    private String start;

    @JsonProperty("LogFileMode")
    private String logFileMode;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("Guid")
    private String guid;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("FlushTimer")
    private String flushTimer;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("MaximumFileSize")
    private String maximumFileSize;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

}
