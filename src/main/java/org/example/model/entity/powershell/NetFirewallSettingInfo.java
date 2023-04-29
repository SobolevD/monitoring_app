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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "ActiveProfile", "AllowIPsecThroughNAT", "Description", "RemoteUserTransportAuthorizationList", "Caption", "Name", "Profile", "RequireFullAuthSupport", "EnablePacketQueuing", "RemoteUserTunnelAuthorizationList", "CertValidationLevel", "EnableStatefulFtp", "RemoteMachineTunnelAuthorizationList", "ElementName", "Exemptions", "InstanceID", "RemoteMachineTransportAuthorizationList", "EnableStatefulPptp", "KeyEncoding", "MaxSAIdleTimeSeconds"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ActiveProfile")
    private String activeProfile;

    @JsonProperty("AllowIPsecThroughNAT")
    private String allowIPsecThroughNAT;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("RemoteUserTransportAuthorizationList")
    private String remoteUserTransportAuthorizationList;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("RequireFullAuthSupport")
    private String requireFullAuthSupport;

    @JsonProperty("EnablePacketQueuing")
    private String enablePacketQueuing;

    @JsonProperty("RemoteUserTunnelAuthorizationList")
    private String remoteUserTunnelAuthorizationList;

    @JsonProperty("CertValidationLevel")
    private String certValidationLevel;

    @JsonProperty("EnableStatefulFtp")
    private String enableStatefulFtp;

    @JsonProperty("RemoteMachineTunnelAuthorizationList")
    private String remoteMachineTunnelAuthorizationList;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("Exemptions")
    private String exemptions;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("RemoteMachineTransportAuthorizationList")
    private String remoteMachineTransportAuthorizationList;

    @JsonProperty("EnableStatefulPptp")
    private String enableStatefulPptp;

    @JsonProperty("KeyEncoding")
    private String keyEncoding;

    @JsonProperty("MaxSAIdleTimeSeconds")
    private String maxSAIdleTimeSeconds;

}
