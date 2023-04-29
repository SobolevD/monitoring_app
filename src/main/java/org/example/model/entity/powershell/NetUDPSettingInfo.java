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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "PolicyRuleCreationClassName", "DoActionLogging", "SystemCreationClassName", "Caption", "PolicyRuleName", "DynamicPortRangeNumberOfPorts", "CreationClassName", "PolicyActionName", "ElementName", "SystemName", "InstanceID", "CommonName", "DynamicPortRangeStartPort", "PolicyKeywords"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("PolicyRuleCreationClassName")
    private String policyRuleCreationClassName;

    @JsonProperty("DoActionLogging")
    private String doActionLogging;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("PolicyRuleName")
    private String policyRuleName;

    @JsonProperty("DynamicPortRangeNumberOfPorts")
    private String dynamicPortRangeNumberOfPorts;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("PolicyActionName")
    private String policyActionName;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CommonName")
    private String commonName;

    @JsonProperty("DynamicPortRangeStartPort")
    private String dynamicPortRangeStartPort;

    @JsonProperty("PolicyKeywords")
    private String policyKeywords;

}
