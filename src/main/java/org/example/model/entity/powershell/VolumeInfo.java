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

    public static final String[] COLUMN_NAMES = {"FileSystemLabel", "PSComputerName", "Path", "PassThroughServer", "PassThroughIds", "ObjectId", "UniqueId", "Size", "DedupMode", "PassThroughNamespace", "OperationalStatus", "HealthStatus", "PassThroughClass", "SizeRemaining", "DriveLetter", "FileSystemType", "FileSystem", "DriveType", "AllocationUnitSize"};

    @JsonProperty("FileSystemLabel")
    private String fileSystemLabel;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("DedupMode")
    private String dedupMode;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("SizeRemaining")
    private String sizeRemaining;

    @JsonProperty("DriveLetter")
    private String driveLetter;

    @JsonProperty("FileSystemType")
    private String fileSystemType;

    @JsonProperty("FileSystem")
    private String fileSystem;

    @JsonProperty("DriveType")
    private String driveType;

    @JsonProperty("AllocationUnitSize")
    private String allocationUnitSize;

}
