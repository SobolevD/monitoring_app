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
public class NetTCPSettingInfo {

    public static final String[] COLUMN_NAMES = {"CongestionProvider", "DoActionLogging", "AutomaticUseCustom", "Caption", "PolicyRuleName", "CreationClassName", "AutoReusePortRangeStartPort", "ForceWS", "AutoReusePortRangeNumberOfPorts", "ScalingHeuristics", "MinRto", "DelayedAckTimeout", "DynamicPortRangeStartPort", "PolicyKeywords", "PSComputerName", "MemoryPressureProtection", "EcnCapability", "Description", "AutoTuningLevelGroupPolicy", "PolicyRuleCreationClassName", "InitialCongestionWindow", "SettingName", "AutoTuningLevelEffective", "NonSackRttResiliency", "MaxSynRetransmissions", "SystemCreationClassName", "DynamicPortRangeNumberOfPorts", "PolicyActionName", "AutoTuningLevelLocal", "Timestamps", "DelayedAckFrequency", "InitialRto", "ElementName", "SystemName", "CwndRestart", "InstanceID", "CommonName"};

    @JsonProperty("CongestionProvider")
    private String congestionProvider;

    @JsonProperty("DoActionLogging")
    private String doActionLogging;

    @JsonProperty("AutomaticUseCustom")
    private String automaticUseCustom;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("PolicyRuleName")
    private String policyRuleName;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("AutoReusePortRangeStartPort")
    private String autoReusePortRangeStartPort;

    @JsonProperty("ForceWS")
    private String forceWS;

    @JsonProperty("AutoReusePortRangeNumberOfPorts")
    private String autoReusePortRangeNumberOfPorts;

    @JsonProperty("ScalingHeuristics")
    private String scalingHeuristics;

    @JsonProperty("MinRto")
    private String minRto;

    @JsonProperty("DelayedAckTimeout")
    private String delayedAckTimeout;

    @JsonProperty("DynamicPortRangeStartPort")
    private String dynamicPortRangeStartPort;

    @JsonProperty("PolicyKeywords")
    private String policyKeywords;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("MemoryPressureProtection")
    private String memoryPressureProtection;

    @JsonProperty("EcnCapability")
    private String ecnCapability;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("AutoTuningLevelGroupPolicy")
    private String autoTuningLevelGroupPolicy;

    @JsonProperty("PolicyRuleCreationClassName")
    private String policyRuleCreationClassName;

    @JsonProperty("InitialCongestionWindow")
    private String initialCongestionWindow;

    @JsonProperty("SettingName")
    private String settingName;

    @JsonProperty("AutoTuningLevelEffective")
    private String autoTuningLevelEffective;

    @JsonProperty("NonSackRttResiliency")
    private String nonSackRttResiliency;

    @JsonProperty("MaxSynRetransmissions")
    private String maxSynRetransmissions;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("DynamicPortRangeNumberOfPorts")
    private String dynamicPortRangeNumberOfPorts;

    @JsonProperty("PolicyActionName")
    private String policyActionName;

    @JsonProperty("AutoTuningLevelLocal")
    private String autoTuningLevelLocal;

    @JsonProperty("Timestamps")
    private String timestamps;

    @JsonProperty("DelayedAckFrequency")
    private String delayedAckFrequency;

    @JsonProperty("InitialRto")
    private String initialRto;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("CwndRestart")
    private String cwndRestart;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CommonName")
    private String commonName;

}
