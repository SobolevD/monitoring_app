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
public class NetAdapterAdvancedPropertyInfo {
    public static final String[] COLUMN_NAMES = {"ValueName", "ValueData", "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "DefaultDisplayValue", "DefaultRegistryValue", "DisplayName", "DisplayParameterType", "DisplayValue", "NumericParameterBaseValue", "NumericParameterMaxValue", "NumericParameterMinValue", "NumericParameterStepValue", "Optional", "RegistryDataType", "RegistryKeyword", "RegistryValue", "ValidDisplayValues", "ValidRegistryValues", "PSComputerName"};

    @JsonProperty("ValueName")
    private String valueName;

    @JsonProperty("ValueData")
    private String valueData;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("DefaultDisplayValue")
    private String defaultDisplayValue;

    @JsonProperty("DefaultRegistryValue")
    private String defaultRegistryValue;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("DisplayParameterType")
    private String displayParameterType;

    @JsonProperty("DisplayValue")
    private String displayValue;

    @JsonProperty("NumericParameterBaseValue")
    private String numericParameterBaseValue;

    @JsonProperty("NumericParameterMaxValue")
    private String numericParameterMaxValue;

    @JsonProperty("NumericParameterMinValue")
    private String numericParameterMinValue;

    @JsonProperty("NumericParameterStepValue")
    private String numericParameterStepValue;

    @JsonProperty("Optional")
    private String optional;

    @JsonProperty("RegistryDataType")
    private String registryDataType;

    @JsonProperty("RegistryKeyword")
    private String registryKeyword;

    @JsonProperty("RegistryValue")
    private String registryValue;

    @JsonProperty("ValidDisplayValues")
    private String validDisplayValues;

    @JsonProperty("ValidRegistryValues")
    private String validRegistryValues;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
