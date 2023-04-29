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

    public static final String[] COLUMN_NAMES = {"TransitioningToState", "LocalAddress", "Status", "RemotePort", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "AppliedSetting", "OtherEnabledState", "LocalPort", "EnabledDefault", "AvailableRequestedStates", "State", "Directionality", "HealthState", "CreationTime", "OwningProcess", "PSComputerName", "EnabledState", "RemoteAddress", "Description", "OffloadState", "CommunicationStatus", "Name", "RequestedState", "OperatingStatus", "TimeOfLastStateChange", "ElementName", "DetailedStatus", "InstanceID", "AggregationBehavior", "StatusDescriptions"};

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("LocalAddress")
    private String localAddress;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("RemotePort")
    private String remotePort;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("AppliedSetting")
    private String appliedSetting;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("LocalPort")
    private String localPort;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Directionality")
    private String directionality;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("CreationTime")
    private String creationTime;

    @JsonProperty("OwningProcess")
    private String owningProcess;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("RemoteAddress")
    private String remoteAddress;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("OffloadState")
    private String offloadState;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("AggregationBehavior")
    private String aggregationBehavior;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

}
