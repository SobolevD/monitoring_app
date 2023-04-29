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
public class NetIPAddressInfo {

    public static final String[] COLUMN_NAMES = {"Status", "PrefixLength", "SkipAsSource", "PreferredLifetime", "OperationalStatus", "OtherEnabledState", "IPVersionSupport", "AddressType", "PSComputerName", "ValidLifetime", "Address", "SuffixOrigin", "Store", "IPv6Address", "IPv4Address", "RequestedState", "PrefixOrigin", "AddressFamily", "OperatingStatus", "TimeOfLastStateChange", "AddressOrigin", "ElementName", "ProtocolIFType", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions", "SubnetMask", "TransitioningToState", "PrimaryStatus", "Caption", "InstallDate", "OtherTypeDescription", "CreationClassName", "Type", "EnabledDefault", "ProtocolType", "AvailableRequestedStates", "IPAddress", "AddressState", "HealthState", "ifIndex", "EnabledState", "Description", "CommunicationStatus", "NameFormat", "SystemCreationClassName", "Name", "InterfaceAlias", "InterfaceIndex"};

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PrefixLength")
    private String prefixLength;

    @JsonProperty("SkipAsSource")
    private String skipAsSource;

    @JsonProperty("PreferredLifetime")
    private JsonNode preferredLifetime;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("IPVersionSupport")
    private String iPVersionSupport;

    @JsonProperty("AddressType")
    private String addressType;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ValidLifetime")
    private JsonNode validLifetime;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("SuffixOrigin")
    private String suffixOrigin;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("IPv6Address")
    private String iPv6Address;

    @JsonProperty("IPv4Address")
    private String iPv4Address;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("PrefixOrigin")
    private String prefixOrigin;

    @JsonProperty("AddressFamily")
    private String addressFamily;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("AddressOrigin")
    private String addressOrigin;

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

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("SubnetMask")
    private String subnetMask;

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

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

    @JsonProperty("Type")
    private String type;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("ProtocolType")
    private String protocolType;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("IPAddress")
    private String iPAddress;

    @JsonProperty("AddressState")
    private String addressState;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

}
