package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AclInfo {

    public static final String[] COLUMN_NAMES = {"AccessRightType", "AccessRuleType", "AuditRuleType",
            "AreAccessRulesProtected", "AreAuditRulesProtected", "AreAccessRulesCanonical", "AreAuditRulesCanonical",
            "PSPath", "PSParentPath", "PSChildName", "PSDrive",
            "PSProvider", "CentralAccessPolicyId", "CentralAccessPolicyName", "Path",
            "Owner", "Group", "Access", "Sddl",
    "AccessToString", "AuditToString"};

    @JsonProperty("AccessRightType")
    private JsonNode accessRightType;

    @JsonProperty("AccessRuleType")
    private JsonNode accessRuleType;

    @JsonProperty("AuditRuleType")
    private JsonNode auditRuleType;

    @JsonProperty("AreAccessRulesProtected")
    private String areAccessRulesProtected;

    @JsonProperty("AreAuditRulesProtected")
    private String areAuditRulesProtected;

    @JsonProperty("AreAccessRulesCanonical")
    private String areAccessRulesCanonical;

    @JsonProperty("AreAuditRulesCanonical")
    private String areAuditRulesCanonical;

    @JsonProperty("PSPath")
    private String psPath;

    @JsonProperty("PSParentPath")
    private String psParentPath;

    @JsonProperty("PSChildName")
    private String psChildName;

    @JsonProperty("PSDrive")
    private JsonNode psDrive;

    @JsonProperty("PSProvider")
    private JsonNode psProvider;

    @JsonProperty("CentralAccessPolicyId")
    private String centralAccessPolicyId;

    @JsonProperty("CentralAccessPolicyName")
    private String centralAccessPolicyName;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("Owner")
    private String owner;

    @JsonProperty("Group")
    private String group;

    @JsonProperty("Access")
    private JsonNode access;

    @JsonProperty("Sddl")
    private String sddl;

    @JsonProperty("AccessToString")
    private String accessToString;

    @JsonProperty("AuditToString")
    private String auditToString;
}
