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
public class NetCompartmentInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "CompartmentId", "Description", "CompartmentType", "ElementName", "CompartmentDescription", "InstanceID", "Caption", "CompartmentGuid"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CompartmentType")
    private String compartmentType;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("CompartmentDescription")
    private String compartmentDescription;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("CompartmentGuid")
    private String compartmentGuid;

}
