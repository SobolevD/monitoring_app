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
public class NetIPv6ProtocolInfo {
    public static final String[] COLUMN_NAMES = {"IcmpRedirects", "SourceRoutingBehavior", "DhcpMediaSense", "MediaSenseEventLog", "MldLevel", "MldVersion", "MulticastForwarding", "GroupForwardedFragments", "RandomizeIdentifiers", "AddressMaskReply", "UseTemporaryAddresses", "DeadGatewayDetection", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault", "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange", "TransitioningToState", "CreationClassName", "SystemCreationClassName", "SystemName", "NameFormat", "OtherTypeDescription", "ProtocolIFType", "ProtocolType", "DefaultHopLimit", "NeighborCacheLimit", "ReassemblyLimit", "RouteCacheLimit", "MaxDadAttempts", "MaxPreferredLifetime", "MaxRandomTime", "MaxValidLifetime", "RegenerateTime", "PSComputerName"};

    @JsonProperty("IcmpRedirects")
    private String icmpRedirects;

    @JsonProperty("SourceRoutingBehavior")
    private String sourceRoutingBehavior;

    @JsonProperty("DhcpMediaSense")
    private String dhcpMediaSense;

    @JsonProperty("MediaSenseEventLog")
    private String mediaSenseEventLog;

    @JsonProperty("MldLevel")
    private String mldLevel;

    @JsonProperty("MldVersion")
    private String mldVersion;

    @JsonProperty("MulticastForwarding")
    private String multicastForwarding;

    @JsonProperty("GroupForwardedFragments")
    private String groupForwardedFragments;

    @JsonProperty("RandomizeIdentifiers")
    private String randomizeIdentifiers;

    @JsonProperty("AddressMaskReply")
    private String addressMaskReply;

    @JsonProperty("UseTemporaryAddresses")
    private String useTemporaryAddresses;

    @JsonProperty("DeadGatewayDetection")
    private String deadGatewayDetection;

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

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("OtherTypeDescription")
    private String otherTypeDescription;

    @JsonProperty("ProtocolIFType")
    private String protocolIFType;

    @JsonProperty("ProtocolType")
    private String protocolType;

    @JsonProperty("DefaultHopLimit")
    private String defaultHopLimit;

    @JsonProperty("NeighborCacheLimit")
    private String neighborCacheLimit;

    @JsonProperty("ReassemblyLimit")
    private String reassemblyLimit;

    @JsonProperty("RouteCacheLimit")
    private String routeCacheLimit;

    @JsonProperty("MaxDadAttempts")
    private String maxDadAttempts;

    @JsonProperty("MaxPreferredLifetime")
    private String maxPreferredLifetime;

    @JsonProperty("MaxRandomTime")
    private String maxRandomTime;

    @JsonProperty("MaxValidLifetime")
    private String maxValidLifetime;

    @JsonProperty("RegenerateTime")
    private String regenerateTime;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
