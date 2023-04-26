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
public class NetAdapterRscInfo {
    public static final String[] COLUMN_NAMES = {"IPv4FailureReason", "IPv6FailureReason", "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "IPv4Enabled", "IPv4OperationalState", "IPv6Enabled", "IPv6OperationalState", "RscHardwareCapabilities", "PSComputerName"};

    @JsonProperty("IPv4FailureReason")
    private String iPv4FailureReason;

    @JsonProperty("IPv6FailureReason")
    private String iPv6FailureReason;

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

    @JsonProperty("IPv4Enabled")
    private String iPv4Enabled;

    @JsonProperty("IPv4OperationalState")
    private String iPv4OperationalState;

    @JsonProperty("IPv6Enabled")
    private String iPv6Enabled;

    @JsonProperty("IPv6OperationalState")
    private String iPv6OperationalState;

    @JsonProperty("RscHardwareCapabilities")
    private String rscHardwareCapabilities;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
