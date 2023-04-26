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
public class NetAdapterInfo {
    public static final String[] COLUMN_NAMES = {"MacAddress", "Status", "LinkSpeed", "MediaType", "PhysicalMediaType", "AdminStatus", "MediaConnectionState", "DriverInformation", "DriverFileName", "NdisVersion", "ifOperStatus", "ifAlias", "InterfaceAlias", "ifIndex", "ifDesc", "ifName", "DriverVersion", "LinkLayerAddress", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "StatusDescriptions", "AvailableRequestedStates", "EnabledDefault", "EnabledState", "OtherEnabledState", "RequestedState", "TimeOfLastStateChange", "TransitioningToState", "AdditionalAvailability", "Availability", "CreationClassName", "DeviceID", "ErrorCleared", "ErrorDescription", "IdentifyingDescriptions", "LastErrorCode", "MaxQuiesceTime", "OtherIdentifyingInfo", "PowerManagementCapabilities", "PowerManagementSupported", "PowerOnHours", "StatusInfo", "SystemCreationClassName", "SystemName", "TotalPowerOnHours", "MaxSpeed", "OtherPortType", "PortType", "RequestedSpeed", "Speed", "UsageRestriction", "ActiveMaximumTransmissionUnit", "AutoSense", "FullDuplex", "LinkTechnology", "NetworkAddresses", "OtherLinkTechnology", "OtherNetworkPortType", "PermanentAddress", "PortNumber", "SupportedMaximumTransmissionUnit", "AdminLocked", "ComponentID", "ConnectorPresent", "DeviceName", "DeviceWakeUpEnable", "DriverDate", "DriverDateData", "DriverDescription", "DriverMajorNdisVersion", "DriverMinorNdisVersion", "DriverName", "DriverProvider", "DriverVersionString", "EndPointInterface", "HardwareInterface", "Hidden", "HigherLayerInterfaceIndices", "IMFilter", "InterfaceAdminStatus", "InterfaceDescription", "InterfaceGuid", "InterfaceIndex", "InterfaceName", "InterfaceOperationalStatus", "InterfaceType", "iSCSIInterface", "LowerLayerInterfaceIndices", "MajorDriverVersion", "MediaConnectState", "MediaDuplexState", "MinorDriverVersion", "MtuSize", "NdisMedium", "NdisPhysicalMedium", "NetLuid", "NetLuidIndex", "NotUserRemovable", "OperationalStatusDownDefaultPortNotAuthenticated", "OperationalStatusDownInterfacePaused", "OperationalStatusDownLowPowerState", "OperationalStatusDownMediaDisconnected", "PnPDeviceID", "PromiscuousMode", "ReceiveLinkSpeed", "State", "TransmitLinkSpeed", "Virtual", "VlanID", "WdmInterface", "PSComputerName"};

    @JsonProperty("MacAddress")
    private String macAddress;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("LinkSpeed")
    private String linkSpeed;

    @JsonProperty("MediaType")
    private String mediaType;

    @JsonProperty("PhysicalMediaType")
    private String physicalMediaType;

    @JsonProperty("AdminStatus")
    private String adminStatus;

    @JsonProperty("MediaConnectionState")
    private String mediaConnectionState;

    @JsonProperty("DriverInformation")
    private String driverInformation;

    @JsonProperty("DriverFileName")
    private String driverFileName;

    @JsonProperty("NdisVersion")
    private String ndisVersion;

    @JsonProperty("ifOperStatus")
    private String ifOperStatus;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("ifName")
    private String ifName;

    @JsonProperty("DriverVersion")
    private String driverVersion;

    @JsonProperty("LinkLayerAddress")
    private String linkLayerAddress;

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

    @JsonProperty("AdditionalAvailability")
    private String additionalAvailability;

    @JsonProperty("Availability")
    private String availability;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("DeviceID")
    private String deviceID;

    @JsonProperty("ErrorCleared")
    private String errorCleared;

    @JsonProperty("ErrorDescription")
    private String errorDescription;

    @JsonProperty("IdentifyingDescriptions")
    private String identifyingDescriptions;

    @JsonProperty("LastErrorCode")
    private String lastErrorCode;

    @JsonProperty("MaxQuiesceTime")
    private String maxQuiesceTime;

    @JsonProperty("OtherIdentifyingInfo")
    private String otherIdentifyingInfo;

    @JsonProperty("PowerManagementCapabilities")
    private String powerManagementCapabilities;

    @JsonProperty("PowerManagementSupported")
    private String powerManagementSupported;

    @JsonProperty("PowerOnHours")
    private String powerOnHours;

    @JsonProperty("StatusInfo")
    private String statusInfo;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("TotalPowerOnHours")
    private String totalPowerOnHours;

    @JsonProperty("MaxSpeed")
    private String maxSpeed;

    @JsonProperty("OtherPortType")
    private String otherPortType;

    @JsonProperty("PortType")
    private String portType;

    @JsonProperty("RequestedSpeed")
    private String requestedSpeed;

    @JsonProperty("Speed")
    private String speed;

    @JsonProperty("UsageRestriction")
    private String usageRestriction;

    @JsonProperty("ActiveMaximumTransmissionUnit")
    private String activeMaximumTransmissionUnit;

    @JsonProperty("AutoSense")
    private String autoSense;

    @JsonProperty("FullDuplex")
    private String fullDuplex;

    @JsonProperty("LinkTechnology")
    private String linkTechnology;

    @JsonProperty("NetworkAddresses")
    private String networkAddresses;

    @JsonProperty("OtherLinkTechnology")
    private String otherLinkTechnology;

    @JsonProperty("OtherNetworkPortType")
    private String otherNetworkPortType;

    @JsonProperty("PermanentAddress")
    private String permanentAddress;

    @JsonProperty("PortNumber")
    private String portNumber;

    @JsonProperty("SupportedMaximumTransmissionUnit")
    private String supportedMaximumTransmissionUnit;

    @JsonProperty("AdminLocked")
    private String adminLocked;

    @JsonProperty("ComponentID")
    private String componentID;

    @JsonProperty("ConnectorPresent")
    private String connectorPresent;

    @JsonProperty("DeviceName")
    private String deviceName;

    @JsonProperty("DeviceWakeUpEnable")
    private String deviceWakeUpEnable;

    @JsonProperty("DriverDate")
    private String driverDate;

    @JsonProperty("DriverDateData")
    private String driverDateData;

    @JsonProperty("DriverDescription")
    private String driverDescription;

    @JsonProperty("DriverMajorNdisVersion")
    private String driverMajorNdisVersion;

    @JsonProperty("DriverMinorNdisVersion")
    private String driverMinorNdisVersion;

    @JsonProperty("DriverName")
    private String driverName;

    @JsonProperty("DriverProvider")
    private String driverProvider;

    @JsonProperty("DriverVersionString")
    private String driverVersionString;

    @JsonProperty("EndPointInterface")
    private String endPointInterface;

    @JsonProperty("HardwareInterface")
    private String hardwareInterface;

    @JsonProperty("Hidden")
    private String hidden;

    @JsonProperty("HigherLayerInterfaceIndices")
    private String higherLayerInterfaceIndices;

    @JsonProperty("IMFilter")
    private String iMFilter;

    @JsonProperty("InterfaceAdminStatus")
    private String interfaceAdminStatus;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("InterfaceGuid")
    private String interfaceGuid;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("InterfaceName")
    private String interfaceName;

    @JsonProperty("InterfaceOperationalStatus")
    private String interfaceOperationalStatus;

    @JsonProperty("InterfaceType")
    private String interfaceType;

    @JsonProperty("iSCSIInterface")
    private String iSCSIInterface;

    @JsonProperty("LowerLayerInterfaceIndices")
    private String lowerLayerInterfaceIndices;

    @JsonProperty("MajorDriverVersion")
    private String majorDriverVersion;

    @JsonProperty("MediaConnectState")
    private String mediaConnectState;

    @JsonProperty("MediaDuplexState")
    private String mediaDuplexState;

    @JsonProperty("MinorDriverVersion")
    private String minorDriverVersion;

    @JsonProperty("MtuSize")
    private String mtuSize;

    @JsonProperty("NdisMedium")
    private String ndisMedium;

    @JsonProperty("NdisPhysicalMedium")
    private String ndisPhysicalMedium;

    @JsonProperty("NetLuid")
    private String netLuid;

    @JsonProperty("NetLuidIndex")
    private String netLuidIndex;

    @JsonProperty("NotUserRemovable")
    private String notUserRemovable;

    @JsonProperty("OperationalStatusDownDefaultPortNotAuthenticated")
    private String operationalStatusDownDefaultPortNotAuthenticated;

    @JsonProperty("OperationalStatusDownInterfacePaused")
    private String operationalStatusDownInterfacePaused;

    @JsonProperty("OperationalStatusDownLowPowerState")
    private String operationalStatusDownLowPowerState;

    @JsonProperty("OperationalStatusDownMediaDisconnected")
    private String operationalStatusDownMediaDisconnected;

    @JsonProperty("PnPDeviceID")
    private String pnPDeviceID;

    @JsonProperty("PromiscuousMode")
    private String promiscuousMode;

    @JsonProperty("ReceiveLinkSpeed")
    private String receiveLinkSpeed;

    @JsonProperty("State")
    private String state;

    @JsonProperty("TransmitLinkSpeed")
    private String transmitLinkSpeed;

    @JsonProperty("Virtual")
    private String virtual;

    @JsonProperty("VlanID")
    private String vlanID;

    @JsonProperty("WdmInterface")
    private String wdmInterface;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
