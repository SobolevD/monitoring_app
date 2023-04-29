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
public class NetNatGlobalInfo {

    public static final String[] COLUMN_NAMES = {"InterRoutingDomainHairpinningMode", "PSComputerName", "Description", "ElementName", "InstanceID", "Caption"};

    @JsonProperty("InterRoutingDomainHairpinningMode")
    private String interRoutingDomainHairpinningMode;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Caption")
    private String caption;

}
