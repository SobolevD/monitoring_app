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
public class NetIPAddressInfo {
    public static final String[] COLUMN_NAMES = {"PrefixOrigin", "SuffixOrigin", "Type", "Store", "AddressFamily", "AddressState", "ifIndex", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault", "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange", "TransitioningToState", "CreationClassName", "SystemCreationClassName", "SystemName", "NameFormat", "OtherTypeDescription", "ProtocolIFType", "ProtocolType", "Address", "AddressOrigin", "AddressType", "IPv4Address", "IPv6Address", "IPVersionSupport", "PrefixLength", "SubnetMask", "InterfaceAlias", "InterfaceIndex", "IPAddress", "PreferredLifetime", "SkipAsSource", "ValidLifetime", "PSComputerName"};

    @JsonProperty("PrefixOrigin")
    private String prefixOrigin;

    @JsonProperty("SuffixOrigin")
    private String suffixOrigin;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("AddressFamily")
    private String addressFamily;

    @JsonProperty("AddressState")
    private String addressState;

    @JsonProperty("ifIndex")
    private String ifIndex;

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

    @JsonProperty("Address")
    private String address;

    @JsonProperty("AddressOrigin")
    private String addressOrigin;

    @JsonProperty("AddressType")
    private String addressType;

    @JsonProperty("IPv4Address")
    private String iPv4Address;

    @JsonProperty("IPv6Address")
    private String iPv6Address;

    @JsonProperty("IPVersionSupport")
    private String iPVersionSupport;

    @JsonProperty("PrefixLength")
    private String prefixLength;

    @JsonProperty("SubnetMask")
    private String subnetMask;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("IPAddress")
    private String iPAddress;

    @JsonProperty("PreferredLifetime")
    private String preferredLifetime;

    @JsonProperty("SkipAsSource")
    private String skipAsSource;

    @JsonProperty("ValidLifetime")
    private String validLifetime;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
