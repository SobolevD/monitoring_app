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
    public static final String[] COLUMN_NAMES = {"CompartmentType", "Caption", "Description", "ElementName", "InstanceID", "CompartmentDescription", "CompartmentGuid", "CompartmentId", "PSComputerName"};



    @JsonProperty("CompartmentType")
    private String compartmentType;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CompartmentDescription")
    private String compartmentDescription;

    @JsonProperty("CompartmentGuid")
    private String compartmentGuid;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
