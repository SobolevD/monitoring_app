package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BCStatusInfo {

    public static final String[] COLUMN_NAMES = {"HashCache", "PSComputerName", "DataCache", "Status", "BranchCacheServiceStartType", "Description", "ContentServerConfiguration", "CommunicationStatus", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "Name", "OperatingStatus", "BranchCacheIsEnabled", "NetworkConfiguration", "ElementName", "DetailedStatus", "HostedCacheServerConfiguration", "InstanceID", "StatusDescriptions", "BranchCacheServiceStatus", "HealthState", "ClientConfiguration"};

    @JsonProperty("HashCache")
    private JsonNode hashCache;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("DataCache")
    private JsonNode dataCache;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("BranchCacheServiceStartType")
    private String branchCacheServiceStartType;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ContentServerConfiguration")
    private JsonNode contentServerConfiguration;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

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

    @JsonProperty("BranchCacheIsEnabled")
    private String branchCacheIsEnabled;

    @JsonProperty("NetworkConfiguration")
    private JsonNode networkConfiguration;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("HostedCacheServerConfiguration")
    private JsonNode hostedCacheServerConfiguration;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("BranchCacheServiceStatus")
    private String branchCacheServiceStatus;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("ClientConfiguration")
    private JsonNode clientConfiguration;

}
