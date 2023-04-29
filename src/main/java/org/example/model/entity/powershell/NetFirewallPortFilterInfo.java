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
public class NetFirewallPortFilterInfo {

    public static final String[] COLUMN_NAMES = {"Status", "RemotePort", "IcmpType", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "CreationClassName", "LocalPort", "IsNegated", "DynamicTransport", "HealthState", "PSComputerName", "Description", "DynamicTarget", "CommunicationStatus", "SystemCreationClassName", "Name", "Protocol", "OperatingStatus", "ElementName", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions"};

    @JsonProperty("Status")
    private String status;

    @JsonProperty("RemotePort")
    private JsonNode remotePort;

    @JsonProperty("IcmpType")
    private String icmpType;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("LocalPort")
    private JsonNode localPort;

    @JsonProperty("IsNegated")
    private String isNegated;

    @JsonProperty("DynamicTransport")
    private String dynamicTransport;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DynamicTarget")
    private String dynamicTarget;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Protocol")
    private String protocol;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

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

}
