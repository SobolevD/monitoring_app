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
public class NetFirewallPortFilterInfo {
    public static final String[] COLUMN_NAMES = {"Protocol", "LocalPort", "RemotePort", "IcmpType", "DynamicTarget", "DynamicTransport", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "CreationClassName", "IsNegated", "SystemCreationClassName", "SystemName", "PSComputerName"};

    @JsonProperty("Protocol")
    private String protocol;

    @JsonProperty("LocalPort")
    private String localPort;

    @JsonProperty("RemotePort")
    private String remotePort;

    @JsonProperty("IcmpType")
    private String icmpType;

    @JsonProperty("DynamicTarget")
    private String dynamicTarget;

    @JsonProperty("DynamicTransport")
    private String dynamicTransport;

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

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("IsNegated")
    private String isNegated;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
