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
public class NetAdapterInfo {

    public static final String[] COLUMN_NAMES = {"MaxSpeed", "Status", "DriverDate", "OtherPortType", "InterfaceDescription", "MtuSize", "ConnectorPresent", "DriverDescription", "OperationalStatus", "Virtual", "MacAddress", "AdminLocked", "ifAlias", "OtherEnabledState", "RequestedSpeed", "MajorDriverVersion", "LowerLayerInterfaceIndices", "VlanID", "DeviceName", "HigherLayerInterfaceIndices", "AdditionalAvailability", "PermanentAddress", "DriverName", "DriverMajorNdisVersion", "LinkLayerAddress", "OtherIdentifyingInfo", "NdisMedium", "TimeOfLastStateChange", "ElementName", "TransmitLinkSpeed", "IMFilter", "DriverInformation", "MediaType", "InstanceID", "Hidden", "InterfaceGuid", "OperationalStatusDownInterfacePaused", "StatusDescriptions", "InterfaceName", "MinorDriverVersion", "AdminStatus", "Availability", "PnPDeviceID", "FullDuplex", "ErrorDescription", "NotUserRemovable", "MediaConnectionState", "DriverFileName", "IdentifyingDescriptions", "DriverDateData", "State", "LastErrorCode", "EndPointInterface", "HealthState", "ifIndex", "InterfaceAdminStatus", "EnabledState", "Description", "CommunicationStatus", "ErrorCleared", "StatusInfo", "InterfaceAlias", "DriverMinorNdisVersion", "InterfaceIndex", "ComponentID", "InterfaceType", "PromiscuousMode", "PowerManagementSupported", "NdisPhysicalMedium", "WdmInterface", "Speed", "DriverVersionString", "DriverProvider", "ifDesc", "ifName", "DriverVersion", "OperationalStatusDownDefaultPortNotAuthenticated", "NdisVersion", "LinkSpeed", "UsageRestriction", "PortNumber", "PSComputerName", "NetLuid", "RequestedState", "MediaDuplexState", "OperatingStatus", "TotalPowerOnHours", "DetailedStatus", "SystemName", "SupportedMaximumTransmissionUnit", "TransitioningToState", "InterfaceOperationalStatus", "DeviceID", "OperationalStatusDownLowPowerState", "PrimaryStatus", "Caption", "InstallDate", "CreationClassName", "PowerManagementCapabilities", "DeviceWakeUpEnable", "OperationalStatusDownMediaDisconnected", "EnabledDefault", "OtherNetworkPortType", "AvailableRequestedStates", "NetLuidIndex", "ifOperStatus", "ActiveMaximumTransmissionUnit", "PortType", "NetworkAddresses", "LinkTechnology", "HardwareInterface", "MediaConnectState", "iSCSIInterface", "PowerOnHours", "SystemCreationClassName", "Name", "PhysicalMediaType", "MaxQuiesceTime", "OtherLinkTechnology", "AutoSense", "ReceiveLinkSpeed"};

    @JsonProperty("MaxSpeed")
    private String maxSpeed;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("DriverDate")
    private String driverDate;

    @JsonProperty("OtherPortType")
    private String otherPortType;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("MtuSize")
    private String mtuSize;

    @JsonProperty("ConnectorPresent")
    private String connectorPresent;

    @JsonProperty("DriverDescription")
    private String driverDescription;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("Virtual")
    private String virtual;

    @JsonProperty("MacAddress")
    private String macAddress;

    @JsonProperty("AdminLocked")
    private String adminLocked;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("OtherEnabledState")
    private String otherEnabledState;

    @JsonProperty("RequestedSpeed")
    private String requestedSpeed;

    @JsonProperty("MajorDriverVersion")
    private String majorDriverVersion;

    @JsonProperty("LowerLayerInterfaceIndices")
    private JsonNode lowerLayerInterfaceIndices;

    @JsonProperty("VlanID")
    private String vlanID;

    @JsonProperty("DeviceName")
    private String deviceName;

    @JsonProperty("HigherLayerInterfaceIndices")
    private JsonNode higherLayerInterfaceIndices;

    @JsonProperty("AdditionalAvailability")
    private String additionalAvailability;

    @JsonProperty("PermanentAddress")
    private String permanentAddress;

    @JsonProperty("DriverName")
    private String driverName;

    @JsonProperty("DriverMajorNdisVersion")
    private String driverMajorNdisVersion;

    @JsonProperty("LinkLayerAddress")
    private String linkLayerAddress;

    @JsonProperty("OtherIdentifyingInfo")
    private String otherIdentifyingInfo;

    @JsonProperty("NdisMedium")
    private String ndisMedium;

    @JsonProperty("TimeOfLastStateChange")
    private String timeOfLastStateChange;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("TransmitLinkSpeed")
    private String transmitLinkSpeed;

    @JsonProperty("IMFilter")
    private String iMFilter;

    @JsonProperty("DriverInformation")
    private String driverInformation;

    @JsonProperty("MediaType")
    private String mediaType;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Hidden")
    private String hidden;

    @JsonProperty("InterfaceGuid")
    private String interfaceGuid;

    @JsonProperty("OperationalStatusDownInterfacePaused")
    private String operationalStatusDownInterfacePaused;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("InterfaceName")
    private String interfaceName;

    @JsonProperty("MinorDriverVersion")
    private String minorDriverVersion;

    @JsonProperty("AdminStatus")
    private String adminStatus;

    @JsonProperty("Availability")
    private String availability;

    @JsonProperty("PnPDeviceID")
    private String pnPDeviceID;

    @JsonProperty("FullDuplex")
    private String fullDuplex;

    @JsonProperty("ErrorDescription")
    private String errorDescription;

    @JsonProperty("NotUserRemovable")
    private String notUserRemovable;

    @JsonProperty("MediaConnectionState")
    private String mediaConnectionState;

    @JsonProperty("DriverFileName")
    private String driverFileName;

    @JsonProperty("IdentifyingDescriptions")
    private String identifyingDescriptions;

    @JsonProperty("DriverDateData")
    private String driverDateData;

    @JsonProperty("State")
    private String state;

    @JsonProperty("LastErrorCode")
    private String lastErrorCode;

    @JsonProperty("EndPointInterface")
    private String endPointInterface;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("InterfaceAdminStatus")
    private String interfaceAdminStatus;

    @JsonProperty("EnabledState")
    private String enabledState;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("ErrorCleared")
    private String errorCleared;

    @JsonProperty("StatusInfo")
    private String statusInfo;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("DriverMinorNdisVersion")
    private String driverMinorNdisVersion;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("ComponentID")
    private String componentID;

    @JsonProperty("InterfaceType")
    private String interfaceType;

    @JsonProperty("PromiscuousMode")
    private String promiscuousMode;

    @JsonProperty("PowerManagementSupported")
    private String powerManagementSupported;

    @JsonProperty("NdisPhysicalMedium")
    private String ndisPhysicalMedium;

    @JsonProperty("WdmInterface")
    private String wdmInterface;

    @JsonProperty("Speed")
    private String speed;

    @JsonProperty("DriverVersionString")
    private String driverVersionString;

    @JsonProperty("DriverProvider")
    private String driverProvider;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("ifName")
    private String ifName;

    @JsonProperty("DriverVersion")
    private String driverVersion;

    @JsonProperty("OperationalStatusDownDefaultPortNotAuthenticated")
    private String operationalStatusDownDefaultPortNotAuthenticated;

    @JsonProperty("NdisVersion")
    private JsonNode ndisVersion;

    @JsonProperty("LinkSpeed")
    private String linkSpeed;

    @JsonProperty("UsageRestriction")
    private String usageRestriction;

    @JsonProperty("PortNumber")
    private String portNumber;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("NetLuid")
    private String netLuid;

    @JsonProperty("RequestedState")
    private String requestedState;

    @JsonProperty("MediaDuplexState")
    private String mediaDuplexState;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("TotalPowerOnHours")
    private String totalPowerOnHours;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("SupportedMaximumTransmissionUnit")
    private String supportedMaximumTransmissionUnit;

    @JsonProperty("TransitioningToState")
    private String transitioningToState;

    @JsonProperty("InterfaceOperationalStatus")
    private String interfaceOperationalStatus;

    @JsonProperty("DeviceID")
    private String deviceID;

    @JsonProperty("OperationalStatusDownLowPowerState")
    private String operationalStatusDownLowPowerState;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("PowerManagementCapabilities")
    private String powerManagementCapabilities;

    @JsonProperty("DeviceWakeUpEnable")
    private String deviceWakeUpEnable;

    @JsonProperty("OperationalStatusDownMediaDisconnected")
    private String operationalStatusDownMediaDisconnected;

    @JsonProperty("EnabledDefault")
    private String enabledDefault;

    @JsonProperty("OtherNetworkPortType")
    private String otherNetworkPortType;

    @JsonProperty("AvailableRequestedStates")
    private String availableRequestedStates;

    @JsonProperty("NetLuidIndex")
    private String netLuidIndex;

    @JsonProperty("ifOperStatus")
    private String ifOperStatus;

    @JsonProperty("ActiveMaximumTransmissionUnit")
    private String activeMaximumTransmissionUnit;

    @JsonProperty("PortType")
    private String portType;

    @JsonProperty("NetworkAddresses")
    private JsonNode networkAddresses;

    @JsonProperty("LinkTechnology")
    private String linkTechnology;

    @JsonProperty("HardwareInterface")
    private String hardwareInterface;

    @JsonProperty("MediaConnectState")
    private String mediaConnectState;

    @JsonProperty("iSCSIInterface")
    private String iSCSIInterface;

    @JsonProperty("PowerOnHours")
    private String powerOnHours;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PhysicalMediaType")
    private String physicalMediaType;

    @JsonProperty("MaxQuiesceTime")
    private String maxQuiesceTime;

    @JsonProperty("OtherLinkTechnology")
    private String otherLinkTechnology;

    @JsonProperty("AutoSense")
    private String autoSense;

    @JsonProperty("ReceiveLinkSpeed")
    private String receiveLinkSpeed;

}
