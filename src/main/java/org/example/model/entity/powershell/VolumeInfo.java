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
public class VolumeInfo {
    public static final String[] COLUMN_NAMES = {"OperationalStatus", "HealthStatus", "DriveType", "FileSystemType", "DedupMode", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "AllocationUnitSize", "DriveLetter", "FileSystem", "FileSystemLabel", "Path", "Size", "SizeRemaining", "PSComputerName"};

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("DriveType")
    private String driveType;

    @JsonProperty("FileSystemType")
    private String fileSystemType;

    @JsonProperty("DedupMode")
    private String dedupMode;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("AllocationUnitSize")
    private String allocationUnitSize;

    @JsonProperty("DriveLetter")
    private String driveLetter;

    @JsonProperty("FileSystem")
    private String fileSystem;

    @JsonProperty("FileSystemLabel")
    private String fileSystemLabel;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("SizeRemaining")
    private String sizeRemaining;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
