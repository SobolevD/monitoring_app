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
    public static final String[] COLUMN_NAMES = {"ReceiveSideScaling", "ReceiveSegmentCoalescing", "Chimney", "TaskOffload", "NetworkDirect", "NetworkDirectAcrossIPSubnets", "PacketCoalescingFilter", "Caption", "Description", "ElementName", "InstanceID", "PSComputerName"};

    @JsonProperty("ReceiveSideScaling")
    private String receiveSideScaling;

    @JsonProperty("ReceiveSegmentCoalescing")
    private String receiveSegmentCoalescing;

    @JsonProperty("Chimney")
    private String chimney;

    @JsonProperty("TaskOffload")
    private String taskOffload;

    @JsonProperty("NetworkDirect")
    private String networkDirect;

    @JsonProperty("NetworkDirectAcrossIPSubnets")
    private String networkDirectAcrossIPSubnets;

    @JsonProperty("PacketCoalescingFilter")
    private String packetCoalescingFilter;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
