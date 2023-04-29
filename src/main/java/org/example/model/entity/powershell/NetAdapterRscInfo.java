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
public class NetAdapterRscInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "IPv4Enabled", "Description", "InterfaceDescription", "IPv6Enabled", "IPv6OperationalState", "IPv4FailureReason", "ifDesc", "IPv6FailureReason", "Caption", "InterfaceAlias", "Name", "Source", "IPv4OperationalState", "ifAlias", "ElementName", "RscHardwareCapabilities", "SystemName", "InstanceID"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("IPv4Enabled")
    private String iPv4Enabled;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("IPv6Enabled")
    private String iPv6Enabled;

    @JsonProperty("IPv6OperationalState")
    private String iPv6OperationalState;

    @JsonProperty("IPv4FailureReason")
    private String iPv4FailureReason;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("IPv6FailureReason")
    private String iPv6FailureReason;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("IPv4OperationalState")
    private String iPv4OperationalState;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("RscHardwareCapabilities")
    private JsonNode rscHardwareCapabilities;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

}
