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
public class NetAdapterRdmaInfo {
    public static final String[] COLUMN_NAMES = {"ifAlias", "InterfaceAlias", "ifDesc", "PFC", "ETS", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "Enabled", "MaxCompletionQueueCount", "MaxInboundReadLimit", "MaxMemoryRegionCount", "MaxMemoryWindowCount", "MaxOutboundReadLimit", "MaxProtectionDomainCount", "MaxQueuePairCount", "MaxSharedReceiveQueueCount", "RdmaAdapterInfo", "RdmaMissingCounterInfo", "PSComputerName"};

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("PFC")
    private String pFC;

    @JsonProperty("ETS")
    private String eTS;

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

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("MaxCompletionQueueCount")
    private String maxCompletionQueueCount;

    @JsonProperty("MaxInboundReadLimit")
    private String maxInboundReadLimit;

    @JsonProperty("MaxMemoryRegionCount")
    private String maxMemoryRegionCount;

    @JsonProperty("MaxMemoryWindowCount")
    private String maxMemoryWindowCount;

    @JsonProperty("MaxOutboundReadLimit")
    private String maxOutboundReadLimit;

    @JsonProperty("MaxProtectionDomainCount")
    private String maxProtectionDomainCount;

    @JsonProperty("MaxQueuePairCount")
    private String maxQueuePairCount;

    @JsonProperty("MaxSharedReceiveQueueCount")
    private String maxSharedReceiveQueueCount;

    @JsonProperty("RdmaAdapterInfo")
    private String rdmaAdapterInfo;

    @JsonProperty("RdmaMissingCounterInfo")
    private String rdmaMissingCounterInfo;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
