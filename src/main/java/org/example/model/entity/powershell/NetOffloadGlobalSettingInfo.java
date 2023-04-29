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
public class NetOffloadGlobalSettingInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "ElementName", "ReceiveSegmentCoalescing", "InstanceID", "TaskOffload", "Chimney", "NetworkDirect", "ReceiveSideScaling", "NetworkDirectAcrossIPSubnets", "PacketCoalescingFilter", "Caption"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("ReceiveSegmentCoalescing")
    private String receiveSegmentCoalescing;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("TaskOffload")
    private String taskOffload;

    @JsonProperty("Chimney")
    private String chimney;

    @JsonProperty("NetworkDirect")
    private String networkDirect;

    @JsonProperty("ReceiveSideScaling")
    private String receiveSideScaling;

    @JsonProperty("NetworkDirectAcrossIPSubnets")
    private String networkDirectAcrossIPSubnets;

    @JsonProperty("PacketCoalescingFilter")
    private String packetCoalescingFilter;

    @JsonProperty("Caption")
    private String caption;

}
