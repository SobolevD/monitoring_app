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
public class NetTCPConnectionInfo {
    public static final String[] COLUMN_NAMES = {"State", "AppliedSetting", "OffloadState", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault", "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange", "TransitioningToState", "AggregationBehavior", "Directionality", "CreationTime", "LocalAddress", "LocalPort", "OwningProcess", "RemoteAddress", "RemotePort", "PSComputerName"};

    @JsonProperty("State")
    private String state;

    @JsonProperty("AppliedSetting")
    private String appliedSetting;

    @JsonProperty("OffloadState")
    private String offloadState;

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

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("AggregationBehavior")
    private String aggregationBehavior;

    @JsonProperty("Directionality")
    private String directionality;

    @JsonProperty("CreationTime")
    private String creationTime;

    @JsonProperty("LocalAddress")
    private String localAddress;

    @JsonProperty("LocalPort")
    private String localPort;

    @JsonProperty("OwningProcess")
    private String owningProcess;

    @JsonProperty("RemoteAddress")
    private String remoteAddress;

    @JsonProperty("RemotePort")
    private String remotePort;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
