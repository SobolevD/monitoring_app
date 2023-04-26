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
public class NetAdapterHardwareInfoInfo {
    public static final String[] COLUMN_NAMES = {"SriovSupport", "PcieLinkSpeed", "PcieMaxLinkSpeed", "Version", "DeviceType", "CurrentSpeedAndMode", "ifAlias", "InterfaceAlias", "ifDesc", "Segment", "Bus", "Device", "Function", "Slot", "PcieLinkWidth", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "BusNumber", "DeviceNumber", "Dma64BitSupported", "FunctionNumber", "LineBasedInterrupts", "LineBasedInterruptSupported", "LocationInformationString", "MaxInterruptMessages", "MsiEnabled", "MsiInterruptSupported", "MsiSupported", "MsiXEnabled", "MsiXInterruptSupported", "MsixMessageAffinityArray", "MsiXSupported", "NoInterrupt", "NumaNode", "NumMsiMessages", "NumMsixTableEntries", "PciCurrentSpeedAndMode", "PciDeviceLabelID", "PciDeviceLabelString", "PciDeviceType", "PciExpressCurrentLinkSpeedEncoded", "PciExpressCurrentLinkWidth", "PciExpressCurrentPayloadSize", "PciExpressMaxLinkSpeedEncoded", "PciExpressMaxLinkWidth", "PciExpressMaxPayloadSize", "PciExpressMaxReadRequestSize", "PciExpressVersion", "PciXCurrentSpeedAndMode", "S0WakeupSupported", "SegmentNumber", "SlotNumber", "PSComputerName"};

    @JsonProperty("SriovSupport")
    private String sriovSupport;

    @JsonProperty("PcieLinkSpeed")
    private String pcieLinkSpeed;

    @JsonProperty("PcieMaxLinkSpeed")
    private String pcieMaxLinkSpeed;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("DeviceType")
    private String deviceType;

    @JsonProperty("CurrentSpeedAndMode")
    private String currentSpeedAndMode;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Segment")
    private String segment;

    @JsonProperty("Bus")
    private String bus;

    @JsonProperty("Device")
    private String device;

    @JsonProperty("Function")
    private String function;

    @JsonProperty("Slot")
    private String slot;

    @JsonProperty("PcieLinkWidth")
    private String pcieLinkWidth;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("BusNumber")
    private String busNumber;

    @JsonProperty("DeviceNumber")
    private String deviceNumber;

    @JsonProperty("Dma64BitSupported")
    private String dma64BitSupported;

    @JsonProperty("FunctionNumber")
    private String functionNumber;

    @JsonProperty("LineBasedInterrupts")
    private String lineBasedInterrupts;

    @JsonProperty("LineBasedInterruptSupported")
    private String lineBasedInterruptSupported;

    @JsonProperty("LocationInformationString")
    private String locationInformationString;

    @JsonProperty("MaxInterruptMessages")
    private String maxInterruptMessages;

    @JsonProperty("MsiEnabled")
    private String msiEnabled;

    @JsonProperty("MsiInterruptSupported")
    private String msiInterruptSupported;

    @JsonProperty("MsiSupported")
    private String msiSupported;

    @JsonProperty("MsiXEnabled")
    private String msiXEnabled;

    @JsonProperty("MsiXInterruptSupported")
    private String msiXInterruptSupported;

    @JsonProperty("MsixMessageAffinityArray")
    private String msixMessageAffinityArray;

    @JsonProperty("MsiXSupported")
    private String msiXSupported;

    @JsonProperty("NoInterrupt")
    private String noInterrupt;

    @JsonProperty("NumaNode")
    private String numaNode;

    @JsonProperty("NumMsiMessages")
    private String numMsiMessages;

    @JsonProperty("NumMsixTableEntries")
    private String numMsixTableEntries;

    @JsonProperty("PciCurrentSpeedAndMode")
    private String pciCurrentSpeedAndMode;

    @JsonProperty("PciDeviceLabelID")
    private String pciDeviceLabelID;

    @JsonProperty("PciDeviceLabelString")
    private String pciDeviceLabelString;

    @JsonProperty("PciDeviceType")
    private String pciDeviceType;

    @JsonProperty("PciExpressCurrentLinkSpeedEncoded")
    private String pciExpressCurrentLinkSpeedEncoded;

    @JsonProperty("PciExpressCurrentLinkWidth")
    private String pciExpressCurrentLinkWidth;

    @JsonProperty("PciExpressCurrentPayloadSize")
    private String pciExpressCurrentPayloadSize;

    @JsonProperty("PciExpressMaxLinkSpeedEncoded")
    private String pciExpressMaxLinkSpeedEncoded;

    @JsonProperty("PciExpressMaxLinkWidth")
    private String pciExpressMaxLinkWidth;

    @JsonProperty("PciExpressMaxPayloadSize")
    private String pciExpressMaxPayloadSize;

    @JsonProperty("PciExpressMaxReadRequestSize")
    private String pciExpressMaxReadRequestSize;

    @JsonProperty("PciExpressVersion")
    private String pciExpressVersion;

    @JsonProperty("PciXCurrentSpeedAndMode")
    private String pciXCurrentSpeedAndMode;

    @JsonProperty("S0WakeupSupported")
    private String s0WakeupSupported;

    @JsonProperty("SegmentNumber")
    private String segmentNumber;

    @JsonProperty("SlotNumber")
    private String slotNumber;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
