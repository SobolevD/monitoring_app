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
public class NetAdapterBindingInfo {
    public static final String[] COLUMN_NAMES = { "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "BindName", "Characteristics", "ComponentClassGuid", "ComponentClassName", "ComponentID", "DisplayName", "Enabled", "PSComputerName"};

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

    @JsonProperty("BindName")
    private String bindName;

    @JsonProperty("Characteristics")
    private String characteristics;

    @JsonProperty("ComponentClassGuid")
    private String componentClassGuid;

    @JsonProperty("ComponentClassName")
    private String componentClassName;

    @JsonProperty("ComponentID")
    private String componentID;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
