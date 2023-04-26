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
public class NetFirewallRuleInfo {
    public static final String[] COLUMN_NAMES = {"Name", "ID", "DisplayName", "Group", "Enabled", "Profile", "Platform", "Direction", "Action", "EdgeTraversalPolicy", "LSM", "PrimaryStatus", "Status", "EnforcementStatus", "PolicyStoreSourceType", "Caption", "Description", "ElementName", "InstanceID", "CommonName", "PolicyKeywords", "PolicyDecisionStrategy", "PolicyRoles", "ConditionListType", "CreationClassName", "ExecutionStrategy", "Mandatory", "PolicyRuleName", "Priority", "RuleUsage", "SequencedActions", "SystemCreationClassName", "SystemName", "DisplayGroup", "LocalOnlyMapping", "LooseSourceMapping", "Owner", "Platforms", "PolicyStoreSource", "Profiles", "RemoteDynamicKeywordAddresses", "RuleGroup", "StatusCode", "PSComputerName"};

    @JsonProperty("Name")
    private String name;

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("Group")
    private String group;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("Direction")
    private String direction;

    @JsonProperty("Action")
    private String action;

    @JsonProperty("EdgeTraversalPolicy")
    private String edgeTraversalPolicy;

    @JsonProperty("LSM")
    private String lSM;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("EnforcementStatus")
    private String enforcementStatus;

    @JsonProperty("PolicyStoreSourceType")
    private String policyStoreSourceType;

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

    @JsonProperty("PolicyDecisionStrategy")
    private String policyDecisionStrategy;

    @JsonProperty("PolicyRoles")
    private String policyRoles;

    @JsonProperty("ConditionListType")
    private String conditionListType;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("ExecutionStrategy")
    private String executionStrategy;

    @JsonProperty("Mandatory")
    private String mandatory;

    @JsonProperty("PolicyRuleName")
    private String policyRuleName;

    @JsonProperty("Priority")
    private String priority;

    @JsonProperty("RuleUsage")
    private String ruleUsage;

    @JsonProperty("SequencedActions")
    private String sequencedActions;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("DisplayGroup")
    private String displayGroup;

    @JsonProperty("LocalOnlyMapping")
    private String localOnlyMapping;

    @JsonProperty("LooseSourceMapping")
    private String looseSourceMapping;

    @JsonProperty("Owner")
    private String owner;

    @JsonProperty("Platforms")
    private String platforms;

    @JsonProperty("PolicyStoreSource")
    private String policyStoreSource;

    @JsonProperty("Profiles")
    private String profiles;

    @JsonProperty("RemoteDynamicKeywordAddresses")
    private String remoteDynamicKeywordAddresses;

    @JsonProperty("RuleGroup")
    private String ruleGroup;

    @JsonProperty("StatusCode")
    private String statusCode;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
