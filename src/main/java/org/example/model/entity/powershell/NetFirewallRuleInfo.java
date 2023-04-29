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
public class NetFirewallRuleInfo {

    public static final String[] COLUMN_NAMES = {"Priority", "LooseSourceMapping", "Status", "LSM", "ConditionListType", "Enabled", "RemoteDynamicKeywordAddresses", "PrimaryStatus", "Caption", "EnforcementStatus", "PolicyStoreSourceType", "PolicyRuleName", "RuleGroup", "PolicyDecisionStrategy", "CreationClassName", "EdgeTraversalPolicy", "PolicyKeywords", "Mandatory", "Group", "PolicyStoreSource", "PSComputerName", "Action", "DisplayGroup", "Owner", "Description", "Platform", "SequencedActions", "SystemCreationClassName", "Direction", "StatusCode", "Name", "Profile", "PolicyRoles", "Profiles", "LocalOnlyMapping", "ElementName", "RuleUsage", "DisplayName", "SystemName", "ID", "InstanceID", "CommonName", "ExecutionStrategy", "Platforms"};

    @JsonProperty("Priority")
    private String priority;

    @JsonProperty("LooseSourceMapping")
    private String looseSourceMapping;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("LSM")
    private String lSM;

    @JsonProperty("ConditionListType")
    private String conditionListType;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("RemoteDynamicKeywordAddresses")
    private String remoteDynamicKeywordAddresses;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("EnforcementStatus")
    private String enforcementStatus;

    @JsonProperty("PolicyStoreSourceType")
    private String policyStoreSourceType;

    @JsonProperty("PolicyRuleName")
    private String policyRuleName;

    @JsonProperty("RuleGroup")
    private String ruleGroup;

    @JsonProperty("PolicyDecisionStrategy")
    private String policyDecisionStrategy;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("EdgeTraversalPolicy")
    private String edgeTraversalPolicy;

    @JsonProperty("PolicyKeywords")
    private String policyKeywords;

    @JsonProperty("Mandatory")
    private String mandatory;

    @JsonProperty("Group")
    private String group;

    @JsonProperty("PolicyStoreSource")
    private String policyStoreSource;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Action")
    private String action;

    @JsonProperty("DisplayGroup")
    private String displayGroup;

    @JsonProperty("Owner")
    private String owner;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Platform")
    private JsonNode platform;

    @JsonProperty("SequencedActions")
    private String sequencedActions;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("Direction")
    private String direction;

    @JsonProperty("StatusCode")
    private String statusCode;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Profile")
    private String profile;

    @JsonProperty("PolicyRoles")
    private String policyRoles;

    @JsonProperty("Profiles")
    private String profiles;

    @JsonProperty("LocalOnlyMapping")
    private String localOnlyMapping;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("RuleUsage")
    private String ruleUsage;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CommonName")
    private String commonName;

    @JsonProperty("ExecutionStrategy")
    private String executionStrategy;

    @JsonProperty("Platforms")
    private JsonNode platforms;

}
