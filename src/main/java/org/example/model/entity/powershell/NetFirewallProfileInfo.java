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
public class NetFirewallProfileInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "DefaultInboundAction", "LogBlocked", "Description", "Enabled", "DisabledInterfaceAliases", "AllowUserApps", "AllowUnicastResponseToMulticast", "NotifyOnListen", "Caption", "Name", "Profile", "LogMaxSizeKilobytes", "LogFileName", "AllowUserPorts", "LogIgnored", "AllowLocalFirewallRules", "AllowLocalIPsecRules", "ElementName", "DefaultOutboundAction", "EnableStealthModeForIPsec", "LogAllowed", "InstanceID", "AllowInboundRules"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("DefaultInboundAction")
    private String defaultInboundAction;

    @JsonProperty("LogBlocked")
    private String logBlocked;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("DisabledInterfaceAliases")
    private JsonNode disabledInterfaceAliases;

    @JsonProperty("AllowUserApps")
    private String allowUserApps;

    @JsonProperty("AllowUnicastResponseToMulticast")
    private String allowUnicastResponseToMulticast;

    @JsonProperty("NotifyOnListen")
    private String notifyOnListen;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("LogMaxSizeKilobytes")
    private String logMaxSizeKilobytes;

    @JsonProperty("LogFileName")
    private String logFileName;

    @JsonProperty("AllowUserPorts")
    private String allowUserPorts;

    @JsonProperty("LogIgnored")
    private String logIgnored;

    @JsonProperty("AllowLocalFirewallRules")
    private String allowLocalFirewallRules;

    @JsonProperty("AllowLocalIPsecRules")
    private String allowLocalIPsecRules;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DefaultOutboundAction")
    private String defaultOutboundAction;

    @JsonProperty("EnableStealthModeForIPsec")
    private String enableStealthModeForIPsec;

    @JsonProperty("LogAllowed")
    private String logAllowed;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("AllowInboundRules")
    private String allowInboundRules;

}
