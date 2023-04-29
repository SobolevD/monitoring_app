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
public class Net6to4ConfigurationInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "ResolutionInterval", "Description", "State", "ElementName", "InstanceID", "PolicyStore", "AutoSharing", "RelayState", "RelayName", "Caption"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ResolutionInterval")
    private String resolutionInterval;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("State")
    private String state;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PolicyStore")
    private String policyStore;

    @JsonProperty("AutoSharing")
    private String autoSharing;

    @JsonProperty("RelayState")
    private String relayState;

    @JsonProperty("RelayName")
    private String relayName;

    @JsonProperty("Caption")
    private String caption;

}
