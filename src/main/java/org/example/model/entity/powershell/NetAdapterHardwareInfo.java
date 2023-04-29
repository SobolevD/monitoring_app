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
public class NetAdapterHardwareInfo {

    public static final String[] COLUMN_NAMES = {"DeviceNumber", "InterfaceDescription", "PciExpressMaxReadRequestSize", "PcieMaxLinkSpeed", "MsiEnabled", "ifDesc", "NumMsiMessages", "PciDeviceLabelString", "DeviceType", "ifAlias", "CurrentSpeedAndMode", "Slot", "MaxInterruptMessages", "S0WakeupSupported", "Dma64BitSupported", "PciExpressCurrentLinkSpeedEncoded", "NumMsixTableEntries", "PSComputerName", "PciExpressMaxLinkWidth", "MsiSupported", "PciCurrentSpeedAndMode", "NumaNode", "Source", "ElementName", "SystemName", "PciExpressCurrentLinkWidth", "InstanceID", "PciExpressMaxPayloadSize", "Function", "PcieLinkSpeed", "LocationInformationString", "MsixMessageAffinityArray", "MsiXEnabled", "Device", "LineBasedInterruptSupported", "SlotNumber", "PcieLinkWidth", "SriovSupport", "Caption", "BusNumber", "NoInterrupt", "MsiInterruptSupported", "MsiXInterruptSupported", "PciXCurrentSpeedAndMode", "PciExpressCurrentPayloadSize", "Description", "InterfaceAlias", "Name", "Segment", "PciDeviceType", "PciExpressMaxLinkSpeedEncoded", "FunctionNumber", "PciDeviceLabelID", "PciExpressVersion", "SegmentNumber", "Version", "LineBasedInterrupts", "Bus", "MsiXSupported"};

    @JsonProperty("DeviceNumber")
    private String deviceNumber;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("PciExpressMaxReadRequestSize")
    private String pciExpressMaxReadRequestSize;

    @JsonProperty("PcieMaxLinkSpeed")
    private String pcieMaxLinkSpeed;

    @JsonProperty("MsiEnabled")
    private String msiEnabled;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("NumMsiMessages")
    private String numMsiMessages;

    @JsonProperty("PciDeviceLabelString")
    private String pciDeviceLabelString;

    @JsonProperty("DeviceType")
    private String deviceType;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("CurrentSpeedAndMode")
    private String currentSpeedAndMode;

    @JsonProperty("Slot")
    private String slot;

    @JsonProperty("MaxInterruptMessages")
    private String maxInterruptMessages;

    @JsonProperty("S0WakeupSupported")
    private String s0WakeupSupported;

    @JsonProperty("Dma64BitSupported")
    private String dma64BitSupported;

    @JsonProperty("PciExpressCurrentLinkSpeedEncoded")
    private String pciExpressCurrentLinkSpeedEncoded;

    @JsonProperty("NumMsixTableEntries")
    private String numMsixTableEntries;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PciExpressMaxLinkWidth")
    private String pciExpressMaxLinkWidth;

    @JsonProperty("MsiSupported")
    private String msiSupported;

    @JsonProperty("PciCurrentSpeedAndMode")
    private String pciCurrentSpeedAndMode;

    @JsonProperty("NumaNode")
    private String numaNode;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("PciExpressCurrentLinkWidth")
    private String pciExpressCurrentLinkWidth;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PciExpressMaxPayloadSize")
    private String pciExpressMaxPayloadSize;

    @JsonProperty("Function")
    private String function;

    @JsonProperty("PcieLinkSpeed")
    private String pcieLinkSpeed;

    @JsonProperty("LocationInformationString")
    private String locationInformationString;

    @JsonProperty("MsixMessageAffinityArray")
    private JsonNode msixMessageAffinityArray;

    @JsonProperty("MsiXEnabled")
    private String msiXEnabled;

    @JsonProperty("Device")
    private String device;

    @JsonProperty("LineBasedInterruptSupported")
    private String lineBasedInterruptSupported;

    @JsonProperty("SlotNumber")
    private String slotNumber;

    @JsonProperty("PcieLinkWidth")
    private String pcieLinkWidth;

    @JsonProperty("SriovSupport")
    private String sriovSupport;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("BusNumber")
    private String busNumber;

    @JsonProperty("NoInterrupt")
    private String noInterrupt;

    @JsonProperty("MsiInterruptSupported")
    private String msiInterruptSupported;

    @JsonProperty("MsiXInterruptSupported")
    private String msiXInterruptSupported;

    @JsonProperty("PciXCurrentSpeedAndMode")
    private String pciXCurrentSpeedAndMode;

    @JsonProperty("PciExpressCurrentPayloadSize")
    private String pciExpressCurrentPayloadSize;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Segment")
    private String segment;

    @JsonProperty("PciDeviceType")
    private String pciDeviceType;

    @JsonProperty("PciExpressMaxLinkSpeedEncoded")
    private String pciExpressMaxLinkSpeedEncoded;

    @JsonProperty("FunctionNumber")
    private String functionNumber;

    @JsonProperty("PciDeviceLabelID")
    private String pciDeviceLabelID;

    @JsonProperty("PciExpressVersion")
    private String pciExpressVersion;

    @JsonProperty("SegmentNumber")
    private String segmentNumber;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("LineBasedInterrupts")
    private String lineBasedInterrupts;

    @JsonProperty("Bus")
    private String bus;

    @JsonProperty("MsiXSupported")
    private String msiXSupported;

}
