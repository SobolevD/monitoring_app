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
    public static final String[] COLUMN_NAMES = {"AllowComputerToTurnOffDevice", "D0PacketCoalescing", "DeviceSleepOnDisconnect", "ArpOffload", "NSOffload", "RsnRekeyOffload", "SelectiveSuspend", "WakeOnMagicPacket", "WakeOnPattern", "ifAlias", "InterfaceAlias", "ifDesc", "Caption", "Description", "ElementName", "InstanceID", "InterfaceDescription", "Name", "Source", "SystemName", "OffloadParameters", "WakePatterns", "PSComputerName"};

    @JsonProperty("AllowComputerToTurnOffDevice")
    private String allowComputerToTurnOffDevice;

    @JsonProperty("D0PacketCoalescing")
    private String d0PacketCoalescing;

    @JsonProperty("DeviceSleepOnDisconnect")
    private String deviceSleepOnDisconnect;

    @JsonProperty("ArpOffload")
    private String arpOffload;

    @JsonProperty("NSOffload")
    private String nSOffload;

    @JsonProperty("RsnRekeyOffload")
    private String rsnRekeyOffload;

    @JsonProperty("SelectiveSuspend")
    private String selectiveSuspend;

    @JsonProperty("WakeOnMagicPacket")
    private String wakeOnMagicPacket;

    @JsonProperty("WakeOnPattern")
    private String wakeOnPattern;

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

    @JsonProperty("OffloadParameters")
    private String offloadParameters;

    @JsonProperty("WakePatterns")
    private String wakePatterns;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
