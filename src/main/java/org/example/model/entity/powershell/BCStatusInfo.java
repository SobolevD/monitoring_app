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
public class BCStatusInfo {
    public static final String[] COLUMN_NAMES = {"BranchCacheServiceStatus", "BranchCacheServiceStartType", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "BranchCacheIsEnabled", "ClientConfiguration", "ContentServerConfiguration", "DataCache", "HashCache", "HostedCacheServerConfiguration", "NetworkConfiguration", "PSComputerName"};



    @JsonProperty("BranchCacheServiceStatus")
    private String branchCacheServiceStatus;

    @JsonProperty("BranchCacheServiceStartType")
    private String branchCacheServiceStartType;

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

    @JsonProperty("BranchCacheIsEnabled")
    private String branchCacheIsEnabled;

    @JsonProperty("ClientConfiguration")
    private String clientConfiguration;

    @JsonProperty("ContentServerConfiguration")
    private String contentServerConfiguration;

    @JsonProperty("DataCache")
    private String dataCache;

    @JsonProperty("HashCache")
    private String hashCache;

    @JsonProperty("HostedCacheServerConfiguration")
    private String hostedCacheServerConfiguration;

    @JsonProperty("NetworkConfiguration")
    private String networkConfiguration;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
