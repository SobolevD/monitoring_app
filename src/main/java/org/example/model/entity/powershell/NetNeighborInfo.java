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
public class NetNeighborInfo {
    public static final String[] COLUMN_NAMES = {"State", "Store", "AddressFamily", "ifIndex", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault", "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange", "TransitioningToState", "CreationClassName", "SystemCreationClassName", "SystemName", "AccessContext", "AccessInfo", "InfoFormat", "OtherAccessContext", "OtherInfoFormatDescription", "InterfaceAlias", "InterfaceIndex", "IPAddress", "LinkLayerAddress", "PSComputerName"};

    @JsonProperty("State")
    private String state;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("AddressFamily")
    private String addressFamily;

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

    @JsonProperty("AccessContext")
    private String accessContext;

    @JsonProperty("AccessInfo")
    private String accessInfo;

    @JsonProperty("InfoFormat")
    private String infoFormat;

    @JsonProperty("OtherAccessContext")
    private String otherAccessContext;

    @JsonProperty("OtherInfoFormatDescription")
    private String otherInfoFormatDescription;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("IPAddress")
    private String iPAddress;

    @JsonProperty("LinkLayerAddress")
    private String linkLayerAddress;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
