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

    public static final String[] COLUMN_NAMES = {"TransitioningToState", "Status", "AccessInfo", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "CreationClassName", "OtherEnabledState", "EnabledDefault", "AvailableRequestedStates", "State", "AccessContext", "IPAddress", "HealthState", "OtherInfoFormatDescription", "ifIndex", "PSComputerName", "EnabledState", "Description", "Store", "CommunicationStatus", "SystemCreationClassName", "InfoFormat", "Name", "InterfaceAlias", "RequestedState", "OtherAccessContext", "InterfaceIndex", "LinkLayerAddress", "AddressFamily", "OperatingStatus", "TimeOfLastStateChange", "ElementName", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions"};

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("AccessInfo")
    private String accessInfo;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("State")
    private String state;

    @JsonProperty("AccessContext")
    private String accessContext;

    @JsonProperty("IPAddress")
    private String iPAddress;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("OtherInfoFormatDescription")
    private String otherInfoFormatDescription;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("InfoFormat")
    private String infoFormat;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("OtherAccessContext")
    private String otherAccessContext;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("LinkLayerAddress")
    private String linkLayerAddress;

    @JsonProperty("AddressFamily")
    private String addressFamily;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

}
