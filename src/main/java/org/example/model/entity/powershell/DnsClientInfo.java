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
public class DnsClientInfo {

    public static final String[] COLUMN_NAMES = {
            "Suffix", "SuffixSearchList", "Caption", "Description", "ElementName",
            "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState",
            "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus",
            "Status", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault",
            "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange",
            "TransitioningToState", "CreationClassName", "SystemCreationClassName",
            "SystemName", "NameFormat", "OtherTypeDescription", "ProtocolIFType",
            "ProtocolType", "DHCPOptionsToUse", "Hostname", "ConnectionSpecificSuffix",
            "ConnectionSpecificSuffixSearchList", "InterfaceAlias", "InterfaceIndex",
            "RegisterThisConnectionsAddress", "UseSuffixWhenRegistering", "PSComputerName"};

    @JsonProperty("Suffix")
    private String suffix;

    @JsonProperty("SuffixSearchList")
    private String suffixSearchList;

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

    @JsonProperty("DHCPOptionsToUse")
    private String dHCPOptionsToUse;

    @JsonProperty("Hostname")
    private String hostname;

    @JsonProperty("ConnectionSpecificSuffix")
    private String connectionSpecificSuffix;

    @JsonProperty("ConnectionSpecificSuffixSearchList")
    private String connectionSpecificSuffixSearchList;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("RegisterThisConnectionsAddress")
    private String registerThisConnectionsAddress;

    @JsonProperty("UseSuffixWhenRegistering")
    private String useSuffixWhenRegistering;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
