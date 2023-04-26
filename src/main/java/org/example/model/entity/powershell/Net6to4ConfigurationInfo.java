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
    public static final String[] COLUMN_NAMES = {"State", "AutoSharing", "RelayState", "Caption", "Description", "ElementName", "InstanceID", "PolicyStore", "RelayName", "ResolutionInterval", "PSComputerName"};

    @JsonProperty("State")
    private String state;

    @JsonProperty("AutoSharing")
    private String autoSharing;

    @JsonProperty("RelayState")
    private String relayState;

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

    @JsonProperty("RelayName")
    private String relayName;

    @JsonProperty("ResolutionInterval")
    private String resolutionInterval;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
