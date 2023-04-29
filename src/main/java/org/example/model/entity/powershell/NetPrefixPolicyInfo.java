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
public class NetPrefixPolicyInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "ElementName", "Prefix", "Store", "InstanceID", "Caption", "Label", "Precedence"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("Prefix")
    private String prefix;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Label")
    private String label;

    @JsonProperty("Precedence")
    private String precedence;

}
