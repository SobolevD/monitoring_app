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
public class BCHashCacheInfo {
    public static final String[] COLUMN_NAMES = {"Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "CacheFileDirectoryPath", "CurrentSizeOnDiskAsNumberOfBytes", "MaxCacheSizeAsNumberOfBytes", "MaxCacheSizeAsPercentageOfDiskVolume", "CurrentActiveCacheSize", "PSComputerName"};

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

    @JsonProperty("CacheFileDirectoryPath")
    private String cacheFileDirectoryPath;

    @JsonProperty("CurrentSizeOnDiskAsNumberOfBytes")
    private String currentSizeOnDiskAsNumberOfBytes;

    @JsonProperty("MaxCacheSizeAsNumberOfBytes")
    private String maxCacheSizeAsNumberOfBytes;

    @JsonProperty("MaxCacheSizeAsPercentageOfDiskVolume")
    private String maxCacheSizeAsPercentageOfDiskVolume;

    @JsonProperty("CurrentActiveCacheSize")
    private String currentActiveCacheSize;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
