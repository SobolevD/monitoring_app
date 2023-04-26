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
public class NetFirewallProfileInfo {
    public static final String[] COLUMN_NAMES = {"Profile", "Enabled", "DefaultInboundAction", "DefaultOutboundAction", "AllowInboundRules", "AllowLocalFirewallRules", "AllowLocalIPsecRules", "AllowUserApps", "AllowUserPorts", "AllowUnicastResponseToMulticast", "NotifyOnListen", "EnableStealthModeForIPsec", "LogMaxSizeKilobytes", "LogAllowed", "LogBlocked", "LogIgnored", "Caption", "Description", "ElementName", "InstanceID", "DisabledInterfaceAliases", "LogFileName", "Name", "PSComputerName"};

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("DefaultInboundAction")
    private String defaultInboundAction;

    @JsonProperty("DefaultOutboundAction")
    private String defaultOutboundAction;

    @JsonProperty("AllowInboundRules")
    private String allowInboundRules;

    @JsonProperty("AllowLocalFirewallRules")
    private String allowLocalFirewallRules;

    @JsonProperty("AllowLocalIPsecRules")
    private String allowLocalIPsecRules;

    @JsonProperty("AllowUserApps")
    private String allowUserApps;

    @JsonProperty("AllowUserPorts")
    private String allowUserPorts;

    @JsonProperty("AllowUnicastResponseToMulticast")
    private String allowUnicastResponseToMulticast;

    @JsonProperty("NotifyOnListen")
    private String notifyOnListen;

    @JsonProperty("EnableStealthModeForIPsec")
    private String enableStealthModeForIPsec;

    @JsonProperty("LogMaxSizeKilobytes")
    private String logMaxSizeKilobytes;

    @JsonProperty("LogAllowed")
    private String logAllowed;

    @JsonProperty("LogBlocked")
    private String logBlocked;

    @JsonProperty("LogIgnored")
    private String logIgnored;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("DisabledInterfaceAliases")
    private String disabledInterfaceAliases;

    @JsonProperty("LogFileName")
    private String logFileName;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
