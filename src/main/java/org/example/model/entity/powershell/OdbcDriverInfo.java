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
public class OdbcDriverInfo {
    public static final String[] COLUMN_NAMES = {"Attribute", "KeyValuePair", "Name", "Platform", "PSComputerName"};



    @JsonProperty("Attribute")
    private String attribute;

    @JsonProperty("KeyValuePair")
    private String keyValuePair;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
