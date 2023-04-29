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
public class NetIPv6ProtocolInfo {

    public static final String[] COLUMN_NAMES = {"Status", "OperationalStatus", "RouteCacheLimit", "MaxDadAttempts", "DeadGatewayDetection", "OtherEnabledState", "MaxRandomTime", "UseTemporaryAddresses", "MulticastForwarding", "NeighborCacheLimit", "DhcpMediaSense", "MaxValidLifetime", "PSComputerName", "AddressMaskReply", "RandomizeIdentifiers", "MaxPreferredLifetime", "DefaultHopLimit", "MldVersion", "RequestedState", "OperatingStatus", "TimeOfLastStateChange", "ElementName", "ProtocolIFType", "DetailedStatus", "SystemName", "InstanceID", "IcmpRedirects", "StatusDescriptions", "MldLevel", "TransitioningToState", "GroupForwardedFragments", "PrimaryStatus", "Caption", "InstallDate", "OtherTypeDescription", "CreationClassName", "EnabledDefault", "ProtocolType", "AvailableRequestedStates", "HealthState", "EnabledState", "ReassemblyLimit", "Description", "CommunicationStatus", "NameFormat", "SystemCreationClassName", "SourceRoutingBehavior", "Name", "MediaSenseEventLog", "RegenerateTime"};

    @JsonProperty("Status")
    private String status;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("RouteCacheLimit")
    private String routeCacheLimit;

    @JsonProperty("MaxDadAttempts")
    private String maxDadAttempts;

    @JsonProperty("DeadGatewayDetection")
    private String deadGatewayDetection;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("MaxRandomTime")
    private JsonNode maxRandomTime;

    @JsonProperty("UseTemporaryAddresses")
    private String useTemporaryAddresses;

    @JsonProperty("MulticastForwarding")
    private String multicastForwarding;

    @JsonProperty("NeighborCacheLimit")
    private String neighborCacheLimit;

    @JsonProperty("DhcpMediaSense")
    private String dhcpMediaSense;

    @JsonProperty("MaxValidLifetime")
    private JsonNode maxValidLifetime;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("AddressMaskReply")
    private String addressMaskReply;

    @JsonProperty("RandomizeIdentifiers")
    private String randomizeIdentifiers;

    @JsonProperty("MaxPreferredLifetime")
    private JsonNode maxPreferredLifetime;

    @JsonProperty("DefaultHopLimit")
    private String defaultHopLimit;

    @JsonProperty("MldVersion")
    private String mldVersion;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("ProtocolIFType")
    private String protocolIFType;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("IcmpRedirects")
    private String icmpRedirects;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("MldLevel")
    private String mldLevel;

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("GroupForwardedFragments")
    private String groupForwardedFragments;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("OtherTypeDescription")
    private String otherTypeDescription;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("ProtocolType")
    private String protocolType;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("ReassemblyLimit")
    private String reassemblyLimit;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SourceRoutingBehavior")
    private String sourceRoutingBehavior;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("MediaSenseEventLog")
    private String mediaSenseEventLog;

    @JsonProperty("RegenerateTime")
    private JsonNode regenerateTime;

}
