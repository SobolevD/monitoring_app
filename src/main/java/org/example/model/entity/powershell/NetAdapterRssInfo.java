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
public class NetAdapterRssInfo {

    public static final String[] COLUMN_NAMES = {"IndirectionTable", "InterfaceDescription", "ifDesc", "Enabled", "TcpIPv4HashEnabled", "ifAlias", "UdpIPv4HashEnabled", "IndirectionTableEntryCount", "ClassificationAtIsrSupported", "PSComputerName", "ClassificationAtDpcSupported", "NumberOfReceiveQueues", "MsiSupported", "BaseProcessorNumber", "ToeplitzHashFunctionEnabled", "UdpIPv4HashSupported", "NumaNode", "Source", "ToeplitzHashFunctionSupported", "ElementName", "SystemName", "UdpIPv6HashSupported", "InstanceID", "UdpIPv6ExtensionHashEnabled", "RssOnPortsSupported", "MaxProcessorGroup", "MsiXEnabled", "TcpIPv6ExtensionHashEnabled", "UdpIPv6HashEnabled", "IPv4HashEnabled", "IPv6ExtensionHashEnabled", "MaxProcessors", "Caption", "TcpIPv6HashSupported", "TcpIPv4HashSupported", "RssProcessorArraySize", "Description", "MaxProcessorNumber", "HashKeySize", "InterfaceAlias", "Name", "TcpIPv6HashEnabled", "Profile", "IPv6HashEnabled", "BaseProcessorGroup", "TcpIPv6ExtensionHashSupported", "UdpIPv6ExtensionHashSupported", "RssProcessorArray", "NumberOfInterruptMessages", "MsiXSupported"};

    @JsonProperty("IndirectionTable")
    private JsonNode indirectionTable;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("TcpIPv4HashEnabled")
    private String tcpIPv4HashEnabled;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("UdpIPv4HashEnabled")
    private String udpIPv4HashEnabled;

    @JsonProperty("IndirectionTableEntryCount")
    private String indirectionTableEntryCount;

    @JsonProperty("ClassificationAtIsrSupported")
    private String classificationAtIsrSupported;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ClassificationAtDpcSupported")
    private String classificationAtDpcSupported;

    @JsonProperty("NumberOfReceiveQueues")
    private String numberOfReceiveQueues;

    @JsonProperty("MsiSupported")
    private String msiSupported;

    @JsonProperty("BaseProcessorNumber")
    private String baseProcessorNumber;

    @JsonProperty("ToeplitzHashFunctionEnabled")
    private String toeplitzHashFunctionEnabled;

    @JsonProperty("UdpIPv4HashSupported")
    private String udpIPv4HashSupported;

    @JsonProperty("NumaNode")
    private String numaNode;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("ToeplitzHashFunctionSupported")
    private String toeplitzHashFunctionSupported;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("UdpIPv6HashSupported")
    private String udpIPv6HashSupported;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("UdpIPv6ExtensionHashEnabled")
    private String udpIPv6ExtensionHashEnabled;

    @JsonProperty("RssOnPortsSupported")
    private String rssOnPortsSupported;

    @JsonProperty("MaxProcessorGroup")
    private String maxProcessorGroup;

    @JsonProperty("MsiXEnabled")
    private String msiXEnabled;

    @JsonProperty("TcpIPv6ExtensionHashEnabled")
    private String tcpIPv6ExtensionHashEnabled;

    @JsonProperty("UdpIPv6HashEnabled")
    private String udpIPv6HashEnabled;

    @JsonProperty("IPv4HashEnabled")
    private String iPv4HashEnabled;

    @JsonProperty("IPv6ExtensionHashEnabled")
    private String iPv6ExtensionHashEnabled;

    @JsonProperty("MaxProcessors")
    private String maxProcessors;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("TcpIPv6HashSupported")
    private String tcpIPv6HashSupported;

    @JsonProperty("TcpIPv4HashSupported")
    private String tcpIPv4HashSupported;

    @JsonProperty("RssProcessorArraySize")
    private String rssProcessorArraySize;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("MaxProcessorNumber")
    private String maxProcessorNumber;

    @JsonProperty("HashKeySize")
    private String hashKeySize;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("TcpIPv6HashEnabled")
    private String tcpIPv6HashEnabled;

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("IPv6HashEnabled")
    private String iPv6HashEnabled;

    @JsonProperty("BaseProcessorGroup")
    private String baseProcessorGroup;

    @JsonProperty("TcpIPv6ExtensionHashSupported")
    private String tcpIPv6ExtensionHashSupported;

    @JsonProperty("UdpIPv6ExtensionHashSupported")
    private String udpIPv6ExtensionHashSupported;

    @JsonProperty("RssProcessorArray")
    private JsonNode rssProcessorArray;

    @JsonProperty("NumberOfInterruptMessages")
    private String numberOfInterruptMessages;

    @JsonProperty("MsiXSupported")
    private String msiXSupported;

}
