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
public class NetAdapterStatisticsInfo {
    public static final String[] COLUMN_NAMES = {"ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "OutboundDiscardedPackets", "OutboundPacketErrors", "RdmaStatistics", "ReceivedBroadcastBytes", "ReceivedBroadcastPackets", "ReceivedBytes", "ReceivedDiscardedPackets", "ReceivedMulticastBytes", "ReceivedMulticastPackets", "ReceivedPacketErrors", "ReceivedUnicastBytes", "ReceivedUnicastPackets", "RscStatistics", "SentBroadcastBytes", "SentBroadcastPackets", "SentBytes", "SentMulticastBytes", "SentMulticastPackets", "SentUnicastBytes", "SentUnicastPackets", "SupportedStatistics", "PSComputerName"};



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

    @JsonProperty("OutboundDiscardedPackets")
    private String outboundDiscardedPackets;

    @JsonProperty("OutboundPacketErrors")
    private String outboundPacketErrors;

    @JsonProperty("RdmaStatistics")
    private String rdmaStatistics;

    @JsonProperty("ReceivedBroadcastBytes")
    private String receivedBroadcastBytes;

    @JsonProperty("ReceivedBroadcastPackets")
    private String receivedBroadcastPackets;

    @JsonProperty("ReceivedBytes")
    private String receivedBytes;

    @JsonProperty("ReceivedDiscardedPackets")
    private String receivedDiscardedPackets;

    @JsonProperty("ReceivedMulticastBytes")
    private String receivedMulticastBytes;

    @JsonProperty("ReceivedMulticastPackets")
    private String receivedMulticastPackets;

    @JsonProperty("ReceivedPacketErrors")
    private String receivedPacketErrors;

    @JsonProperty("ReceivedUnicastBytes")
    private String receivedUnicastBytes;

    @JsonProperty("ReceivedUnicastPackets")
    private String receivedUnicastPackets;

    @JsonProperty("RscStatistics")
    private String rscStatistics;

    @JsonProperty("SentBroadcastBytes")
    private String sentBroadcastBytes;

    @JsonProperty("SentBroadcastPackets")
    private String sentBroadcastPackets;

    @JsonProperty("SentBytes")
    private String sentBytes;

    @JsonProperty("SentMulticastBytes")
    private String sentMulticastBytes;

    @JsonProperty("SentMulticastPackets")
    private String sentMulticastPackets;

    @JsonProperty("SentUnicastBytes")
    private String sentUnicastBytes;

    @JsonProperty("SentUnicastPackets")
    private String sentUnicastPackets;

    @JsonProperty("SupportedStatistics")
    private String supportedStatistics;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
