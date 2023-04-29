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
public class NetFirewallAddressFilterInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "LocalAddress", "RemoteAddress", "Status", "RemoteIP", "Description", "CommunicationStatus", "SystemCreationClassName", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "Name", "CreationClassName", "OperatingStatus", "IsNegated", "LocalIP", "ElementName", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions", "HealthState"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("LocalAddress")
    private JsonNode localAddress;

    @JsonProperty("RemoteAddress")
    private JsonNode remoteAddress;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("RemoteIP")
    private JsonNode remoteIP;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

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

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("IsNegated")
    private String isNegated;

    @JsonProperty("LocalIP")
    private String localIP;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("HealthState")
    private String healthState;

}
