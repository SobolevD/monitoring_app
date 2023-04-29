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
public class NetIPv4ProtocolInfo {

    public static final String[] COLUMN_NAMES = {"MldLevel", "IGMPVersion", "TransitioningToState", "GroupForwardedFragments", "Status", "MinimumMtu", "OperationalStatus", "PrimaryStatus", "RouteCacheLimit", "Caption", "InstallDate", "DeadGatewayDetection", "OtherTypeDescription", "CreationClassName", "OtherEnabledState", "EnabledDefault", "ProtocolType", "AvailableRequestedStates", "MulticastForwarding", "NeighborCacheLimit", "DhcpMediaSense", "HealthState", "PSComputerName", "AddressMaskReply", "EnabledState", "ReassemblyLimit", "Description", "RandomizeIdentifiers", "CommunicationStatus", "NameFormat", "SystemCreationClassName", "DefaultHopLimit", "SourceRoutingBehavior", "MldVersion", "Name", "RequestedState", "OperatingStatus", "TimeOfLastStateChange", "ElementName", "ProtocolIFType", "DetailedStatus", "SystemName", "MediaSenseEventLog", "InstanceID", "IGMPLevel", "IcmpRedirects", "StatusDescriptions"};

    @JsonProperty("MldLevel")
    private String mldLevel;

    @JsonProperty("IGMPVersion")
    private String iGMPVersion;

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("GroupForwardedFragments")
    private String groupForwardedFragments;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("MinimumMtu")
    private String minimumMtu;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("RouteCacheLimit")
    private String routeCacheLimit;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("DeadGatewayDetection")
    private String deadGatewayDetection;

    @JsonProperty("OtherTypeDescription")
    private String otherTypeDescription;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("ProtocolType")
    private String protocolType;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("MulticastForwarding")
    private String multicastForwarding;

    @JsonProperty("NeighborCacheLimit")
    private String neighborCacheLimit;

    @JsonProperty("DhcpMediaSense")
    private String dhcpMediaSense;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("AddressMaskReply")
    private String addressMaskReply;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("ReassemblyLimit")
    private String reassemblyLimit;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("RandomizeIdentifiers")
    private String randomizeIdentifiers;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("DefaultHopLimit")
    private String defaultHopLimit;

    @JsonProperty("SourceRoutingBehavior")
    private String sourceRoutingBehavior;

    @JsonProperty("MldVersion")
    private String mldVersion;

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

    @JsonProperty("ProtocolIFType")
    private String protocolIFType;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("MediaSenseEventLog")
    private String mediaSenseEventLog;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("IGMPLevel")
    private String iGMPLevel;

    @JsonProperty("IcmpRedirects")
    private String icmpRedirects;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

}
