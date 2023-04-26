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
    public static final String[] COLUMN_NAMES = {"CwndRestart", "MemoryPressureProtection", "CongestionProvider", "AutoTuningLevelLocal", "EcnCapability", "Timestamps", "ScalingHeuristics", "AutoTuningLevelGroupPolicy", "AutoTuningLevelEffective", "AutomaticUseCustom", "NonSackRttResiliency", "ForceWS", "Caption", "Description", "ElementName", "InstanceID", "CommonName", "PolicyKeywords", "CreationClassName", "DoActionLogging", "PolicyActionName", "PolicyRuleCreationClassName", "PolicyRuleName", "SystemCreationClassName", "SystemName", "AutoReusePortRangeNumberOfPorts", "AutoReusePortRangeStartPort", "DelayedAckFrequency", "DelayedAckTimeout", "DynamicPortRangeNumberOfPorts", "DynamicPortRangeStartPort", "InitialCongestionWindow", "InitialRto", "MaxSynRetransmissions", "MinRto", "SettingName", "PSComputerName"};



    @JsonProperty("CwndRestart")
    private String cwndRestart;

    @JsonProperty("MemoryPressureProtection")
    private String memoryPressureProtection;

    @JsonProperty("CongestionProvider")
    private String congestionProvider;

    @JsonProperty("AutoTuningLevelLocal")
    private String autoTuningLevelLocal;

    @JsonProperty("EcnCapability")
    private String ecnCapability;

    @JsonProperty("Timestamps")
    private String timestamps;

    @JsonProperty("ScalingHeuristics")
    private String scalingHeuristics;

    @JsonProperty("AutoTuningLevelGroupPolicy")
    private String autoTuningLevelGroupPolicy;

    @JsonProperty("AutoTuningLevelEffective")
    private String autoTuningLevelEffective;

    @JsonProperty("AutomaticUseCustom")
    private String automaticUseCustom;

    @JsonProperty("NonSackRttResiliency")
    private String nonSackRttResiliency;

    @JsonProperty("ForceWS")
    private String forceWS;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CommonName")
    private String commonName;

    @JsonProperty("PolicyKeywords")
    private String policyKeywords;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("DoActionLogging")
    private String doActionLogging;

    @JsonProperty("PolicyActionName")
    private String policyActionName;

    @JsonProperty("PolicyRuleCreationClassName")
    private String policyRuleCreationClassName;

    @JsonProperty("PolicyRuleName")
    private String policyRuleName;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("AutoReusePortRangeNumberOfPorts")
    private String autoReusePortRangeNumberOfPorts;

    @JsonProperty("AutoReusePortRangeStartPort")
    private String autoReusePortRangeStartPort;

    @JsonProperty("DelayedAckFrequency")
    private String delayedAckFrequency;

    @JsonProperty("DelayedAckTimeout")
    private String delayedAckTimeout;

    @JsonProperty("DynamicPortRangeNumberOfPorts")
    private String dynamicPortRangeNumberOfPorts;

    @JsonProperty("DynamicPortRangeStartPort")
    private String dynamicPortRangeStartPort;

    @JsonProperty("InitialCongestionWindow")
    private String initialCongestionWindow;

    @JsonProperty("InitialRto")
    private String initialRto;

    @JsonProperty("MaxSynRetransmissions")
    private String maxSynRetransmissions;

    @JsonProperty("MinRto")
    private String minRto;

    @JsonProperty("SettingName")
    private String settingName;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
