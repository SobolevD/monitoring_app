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
public class NetAdapterChecksumOffloadInfo {
    public static final String[] COLUMN_NAMES = {"IpIPv4Enabled", "TcpIPv4Enabled", "TcpIPv6Enabled", "UdpIPv4Enabled", "UdpIPv6Enabled", "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "ChecksumOffloadHardwareCapabilities", "PSComputerName"};



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

    @JsonProperty("ChecksumOffloadHardwareCapabilities")
    private String checksumOffloadHardwareCapabilities;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
