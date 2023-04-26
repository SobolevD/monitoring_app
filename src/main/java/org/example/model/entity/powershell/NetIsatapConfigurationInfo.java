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
public class NetIsatapConfigurationInfo {
    public static final String[] COLUMN_NAMES = {"State", "ResolutionState", "Caption", "Description", "ElementName", "InstanceID", "PolicyStore", "ResolutionInterval", "Router", "PSComputerName"};

    @JsonProperty("State")
    private String state;

    @JsonProperty("ResolutionState")
    private String resolutionState;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PolicyStore")
    private String policyStore;

    @JsonProperty("ResolutionInterval")
    private String resolutionInterval;

    @JsonProperty("Router")
    private String router;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
