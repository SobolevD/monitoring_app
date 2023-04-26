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
public class OdbcDsnInfo {
    public static final String[] COLUMN_NAMES = {"Attribute", "PropertyValue", "DriverName", "DsnType", "KeyValuePair", "Name", "Platform", "PSComputerName"};



    @JsonProperty("Attribute")
    private String attribute;

    @JsonProperty("PropertyValue")
    private String propertyValue;

    @JsonProperty("DriverName")
    private String driverName;

    @JsonProperty("DsnType")
    private String dsnType;

    @JsonProperty("KeyValuePair")
    private String keyValuePair;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
