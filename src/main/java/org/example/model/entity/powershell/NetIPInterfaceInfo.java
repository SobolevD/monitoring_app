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
public class NetIPInterfaceInfo {
    public static final String[] COLUMN_NAMES = {"Store", "AddressFamily", "Forwarding", "ClampMss", "Advertising", "NeighborUnreachabilityDetection", "RouterDiscovery", "NeighborDiscoverySupported", "ManagedAddressConfiguration", "OtherStatefulConfiguration", "WeakHostSend", "WeakHostReceive", "IgnoreDefaultRoutes", "AdvertiseDefaultRoute", "ForceArpNdWolPattern", "DirectedMacWolPattern", "EcnMarking", "Dhcp", "ConnectionState", "AutomaticMetric", "ifIndex", "ifAlias", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault", "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange", "TransitioningToState", "CreationClassName", "SystemCreationClassName", "SystemName", "NameFormat", "OtherTypeDescription", "ProtocolIFType", "ProtocolType", "AliasAddresses", "GroupAddresses", "LANID", "LANType", "MACAddress", "MaxDataSize", "OtherLANType", "AdvertisedRouterLifetime", "BaseReachableTime", "CompartmentId", "CurrentHopLimit", "DadRetransmitTime", "DadTransmits", "InterfaceAlias", "InterfaceIndex", "InterfaceMetric", "IsolationId", "LowestIfNetLuid", "NlMtu", "ReachableTime", "RetransmitTime", "PSComputerName"};

    @JsonProperty("Store")
    private String store;

    @JsonProperty("AddressFamily")
    private String addressFamily;

    @JsonProperty("Forwarding")
    private String forwarding;

    @JsonProperty("ClampMss")
    private String clampMss;

    @JsonProperty("Advertising")
    private String advertising;

    @JsonProperty("NeighborUnreachabilityDetection")
    private String neighborUnreachabilityDetection;

    @JsonProperty("RouterDiscovery")
    private String routerDiscovery;

    @JsonProperty("NeighborDiscoverySupported")
    private String neighborDiscoverySupported;

    @JsonProperty("ManagedAddressConfiguration")
    private String managedAddressConfiguration;

    @JsonProperty("OtherStatefulConfiguration")
    private String otherStatefulConfiguration;

    @JsonProperty("WeakHostSend")
    private String weakHostSend;

    @JsonProperty("WeakHostReceive")
    private String weakHostReceive;

    @JsonProperty("IgnoreDefaultRoutes")
    private String ignoreDefaultRoutes;

    @JsonProperty("AdvertiseDefaultRoute")
    private String advertiseDefaultRoute;

    @JsonProperty("ForceArpNdWolPattern")
    private String forceArpNdWolPattern;

    @JsonProperty("DirectedMacWolPattern")
    private String directedMacWolPattern;

    @JsonProperty("EcnMarking")
    private String ecnMarking;

    @JsonProperty("Dhcp")
    private String dhcp;

    @JsonProperty("ConnectionState")
    private String connectionState;

    @JsonProperty("AutomaticMetric")
    private String automaticMetric;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("ifAlias")
    private String ifAlias;

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

    @JsonProperty("AliasAddresses")
    private String aliasAddresses;

    @JsonProperty("GroupAddresses")
    private String groupAddresses;

    @JsonProperty("LANID")
    private String lANID;

    @JsonProperty("LANType")
    private String lANType;

    @JsonProperty("MACAddress")
    private String mACAddress;

    @JsonProperty("MaxDataSize")
    private String maxDataSize;

    @JsonProperty("OtherLANType")
    private String otherLANType;

    @JsonProperty("AdvertisedRouterLifetime")
    private String advertisedRouterLifetime;

    @JsonProperty("BaseReachableTime")
    private String baseReachableTime;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("CurrentHopLimit")
    private String currentHopLimit;

    @JsonProperty("DadRetransmitTime")
    private String dadRetransmitTime;

    @JsonProperty("DadTransmits")
    private String dadTransmits;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("InterfaceMetric")
    private String interfaceMetric;

    @JsonProperty("IsolationId")
    private String isolationId;

    @JsonProperty("LowestIfNetLuid")
    private String lowestIfNetLuid;

    @JsonProperty("NlMtu")
    private String nlMtu;

    @JsonProperty("ReachableTime")
    private String reachableTime;

    @JsonProperty("RetransmitTime")
    private String retransmitTime;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
