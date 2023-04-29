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
public class NetAdapterAdvancedPropertyInfo {

    public static final String[] COLUMN_NAMES = {"InterfaceDescription", "DisplayValue", "ValidRegistryValues", "ifDesc", "Caption", "ValueName", "ifAlias", "RegistryValue", "NumericParameterBaseValue", "NumericParameterMaxValue", "NumericParameterMinValue", "DisplayParameterType", "RegistryDataType", "RegistryKeyword", "PSComputerName", "Description", "NumericParameterStepValue", "DefaultDisplayValue", "InterfaceAlias", "Name", "Source", "ElementName", "ValidDisplayValues", "SystemName", "DisplayName", "InstanceID", "Optional", "ValueData", "DefaultRegistryValue"};

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("DisplayValue")
    private String displayValue;

    @JsonProperty("ValidRegistryValues")
    private JsonNode validRegistryValues;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("ValueName")
    private String valueName;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("RegistryValue")
    private JsonNode registryValue;

    @JsonProperty("NumericParameterBaseValue")
    private String numericParameterBaseValue;

    @JsonProperty("NumericParameterMaxValue")
    private String numericParameterMaxValue;

    @JsonProperty("NumericParameterMinValue")
    private String numericParameterMinValue;

    @JsonProperty("DisplayParameterType")
    private String displayParameterType;

    @JsonProperty("RegistryDataType")
    private String registryDataType;

    @JsonProperty("RegistryKeyword")
    private String registryKeyword;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("NumericParameterStepValue")
    private String numericParameterStepValue;

    @JsonProperty("DefaultDisplayValue")
    private String defaultDisplayValue;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("ValidDisplayValues")
    private JsonNode validDisplayValues;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Optional")
    private String optional;

    @JsonProperty("ValueData")
    private JsonNode valueData;

    @JsonProperty("DefaultRegistryValue")
    private String defaultRegistryValue;

}
