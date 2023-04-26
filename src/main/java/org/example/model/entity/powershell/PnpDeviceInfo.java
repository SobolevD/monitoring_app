package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PnpDeviceInfo {

    public static final String[] COLUMN_NAMES = {
            "Class", "FriendlyName",
            "InstanceId", "Problem", "ConfigManagerErrorCode", "ProblemDescription",
            "Caption", "Description", "InstallDate", "Name", "Status", "Availability",
            "ConfigManagerUserConfig", "CreationClassName", "DeviceID", "ErrorCleared",
            "ErrorDescription", "LastErrorCode", "PNPDeviceID", "PowerManagementCapabilities",
            "PowerManagementSupported", "StatusInfo", "SystemCreationClassName", "SystemName",
            "ClassGuid", "CompatibleID", "HardwareID", "Manufacturer", "PNPClass", "Present",
            "Service", "PSComputerName"
    };

    @JsonProperty("Class")
    private String clazz;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("InstanceId")
    private String instanceId;

    @JsonProperty("Problem")
    private String problem;

    @JsonProperty("ConfigManagerErrorCode")
    private String configManagerErrorCode;

    @JsonProperty("ProblemDescription")
    private JsonNode problemDescription;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Availability")
    private String availability;

    @JsonProperty("ConfigManagerUserConfig")
    private String configManagerUserConfig;

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("DeviceID")
    private String deviceID;

    @JsonProperty("ErrorCleared")
    private String errorCleared;

    @JsonProperty("ErrorDescription")
    private String errorDescription;

    @JsonProperty("LastErrorCode")
    private String lastErrorCode;

    @JsonProperty("PNPDeviceID")
    private String pnpDeviceID;

    @JsonProperty("PowerManagementCapabilities")
    private String powerManagementCapabilities;

    @JsonProperty("PowerManagementSupported")
    private String powerManagementSupported;

    @JsonProperty("StatusInfo")
    private String statusInfo;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("ClassGuid")
    private String classGuid;

    @JsonProperty("CompatibleID")
    private List<String> compatibleID;

    @JsonProperty("HardwareID")
    private List<String> hardwareID;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("PNPClass")
    private String pnpClass;

    @JsonProperty("Present")
    private String present;

    @JsonProperty("Service")
    private String service;

    @JsonProperty("PSComputerName")
    private String psComputerName;
}
