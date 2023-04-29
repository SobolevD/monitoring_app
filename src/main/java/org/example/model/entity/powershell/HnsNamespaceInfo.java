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
public class HnsNamespaceInfo {

    public static final String[] COLUMN_NAMES = {"IsDefault", "AdditionalParams", "Health", "ActivityId", "Flags", "Containers", "CompartmentId", "State", "ID", "Version", "Resources", "Policies", "CompartmentGuid"};

    @JsonProperty("IsDefault")
    private String isDefault;

    @JsonProperty("AdditionalParams")
    private JsonNode additionalParams;

    @JsonProperty("Health")
    private JsonNode health;

    @JsonProperty("ActivityId")
    private String activityId;

    @JsonProperty("Flags")
    private String flags;

    @JsonProperty("Containers")
    private JsonNode containers;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("State")
    private String state;

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Resources")
    private String resources;

    @JsonProperty("Policies")
    private JsonNode policies;

    @JsonProperty("CompartmentGuid")
    private String compartmentGuid;

}
