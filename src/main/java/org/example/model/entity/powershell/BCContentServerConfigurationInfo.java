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
public class BCContentServerConfigurationInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "ElementName", "InstanceID", "Caption", "ContentServerIsEnabled"};

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

    @JsonProperty("ContentServerIsEnabled")
    private String contentServerIsEnabled;

}
