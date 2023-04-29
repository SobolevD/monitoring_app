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
public class NetAdapterLsoInfo {

    public static final String[] COLUMN_NAMES = {"LargeSendOffloadV1HardwareCapabilities", "PSComputerName", "IPv4Enabled", "Description", "InterfaceDescription", "IPv6Enabled", "ifDesc", "LargeSendOffloadV2HardwareCapabilities", "Caption", "InterfaceAlias", "Name", "Source", "MaximumLsoVersionSupported", "ifAlias", "ElementName", "SystemName", "Version", "InstanceID", "V1IPv4Enabled"};

    @JsonProperty("LargeSendOffloadV1HardwareCapabilities")
    private JsonNode largeSendOffloadV1HardwareCapabilities;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("IPv4Enabled")
    private String iPv4Enabled;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("IPv6Enabled")
    private String iPv6Enabled;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("LargeSendOffloadV2HardwareCapabilities")
    private JsonNode largeSendOffloadV2HardwareCapabilities;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("MaximumLsoVersionSupported")
    private String maximumLsoVersionSupported;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("V1IPv4Enabled")
    private String v1IPv4Enabled;

}
