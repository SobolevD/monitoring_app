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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "ResolutionState", "ResolutionInterval", "Description", "State", "ElementName", "Router", "InstanceID", "PolicyStore", "Caption"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ResolutionState")
    private String resolutionState;

    @JsonProperty("ResolutionInterval")
    private String resolutionInterval;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("State")
    private String state;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("Router")
    private String router;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PolicyStore")
    private String policyStore;

    @JsonProperty("Caption")
    private String caption;

}
