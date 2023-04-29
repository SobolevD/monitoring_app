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
public class NetIPInterfaceInfo {

    public static final String[] COLUMN_NAMES = {"DadTransmits", "OtherStatefulConfiguration", "NeighborUnreachabilityDetection", "IsolationId", "Status", "AutomaticMetric", "OperationalStatus", "Dhcp", "ifAlias", "OtherEnabledState", "CompartmentId", "RouterDiscovery", "NeighborDiscoverySupported", "WeakHostReceive", "LowestIfNetLuid", "PSComputerName", "Store", "RequestedState", "AddressFamily", "OperatingStatus", "Forwarding", "TimeOfLastStateChange", "ElementName", "ProtocolIFType", "InterfaceMetric", "DetailedStatus", "SystemName", "Advertising", "InstanceID", "CurrentHopLimit", "RetransmitTime", "StatusDescriptions", "GroupAddresses", "LANID", "TransitioningToState", "ManagedAddressConfiguration", "OtherLANType", "LANType", "EcnMarking", "AdvertisedRouterLifetime", "AdvertiseDefaultRoute", "PrimaryStatus", "ForceArpNdWolPattern", "Caption", "InstallDate", "OtherTypeDescription", "WeakHostSend", "CreationClassName", "IgnoreDefaultRoutes", "EnabledDefault", "MACAddress", "ProtocolType", "AvailableRequestedStates", "ClampMss", "ReachableTime", "ConnectionState", "AliasAddresses", "HealthState", "ifIndex", "MaxDataSize", "EnabledState", "Description", "CommunicationStatus", "NameFormat", "DirectedMacWolPattern", "SystemCreationClassName", "BaseReachableTime", "Name", "InterfaceAlias", "InterfaceIndex", "NlMtu", "DadRetransmitTime"};

    @JsonProperty("DadTransmits")
    private String dadTransmits;

    @JsonProperty("OtherStatefulConfiguration")
    private String otherStatefulConfiguration;

    @JsonProperty("NeighborUnreachabilityDetection")
    private String neighborUnreachabilityDetection;

    @JsonProperty("IsolationId")
    private String isolationId;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("AutomaticMetric")
    private String automaticMetric;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("Dhcp")
    private String dhcp;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("RouterDiscovery")
    private String routerDiscovery;

    @JsonProperty("NeighborDiscoverySupported")
    private String neighborDiscoverySupported;

    @JsonProperty("WeakHostReceive")
    private String weakHostReceive;

    @JsonProperty("LowestIfNetLuid")
    private String lowestIfNetLuid;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("AddressFamily")
    private String addressFamily;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("Forwarding")
    private String forwarding;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("ProtocolIFType")
    private String protocolIFType;

    @JsonProperty("InterfaceMetric")
    private String interfaceMetric;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("Advertising")
    private String advertising;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CurrentHopLimit")
    private String currentHopLimit;

    @JsonProperty("RetransmitTime")
    private String retransmitTime;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("GroupAddresses")
    private String groupAddresses;

    @JsonProperty("LANID")
    private String lANID;

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("ManagedAddressConfiguration")
    private String managedAddressConfiguration;

    @JsonProperty("OtherLANType")
    private String otherLANType;

    @JsonProperty("LANType")
    private String lANType;

    @JsonProperty("EcnMarking")
    private String ecnMarking;

    @JsonProperty("AdvertisedRouterLifetime")
    private JsonNode advertisedRouterLifetime;

    @JsonProperty("AdvertiseDefaultRoute")
    private String advertiseDefaultRoute;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("ForceArpNdWolPattern")
    private String forceArpNdWolPattern;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("OtherTypeDescription")
    private String otherTypeDescription;

    @JsonProperty("WeakHostSend")
    private String weakHostSend;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("IgnoreDefaultRoutes")
    private String ignoreDefaultRoutes;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("MACAddress")
    private String mACAddress;

    @JsonProperty("ProtocolType")
    private String protocolType;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("ClampMss")
    private String clampMss;

    @JsonProperty("ReachableTime")
    private String reachableTime;

    @JsonProperty("ConnectionState")
    private String connectionState;

    @JsonProperty("AliasAddresses")
    private String aliasAddresses;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("MaxDataSize")
    private String maxDataSize;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("DirectedMacWolPattern")
    private String directedMacWolPattern;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("BaseReachableTime")
    private String baseReachableTime;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("NlMtu")
    private String nlMtu;

    @JsonProperty("DadRetransmitTime")
    private String dadRetransmitTime;

}
