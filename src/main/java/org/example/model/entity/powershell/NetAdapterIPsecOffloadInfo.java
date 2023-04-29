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

    public static final String[] COLUMN_NAMES = {"SaOffloadCapacitySupported", "InterfaceDescription", "IPv6Enabled", "ifDesc", "Enabled", "EspSupported", "EspEnabled", "AuthenticationAlgorithmsSupported", "EncryptionAlgorithmsSupported", "Caption", "IPv6NonIPsecExtensionHeadersSupported", "EncryptionAlgorithmsEnabled", "LsoSupported", "ifAlias", "AhEspCombinedSupported", "AuthenticationAlgorithmsEnabled", "IPv4OptionsEnabled", "AhEspCombinedEnabled", "TunnelSupported", "IPv6NonIPsecExtensionHeadersEnabled", "PSComputerName", "Description", "IPv4OptionsSupported", "SaOffloadCapacityEnabled", "TransportSupported", "IPv6Supported", "AhSupported", "InterfaceAlias", "Name", "LsoEnabled", "Source", "TunnelEnabled", "TransportEnabled", "UdpEspEnabled", "ElementName", "SystemName", "InstanceID", "AhEnabled", "UdpEspSupported"};

    @JsonProperty("SaOffloadCapacitySupported")
    private String saOffloadCapacitySupported;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("IPv6Enabled")
    private String iPv6Enabled;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("EspSupported")
    private String espSupported;

    @JsonProperty("EspEnabled")
    private String espEnabled;

    @JsonProperty("AuthenticationAlgorithmsSupported")
    private String authenticationAlgorithmsSupported;

    @JsonProperty("EncryptionAlgorithmsSupported")
    private String encryptionAlgorithmsSupported;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("IPv6NonIPsecExtensionHeadersSupported")
    private String iPv6NonIPsecExtensionHeadersSupported;

    @JsonProperty("EncryptionAlgorithmsEnabled")
    private String encryptionAlgorithmsEnabled;

    @JsonProperty("LsoSupported")
    private String lsoSupported;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("AhEspCombinedSupported")
    private String ahEspCombinedSupported;

    @JsonProperty("AuthenticationAlgorithmsEnabled")
    private String authenticationAlgorithmsEnabled;

    @JsonProperty("IPv4OptionsEnabled")
    private String iPv4OptionsEnabled;

    @JsonProperty("AhEspCombinedEnabled")
    private String ahEspCombinedEnabled;

    @JsonProperty("TunnelSupported")
    private String tunnelSupported;

    @JsonProperty("IPv6NonIPsecExtensionHeadersEnabled")
    private String iPv6NonIPsecExtensionHeadersEnabled;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("IPv4OptionsSupported")
    private String iPv4OptionsSupported;

    @JsonProperty("SaOffloadCapacityEnabled")
    private String saOffloadCapacityEnabled;

    @JsonProperty("TransportSupported")
    private String transportSupported;

    @JsonProperty("IPv6Supported")
    private String iPv6Supported;

    @JsonProperty("AhSupported")
    private String ahSupported;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("LsoEnabled")
    private String lsoEnabled;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("TunnelEnabled")
    private String tunnelEnabled;

    @JsonProperty("TransportEnabled")
    private String transportEnabled;

    @JsonProperty("UdpEspEnabled")
    private String udpEspEnabled;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("AhEnabled")
    private String ahEnabled;

    @JsonProperty("UdpEspSupported")
    private String udpEspSupported;

}
