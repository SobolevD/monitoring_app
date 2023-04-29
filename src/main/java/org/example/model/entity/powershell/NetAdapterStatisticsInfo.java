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
public class NetAdapterStatisticsInfo {

    public static final String[] COLUMN_NAMES = {"ReceivedMulticastPackets", "InterfaceDescription", "ifDesc", "ReceivedDiscardedPackets", "ReceivedBroadcastPackets", "Caption", "ifAlias", "SentUnicastPackets", "SentUnicastBytes", "SupportedStatistics", "PSComputerName", "OutboundPacketErrors", "RscStatistics", "ReceivedBroadcastBytes", "ReceivedBytes", "Description", "ReceivedPacketErrors", "SentBroadcastPackets", "OutboundDiscardedPackets", "ReceivedUnicastPackets", "InterfaceAlias", "Name", "Source", "SentBroadcastBytes", "SentBytes", "ElementName", "SystemName", "InstanceID", "RdmaStatistics", "ReceivedUnicastBytes", "SentMulticastBytes", "SentMulticastPackets", "ReceivedMulticastBytes"};

    @JsonProperty("ReceivedMulticastPackets")
    private String receivedMulticastPackets;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("ReceivedDiscardedPackets")
    private String receivedDiscardedPackets;

    @JsonProperty("ReceivedBroadcastPackets")
    private String receivedBroadcastPackets;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("SentUnicastPackets")
    private String sentUnicastPackets;

    @JsonProperty("SentUnicastBytes")
    private String sentUnicastBytes;

    @JsonProperty("SupportedStatistics")
    private String supportedStatistics;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("OutboundPacketErrors")
    private String outboundPacketErrors;

    @JsonProperty("RscStatistics")
    private JsonNode rscStatistics;

    @JsonProperty("ReceivedBroadcastBytes")
    private String receivedBroadcastBytes;

    @JsonProperty("ReceivedBytes")
    private String receivedBytes;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ReceivedPacketErrors")
    private String receivedPacketErrors;

    @JsonProperty("SentBroadcastPackets")
    private String sentBroadcastPackets;

    @JsonProperty("OutboundDiscardedPackets")
    private String outboundDiscardedPackets;

    @JsonProperty("ReceivedUnicastPackets")
    private String receivedUnicastPackets;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("SentBroadcastBytes")
    private String sentBroadcastBytes;

    @JsonProperty("SentBytes")
    private String sentBytes;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("RdmaStatistics")
    private JsonNode rdmaStatistics;

    @JsonProperty("ReceivedUnicastBytes")
    private String receivedUnicastBytes;

    @JsonProperty("SentMulticastBytes")
    private String sentMulticastBytes;

    @JsonProperty("SentMulticastPackets")
    private String sentMulticastPackets;

    @JsonProperty("ReceivedMulticastBytes")
    private String receivedMulticastBytes;

}
