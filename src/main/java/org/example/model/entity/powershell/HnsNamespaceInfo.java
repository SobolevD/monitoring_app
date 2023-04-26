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
public class HnsNamespaceInfo {
    public static final String[] COLUMN_NAMES = {"ActivityId", "AdditionalParams", "CompartmentGuid", "CompartmentId", "Containers", "Flags", "Health", "ID", "IsDefault", "Policies", "State", "Version", "Resources"};

    @JsonProperty("ActivityId")
    private String activityId;

    @JsonProperty("AdditionalParams")
    private String additionalParams;

    @JsonProperty("CompartmentGuid")
    private String compartmentGuid;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("Containers")
    private String containers;

    @JsonProperty("Flags")
    private String flags;

    @JsonProperty("Health")
    private String health;

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("IsDefault")
    private String isDefault;

    @JsonProperty("Policies")
    private String policies;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Resources")
    private String resources;

}
