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
public class NetFirewallSecurityFilterInfo {

    public static final String[] COLUMN_NAMES = {"Status", "LocalUser", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "CreationClassName", "RemoteMachines", "RemoteUser", "IsNegated", "Authentication", "HealthState", "PSComputerName", "Description", "LocalUsers", "CommunicationStatus", "OverrideBlockRules", "RemoteMachine", "Encryption", "SystemCreationClassName", "Name", "RemoteUsers", "OperatingStatus", "ElementName", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions"};

    @JsonProperty("Status")
    private String status;

    @JsonProperty("LocalUser")
    private String localUser;

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

    @JsonProperty("RemoteMachines")
    private String remoteMachines;

    @JsonProperty("RemoteUser")
    private String remoteUser;

    @JsonProperty("IsNegated")
    private String isNegated;

    @JsonProperty("Authentication")
    private String authentication;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("LocalUsers")
    private String localUsers;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("OverrideBlockRules")
    private String overrideBlockRules;

    @JsonProperty("RemoteMachine")
    private String remoteMachine;

    @JsonProperty("Encryption")
    private String encryption;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("RemoteUsers")
    private String remoteUsers;

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
