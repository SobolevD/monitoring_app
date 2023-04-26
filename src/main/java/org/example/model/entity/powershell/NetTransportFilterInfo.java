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
public class NetTransportFilterInfo {
    public static final String[] COLUMN_NAMES = {"Protocol", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "CreationClassName", "IsNegated", "SystemCreationClassName", "SystemName", "DestinationPrefix", "LocalPortEnd", "LocalPortStart", "RemotePortEnd", "RemotePortStart", "SettingName", "PSComputerName"};

    @JsonProperty("Protocol")
    private String protocol;

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

    @JsonProperty("DestinationPrefix")
    private String destinationPrefix;

    @JsonProperty("LocalPortEnd")
    private String localPortEnd;

    @JsonProperty("LocalPortStart")
    private String localPortStart;

    @JsonProperty("RemotePortEnd")
    private String remotePortEnd;

    @JsonProperty("RemotePortStart")
    private String remotePortStart;

    @JsonProperty("SettingName")
    private String settingName;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
