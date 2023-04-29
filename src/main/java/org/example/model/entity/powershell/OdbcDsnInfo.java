package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OdbcDsnInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Attribute", "DsnType", "KeyValuePair", "Platform", "DriverName", "PropertyValue", "Name"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Attribute")
    private JsonNode attribute;

    @JsonProperty("DsnType")
    private String dsnType;

    @JsonProperty("KeyValuePair")
    private JsonNode keyValuePair;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("DriverName")
    private String driverName;

    @JsonProperty("PropertyValue")
    private JsonNode propertyValue;

    @JsonProperty("Name")
    private String name;

}
