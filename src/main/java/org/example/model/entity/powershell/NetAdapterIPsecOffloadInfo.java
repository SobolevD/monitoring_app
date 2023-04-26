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
public class NetAdapterIPsecOffloadInfo {

    public static final String[] COLUMN_NAMES = {"AuthenticationAlgorithmsEnabled", "AuthenticationAlgorithmsSupported", "EncryptionAlgorithmsEnabled", "EncryptionAlgorithmsSupported", "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "AhEnabled", "AhEspCombinedEnabled", "AhEspCombinedSupported", "AhSupported", "Enabled", "EspEnabled", "EspSupported", "IPv4OptionsEnabled", "IPv4OptionsSupported", "IPv6Enabled", "IPv6NonIPsecExtensionHeadersEnabled", "IPv6NonIPsecExtensionHeadersSupported", "IPv6Supported", "LsoEnabled", "LsoSupported", "SaOffloadCapacityEnabled", "SaOffloadCapacitySupported", "TransportEnabled", "TransportSupported", "TunnelEnabled", "TunnelSupported", "UdpEspEnabled", "UdpEspSupported", "PSComputerName"};

    @JsonProperty("AuthenticationAlgorithmsEnabled")
    private String authenticationAlgorithmsEnabled;

    @JsonProperty("AuthenticationAlgorithmsSupported")
    private String authenticationAlgorithmsSupported;

    @JsonProperty("EncryptionAlgorithmsEnabled")
    private String encryptionAlgorithmsEnabled;

    @JsonProperty("EncryptionAlgorithmsSupported")
    private String encryptionAlgorithmsSupported;

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

    @JsonProperty("AhEnabled")
    private String ahEnabled;

    @JsonProperty("AhEspCombinedEnabled")
    private String ahEspCombinedEnabled;

    @JsonProperty("AhEspCombinedSupported")
    private String ahEspCombinedSupported;

    @JsonProperty("AhSupported")
    private String ahSupported;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("EspEnabled")
    private String espEnabled;

    @JsonProperty("EspSupported")
    private String espSupported;

    @JsonProperty("IPv4OptionsEnabled")
    private String iPv4OptionsEnabled;

    @JsonProperty("IPv4OptionsSupported")
    private String iPv4OptionsSupported;

    @JsonProperty("IPv6Enabled")
    private String iPv6Enabled;

    @JsonProperty("IPv6NonIPsecExtensionHeadersEnabled")
    private String iPv6NonIPsecExtensionHeadersEnabled;

    @JsonProperty("IPv6NonIPsecExtensionHeadersSupported")
    private String iPv6NonIPsecExtensionHeadersSupported;

    @JsonProperty("IPv6Supported")
    private String iPv6Supported;

    @JsonProperty("LsoEnabled")
    private String lsoEnabled;

    @JsonProperty("LsoSupported")
    private String lsoSupported;

    @JsonProperty("SaOffloadCapacityEnabled")
    private String saOffloadCapacityEnabled;

    @JsonProperty("SaOffloadCapacitySupported")
    private String saOffloadCapacitySupported;

    @JsonProperty("TransportEnabled")
    private String transportEnabled;

    @JsonProperty("TransportSupported")
    private String transportSupported;

    @JsonProperty("TunnelEnabled")
    private String tunnelEnabled;

    @JsonProperty("TunnelSupported")
    private String tunnelSupported;

    @JsonProperty("UdpEspEnabled")
    private String udpEspEnabled;

    @JsonProperty("UdpEspSupported")
    private String udpEspSupported;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
