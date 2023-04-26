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
public class NetAdapterLsoInfo {
    public static final String[] COLUMN_NAMES = {"ifAlias", "InterfaceAlias", "ifDesc", "Version", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "IPv4Enabled", "IPv6Enabled", "LargeSendOffloadV1HardwareCapabilities", "LargeSendOffloadV2HardwareCapabilities", "MaximumLsoVersionSupported", "V1IPv4Enabled", "PSComputerName"};

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Version")
    private String version;

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

    @JsonProperty("IPv4Enabled")
    private String iPv4Enabled;

    @JsonProperty("IPv6Enabled")
    private String iPv6Enabled;

    @JsonProperty("LargeSendOffloadV1HardwareCapabilities")
    private String largeSendOffloadV1HardwareCapabilities;

    @JsonProperty("LargeSendOffloadV2HardwareCapabilities")
    private String largeSendOffloadV2HardwareCapabilities;

    @JsonProperty("MaximumLsoVersionSupported")
    private String maximumLsoVersionSupported;

    @JsonProperty("V1IPv4Enabled")
    private String v1IPv4Enabled;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
