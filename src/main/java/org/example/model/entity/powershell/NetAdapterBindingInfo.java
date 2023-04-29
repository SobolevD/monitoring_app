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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "ComponentClassName", "ComponentClassGuid", "Description", "InterfaceDescription", "ifDesc", "Enabled", "Caption", "InterfaceAlias", "Name", "Source", "BindName", "ifAlias", "ComponentID", "ElementName", "SystemName", "DisplayName", "InstanceID", "Characteristics"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ComponentClassName")
    private String componentClassName;

    @JsonProperty("ComponentClassGuid")
    private String componentClassGuid;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("BindName")
    private String bindName;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("ComponentID")
    private String componentID;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("Characteristics")
    private String characteristics;

}
