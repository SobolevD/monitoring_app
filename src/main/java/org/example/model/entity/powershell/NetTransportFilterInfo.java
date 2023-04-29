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

    public static final String[] COLUMN_NAMES = {"Status", "RemotePortStart", "OperationalStatus", "PrimaryStatus", "RemotePortEnd", "Caption", "InstallDate", "CreationClassName", "IsNegated", "HealthState", "PSComputerName", "Description", "DestinationPrefix", "SettingName", "CommunicationStatus", "SystemCreationClassName", "Name", "Protocol", "OperatingStatus", "LocalPortStart", "ElementName", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions", "LocalPortEnd"};

    @JsonProperty("Status")
    private String status;

    @JsonProperty("RemotePortStart")
    private String remotePortStart;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("RemotePortEnd")
    private String remotePortEnd;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("IsNegated")
    private String isNegated;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DestinationPrefix")
    private String destinationPrefix;

    @JsonProperty("SettingName")
    private String settingName;

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

    @JsonProperty("LocalPortStart")
    private String localPortStart;

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

    @JsonProperty("LocalPortEnd")
    private String localPortEnd;

}
