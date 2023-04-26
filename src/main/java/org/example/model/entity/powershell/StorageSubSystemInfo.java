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
public class StorageSubSystemInfo {
    public static final String[] COLUMN_NAMES = {"NameFormat", "HealthStatus", "OperationalStatus", "FaultDomainAwarenessDefault", "MaskingValidInitiatorIdTypes", "MaskingPortsPerView", "DataTieringType", "iSCSITargetCreationScheme", "SupportedHostType", "SupportedDeduplicationObjectTypes", "SupportedDeduplicationFileSystemTypes", "SupportedFileSystems", "StorageConnectionType", "SupportedFileServerProtocols", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "AutomaticClusteringEnabled", "CimServerName", "CurrentCacheLevel", "Description", "FirmwareVersion", "FriendlyName", "Manufacturer", "MaskingClientSelectableDeviceNumbers", "MaskingMapCountMax", "MaskingOneInitiatorIdPerView", "MaskingOtherValidInitiatorIdTypes", "Model", "Name", "NumberOfSlots", "OtherHostTypeDescription", "OtherIdentifyingInfo", "OtherIdentifyingInfoDescription", "OtherOperationalStatusDescription", "PhysicalDisksPerStoragePoolMin", "ReplicasPerSourceCloneMax", "ReplicasPerSourceMirrorMax", "ReplicasPerSourceSnapshotMax", "SerialNumber", "SupportsAutomaticStoragePoolSelection", "SupportsCloneLocal", "SupportsCloneRemote", "SupportsContinuouslyAvailableFileServer", "SupportsFileServer", "SupportsFileServerCreation", "SupportsMaskingVirtualDiskToHosts", "SupportsMirrorLocal", "SupportsMirrorRemote", "SupportsMultipleResiliencySettingsPerStoragePool", "SupportsSnapshotLocal", "SupportsSnapshotRemote", "SupportsStoragePoolAddPhysicalDisk", "SupportsStoragePoolCreation", "SupportsStoragePoolDeletion", "SupportsStoragePoolFriendlyNameModification", "SupportsStoragePoolRemovePhysicalDisk", "SupportsStorageTierCreation", "SupportsStorageTierDeletion", "SupportsStorageTieredVirtualDiskCreation", "SupportsStorageTierFriendlyNameModification", "SupportsStorageTierResize", "SupportsVirtualDiskCapacityExpansion", "SupportsVirtualDiskCapacityReduction", "SupportsVirtualDiskCreation", "SupportsVirtualDiskDeletion", "SupportsVirtualDiskModification", "SupportsVirtualDiskRepair", "SupportsVolumeCreation", "Tag", "VirtualDiskRepairEnabled", "PSComputerName"};

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("FaultDomainAwarenessDefault")
    private String faultDomainAwarenessDefault;

    @JsonProperty("MaskingValidInitiatorIdTypes")
    private String maskingValidInitiatorIdTypes;

    @JsonProperty("MaskingPortsPerView")
    private String maskingPortsPerView;

    @JsonProperty("DataTieringType")
    private String dataTieringType;

    @JsonProperty("iSCSITargetCreationScheme")
    private String iSCSITargetCreationScheme;

    @JsonProperty("SupportedHostType")
    private String supportedHostType;

    @JsonProperty("SupportedDeduplicationObjectTypes")
    private String supportedDeduplicationObjectTypes;

    @JsonProperty("SupportedDeduplicationFileSystemTypes")
    private String supportedDeduplicationFileSystemTypes;

    @JsonProperty("SupportedFileSystems")
    private String supportedFileSystems;

    @JsonProperty("StorageConnectionType")
    private String storageConnectionType;

    @JsonProperty("SupportedFileServerProtocols")
    private String supportedFileServerProtocols;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("AutomaticClusteringEnabled")
    private String automaticClusteringEnabled;

    @JsonProperty("CimServerName")
    private String cimServerName;

    @JsonProperty("CurrentCacheLevel")
    private String currentCacheLevel;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("MaskingClientSelectableDeviceNumbers")
    private String maskingClientSelectableDeviceNumbers;

    @JsonProperty("MaskingMapCountMax")
    private String maskingMapCountMax;

    @JsonProperty("MaskingOneInitiatorIdPerView")
    private String maskingOneInitiatorIdPerView;

    @JsonProperty("MaskingOtherValidInitiatorIdTypes")
    private String maskingOtherValidInitiatorIdTypes;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("NumberOfSlots")
    private String numberOfSlots;

    @JsonProperty("OtherHostTypeDescription")
    private String otherHostTypeDescription;

    @JsonProperty("OtherIdentifyingInfo")
    private String otherIdentifyingInfo;

    @JsonProperty("OtherIdentifyingInfoDescription")
    private String otherIdentifyingInfoDescription;

    @JsonProperty("OtherOperationalStatusDescription")
    private String otherOperationalStatusDescription;

    @JsonProperty("PhysicalDisksPerStoragePoolMin")
    private String physicalDisksPerStoragePoolMin;

    @JsonProperty("ReplicasPerSourceCloneMax")
    private String replicasPerSourceCloneMax;

    @JsonProperty("ReplicasPerSourceMirrorMax")
    private String replicasPerSourceMirrorMax;

    @JsonProperty("ReplicasPerSourceSnapshotMax")
    private String replicasPerSourceSnapshotMax;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("SupportsAutomaticStoragePoolSelection")
    private String supportsAutomaticStoragePoolSelection;

    @JsonProperty("SupportsCloneLocal")
    private String supportsCloneLocal;

    @JsonProperty("SupportsCloneRemote")
    private String supportsCloneRemote;

    @JsonProperty("SupportsContinuouslyAvailableFileServer")
    private String supportsContinuouslyAvailableFileServer;

    @JsonProperty("SupportsFileServer")
    private String supportsFileServer;

    @JsonProperty("SupportsFileServerCreation")
    private String supportsFileServerCreation;

    @JsonProperty("SupportsMaskingVirtualDiskToHosts")
    private String supportsMaskingVirtualDiskToHosts;

    @JsonProperty("SupportsMirrorLocal")
    private String supportsMirrorLocal;

    @JsonProperty("SupportsMirrorRemote")
    private String supportsMirrorRemote;

    @JsonProperty("SupportsMultipleResiliencySettingsPerStoragePool")
    private String supportsMultipleResiliencySettingsPerStoragePool;

    @JsonProperty("SupportsSnapshotLocal")
    private String supportsSnapshotLocal;

    @JsonProperty("SupportsSnapshotRemote")
    private String supportsSnapshotRemote;

    @JsonProperty("SupportsStoragePoolAddPhysicalDisk")
    private String supportsStoragePoolAddPhysicalDisk;

    @JsonProperty("SupportsStoragePoolCreation")
    private String supportsStoragePoolCreation;

    @JsonProperty("SupportsStoragePoolDeletion")
    private String supportsStoragePoolDeletion;

    @JsonProperty("SupportsStoragePoolFriendlyNameModification")
    private String supportsStoragePoolFriendlyNameModification;

    @JsonProperty("SupportsStoragePoolRemovePhysicalDisk")
    private String supportsStoragePoolRemovePhysicalDisk;

    @JsonProperty("SupportsStorageTierCreation")
    private String supportsStorageTierCreation;

    @JsonProperty("SupportsStorageTierDeletion")
    private String supportsStorageTierDeletion;

    @JsonProperty("SupportsStorageTieredVirtualDiskCreation")
    private String supportsStorageTieredVirtualDiskCreation;

    @JsonProperty("SupportsStorageTierFriendlyNameModification")
    private String supportsStorageTierFriendlyNameModification;

    @JsonProperty("SupportsStorageTierResize")
    private String supportsStorageTierResize;

    @JsonProperty("SupportsVirtualDiskCapacityExpansion")
    private String supportsVirtualDiskCapacityExpansion;

    @JsonProperty("SupportsVirtualDiskCapacityReduction")
    private String supportsVirtualDiskCapacityReduction;

    @JsonProperty("SupportsVirtualDiskCreation")
    private String supportsVirtualDiskCreation;

    @JsonProperty("SupportsVirtualDiskDeletion")
    private String supportsVirtualDiskDeletion;

    @JsonProperty("SupportsVirtualDiskModification")
    private String supportsVirtualDiskModification;

    @JsonProperty("SupportsVirtualDiskRepair")
    private String supportsVirtualDiskRepair;

    @JsonProperty("SupportsVolumeCreation")
    private String supportsVolumeCreation;

    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("VirtualDiskRepairEnabled")
    private String virtualDiskRepairEnabled;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
