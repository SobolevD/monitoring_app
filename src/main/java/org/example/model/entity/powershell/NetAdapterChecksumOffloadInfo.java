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
public class NetAdapterChecksumOffloadInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "InterfaceDescription", "ifDesc", "ChecksumOffloadHardwareCapabilities", "Caption", "InterfaceAlias", "Name", "Source", "ifAlias", "ElementName", "SystemName", "InstanceID", "IpIPv4Enabled", "TcpIPv4Enabled", "TcpIPv6Enabled", "UdpIPv4Enabled", "UdpIPv6Enabled"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("ChecksumOffloadHardwareCapabilities")
    private JsonNode checksumOffloadHardwareCapabilities;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("IpIPv4Enabled")
    private String ipIPv4Enabled;

    @JsonProperty("TcpIPv4Enabled")
    private String tcpIPv4Enabled;

    @JsonProperty("TcpIPv6Enabled")
    private String tcpIPv6Enabled;

    @JsonProperty("UdpIPv4Enabled")
    private String udpIPv4Enabled;

    @JsonProperty("UdpIPv6Enabled")
    private String udpIPv6Enabled;

}
