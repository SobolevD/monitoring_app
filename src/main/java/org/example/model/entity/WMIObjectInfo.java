package org.example.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class WMIObjectInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "__GENUS",
            "__CLASS", "__SUPERCLASS", "__DYNASTY", "__RELPATH", "__PROPERTY_COUNT",
            "__DERIVATION", "__SERVER", "__NAMESPACE", "__PATH", "Availability",
            "Caption", "ConfigManagerErrorCode", "ConfigManagerUserConfig", "CreationClassName",
            "Description", "DeviceID", "ErrorCleared", "ErrorDescription", "InstallDate",
            "IsLocked", "LastErrorCode", "Layout", "Name", "NumberOfFunctionKeys", "Password",
            "PNPDeviceID", "PowerManagementCapabilities", "PowerManagementSupported", "Status",
            "StatusInfo", "SystemCreationClassName", "SystemName"};

    private String psComputerName;
    private String genus;
    private String clazz;
    private String superClass;
    private String dynasty;
    private String relpath;
    private String propertyCount;
    private String derivation;
    private String server;
    private String namespace;
    private String path;
    private String availability;
    private String caption;
    private String configManagerErrorCode;
    private String configManagerUserConfig;
    private String creationClassName;
    private String description;
    private String deviceId;
    private String errorCleared;
    private String errorDescription;
    private String installDate;
    private String isLocked;
    private String lastErrorCode;
    private String layout;
    private String name;
    private String numberOfFunctionKeys;
    private String password;
    private String pnpDeviceId;
    private String powerManagementCapabilities;
    private String powerManagementSupported;
    private String status;
    private String statusInfo;
    private String systemCreationClassName;
    private String systemName;
}
