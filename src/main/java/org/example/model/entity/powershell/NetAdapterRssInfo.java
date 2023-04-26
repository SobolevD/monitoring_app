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
public class NetAdapterRssInfo {
    public static final String[] COLUMN_NAMES = {"Profile", "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "BaseProcessorGroup", "BaseProcessorNumber", "ClassificationAtDpcSupported", "ClassificationAtIsrSupported", "Enabled", "HashKeySize", "IndirectionTable", "IndirectionTableEntryCount", "IPv4HashEnabled", "IPv6ExtensionHashEnabled", "IPv6HashEnabled", "MaxProcessorGroup", "MaxProcessorNumber", "MaxProcessors", "MsiSupported", "MsiXEnabled", "MsiXSupported", "NumaNode", "NumberOfInterruptMessages", "NumberOfReceiveQueues", "RssOnPortsSupported", "RssProcessorArray", "RssProcessorArraySize", "TcpIPv4HashEnabled", "TcpIPv4HashSupported", "TcpIPv6ExtensionHashEnabled", "TcpIPv6ExtensionHashSupported", "TcpIPv6HashEnabled", "TcpIPv6HashSupported", "ToeplitzHashFunctionEnabled", "ToeplitzHashFunctionSupported", "UdpIPv4HashEnabled", "UdpIPv4HashSupported", "UdpIPv6ExtensionHashEnabled", "UdpIPv6ExtensionHashSupported", "UdpIPv6HashEnabled", "UdpIPv6HashSupported", "PSComputerName"};

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("ifDesc")
    private String ifDesc;

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

    @JsonProperty("BaseProcessorGroup")
    private String baseProcessorGroup;

    @JsonProperty("BaseProcessorNumber")
    private String baseProcessorNumber;

    @JsonProperty("ClassificationAtDpcSupported")
    private String classificationAtDpcSupported;

    @JsonProperty("ClassificationAtIsrSupported")
    private String classificationAtIsrSupported;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("HashKeySize")
    private String hashKeySize;

    @JsonProperty("IndirectionTable")
    private String indirectionTable;

    @JsonProperty("IndirectionTableEntryCount")
    private String indirectionTableEntryCount;

    @JsonProperty("IPv4HashEnabled")
    private String iPv4HashEnabled;

    @JsonProperty("IPv6ExtensionHashEnabled")
    private String iPv6ExtensionHashEnabled;

    @JsonProperty("IPv6HashEnabled")
    private String iPv6HashEnabled;

    @JsonProperty("MaxProcessorGroup")
    private String maxProcessorGroup;

    @JsonProperty("MaxProcessorNumber")
    private String maxProcessorNumber;

    @JsonProperty("MaxProcessors")
    private String maxProcessors;

    @JsonProperty("MsiSupported")
    private String msiSupported;

    @JsonProperty("MsiXEnabled")
    private String msiXEnabled;

    @JsonProperty("MsiXSupported")
    private String msiXSupported;

    @JsonProperty("NumaNode")
    private String numaNode;

    @JsonProperty("NumberOfInterruptMessages")
    private String numberOfInterruptMessages;

    @JsonProperty("NumberOfReceiveQueues")
    private String numberOfReceiveQueues;

    @JsonProperty("RssOnPortsSupported")
    private String rssOnPortsSupported;

    @JsonProperty("RssProcessorArray")
    private String rssProcessorArray;

    @JsonProperty("RssProcessorArraySize")
    private String rssProcessorArraySize;

    @JsonProperty("TcpIPv4HashEnabled")
    private String tcpIPv4HashEnabled;

    @JsonProperty("TcpIPv4HashSupported")
    private String tcpIPv4HashSupported;

    @JsonProperty("TcpIPv6ExtensionHashEnabled")
    private String tcpIPv6ExtensionHashEnabled;

    @JsonProperty("TcpIPv6ExtensionHashSupported")
    private String tcpIPv6ExtensionHashSupported;

    @JsonProperty("TcpIPv6HashEnabled")
    private String tcpIPv6HashEnabled;

    @JsonProperty("TcpIPv6HashSupported")
    private String tcpIPv6HashSupported;

    @JsonProperty("ToeplitzHashFunctionEnabled")
    private String toeplitzHashFunctionEnabled;

    @JsonProperty("ToeplitzHashFunctionSupported")
    private String toeplitzHashFunctionSupported;

    @JsonProperty("UdpIPv4HashEnabled")
    private String udpIPv4HashEnabled;

    @JsonProperty("UdpIPv4HashSupported")
    private String udpIPv4HashSupported;

    @JsonProperty("UdpIPv6ExtensionHashEnabled")
    private String udpIPv6ExtensionHashEnabled;

    @JsonProperty("UdpIPv6ExtensionHashSupported")
    private String udpIPv6ExtensionHashSupported;

    @JsonProperty("UdpIPv6HashEnabled")
    private String udpIPv6HashEnabled;

    @JsonProperty("UdpIPv6HashSupported")
    private String udpIPv6HashSupported;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
