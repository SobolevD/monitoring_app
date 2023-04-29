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
public class NetAdapterRdmaInfo {

    public static final String[] COLUMN_NAMES = {"MaxMemoryRegionCount", "InterfaceDescription", "ifDesc", "Enabled", "Caption", "ifAlias", "MaxSharedReceiveQueueCount", "RdmaMissingCounterInfo", "MaxCompletionQueueCount", "MaxProtectionDomainCount", "MaxMemoryWindowCount", "PSComputerName", "ETS", "Description", "MaxInboundReadLimit", "PFC", "MaxQueuePairCount", "InterfaceAlias", "Name", "Source", "MaxOutboundReadLimit", "ElementName", "SystemName", "InstanceID", "RdmaAdapterInfo"};

    @JsonProperty("MaxMemoryRegionCount")
    private String maxMemoryRegionCount;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("Enabled")
    private String enabled;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("MaxSharedReceiveQueueCount")
    private String maxSharedReceiveQueueCount;

    @JsonProperty("RdmaMissingCounterInfo")
    private JsonNode rdmaMissingCounterInfo;

    @JsonProperty("MaxCompletionQueueCount")
    private String maxCompletionQueueCount;

    @JsonProperty("MaxProtectionDomainCount")
    private String maxProtectionDomainCount;

    @JsonProperty("MaxMemoryWindowCount")
    private String maxMemoryWindowCount;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ETS")
    private String eTS;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("MaxInboundReadLimit")
    private String maxInboundReadLimit;

    @JsonProperty("PFC")
    private String pFC;

    @JsonProperty("MaxQueuePairCount")
    private String maxQueuePairCount;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("MaxOutboundReadLimit")
    private String maxOutboundReadLimit;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("RdmaAdapterInfo")
    private JsonNode rdmaAdapterInfo;

}
