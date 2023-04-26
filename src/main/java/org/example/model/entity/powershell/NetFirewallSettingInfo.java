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
public class NetFirewallSettingInfo {
    public static final String[] COLUMN_NAMES = {"Name", "Exemptions", "EnableStatefulFtp", "EnableStatefulPptp", "ActiveProfile", "RequireFullAuthSupport", "CertValidationLevel", "AllowIPsecThroughNAT", "MaxSAIdleTimeSeconds", "KeyEncoding", "EnablePacketQueuing", "Caption", "Description", "ElementName", "InstanceID", "Profile", "RemoteMachineTransportAuthorizationList", "RemoteMachineTunnelAuthorizationList", "RemoteUserTransportAuthorizationList", "RemoteUserTunnelAuthorizationList", "PSComputerName"};

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Exemptions")
    private String exemptions;

    @JsonProperty("EnableStatefulFtp")
    private String enableStatefulFtp;

    @JsonProperty("EnableStatefulPptp")
    private String enableStatefulPptp;

    @JsonProperty("ActiveProfile")
    private String activeProfile;

    @JsonProperty("RequireFullAuthSupport")
    private String requireFullAuthSupport;

    @JsonProperty("CertValidationLevel")
    private String certValidationLevel;

    @JsonProperty("AllowIPsecThroughNAT")
    private String allowIPsecThroughNAT;

    @JsonProperty("MaxSAIdleTimeSeconds")
    private String maxSAIdleTimeSeconds;

    @JsonProperty("KeyEncoding")
    private String keyEncoding;

    @JsonProperty("EnablePacketQueuing")
    private String enablePacketQueuing;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("RemoteMachineTransportAuthorizationList")
    private String remoteMachineTransportAuthorizationList;

    @JsonProperty("RemoteMachineTunnelAuthorizationList")
    private String remoteMachineTunnelAuthorizationList;

    @JsonProperty("RemoteUserTransportAuthorizationList")
    private String remoteUserTransportAuthorizationList;

    @JsonProperty("RemoteUserTunnelAuthorizationList")
    private String remoteUserTunnelAuthorizationList;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
