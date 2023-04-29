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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Status", "Description", "CommunicationStatus", "CurrentActiveCacheSize", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "Name", "OperatingStatus", "MaxCacheSizeAsPercentageOfDiskVolume", "ElementName", "DetailedStatus", "InstanceID", "CurrentSizeOnDiskAsNumberOfBytes", "StatusDescriptions", "CacheFileDirectoryPath", "MaxCacheSizeAsNumberOfBytes", "HealthState"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("CurrentActiveCacheSize")
    private String currentActiveCacheSize;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("MaxCacheSizeAsPercentageOfDiskVolume")
    private String maxCacheSizeAsPercentageOfDiskVolume;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CurrentSizeOnDiskAsNumberOfBytes")
    private String currentSizeOnDiskAsNumberOfBytes;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("CacheFileDirectoryPath")
    private String cacheFileDirectoryPath;

    @JsonProperty("MaxCacheSizeAsNumberOfBytes")
    private String maxCacheSizeAsNumberOfBytes;

    @JsonProperty("HealthState")
    private String healthState;

}
