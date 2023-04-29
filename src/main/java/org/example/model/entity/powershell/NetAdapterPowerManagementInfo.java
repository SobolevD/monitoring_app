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
public class NetAdapterPowerManagementInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "InterfaceDescription", "ifDesc", "NSOffload", "Caption", "InterfaceAlias", "Name", "Source", "D0PacketCoalescing", "DeviceSleepOnDisconnect", "ifAlias", "WakePatterns", "WakeOnPattern", "RsnRekeyOffload", "SelectiveSuspend", "ElementName", "ArpOffload", "OffloadParameters", "SystemName", "InstanceID", "WakeOnMagicPacket", "AllowComputerToTurnOffDevice"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("ifDesc")
    private String ifDesc;

    @JsonProperty("NSOffload")
    private String nSOffload;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Source")
    private String source;

    @JsonProperty("D0PacketCoalescing")
    private String d0PacketCoalescing;

    @JsonProperty("DeviceSleepOnDisconnect")
    private String deviceSleepOnDisconnect;

    @JsonProperty("ifAlias")
    private String ifAlias;

    @JsonProperty("WakePatterns")
    private String wakePatterns;

    @JsonProperty("WakeOnPattern")
    private String wakeOnPattern;

    @JsonProperty("RsnRekeyOffload")
    private String rsnRekeyOffload;

    @JsonProperty("SelectiveSuspend")
    private String selectiveSuspend;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("ArpOffload")
    private String arpOffload;

    @JsonProperty("OffloadParameters")
    private String offloadParameters;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("WakeOnMagicPacket")
    private String wakeOnMagicPacket;

    @JsonProperty("AllowComputerToTurnOffDevice")
    private String allowComputerToTurnOffDevice;

}
