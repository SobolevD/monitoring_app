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
public class NetUDPSettingInfo {
    public static final String[] COLUMN_NAMES = {"Caption", "Description", "ElementName", "InstanceID", "CommonName", "PolicyKeywords", "CreationClassName", "DoActionLogging", "PolicyActionName", "PolicyRuleCreationClassName", "PolicyRuleName", "SystemCreationClassName", "SystemName", "DynamicPortRangeNumberOfPorts", "DynamicPortRangeStartPort", "PSComputerName"};

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

    @JsonProperty("DynamicPortRangeNumberOfPorts")
    private String dynamicPortRangeNumberOfPorts;

    @JsonProperty("DynamicPortRangeStartPort")
    private String dynamicPortRangeStartPort;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
