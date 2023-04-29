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
public class StorageSubSystemInfo {

    public static final String[] COLUMN_NAMES = {"SupportsStorageTierDeletion", "OtherHostTypeDescription", "HealthStatus", "OperationalStatus", "PassThroughClass", "FirmwareVersion", "MaskingPortsPerView", "SupportsVirtualDiskCapacityReduction", "SupportsCloneLocal", "SupportsStorageTierFriendlyNameModification", "OtherIdentifyingInfoDescription", "Tag", "SupportsFileServer", "SupportsStoragePoolDeletion", "PSComputerName", "SupportsVirtualDiskDeletion", "SupportsSnapshotRemote", "SupportedDeduplicationFileSystemTypes", "PassThroughNamespace", "NumberOfSlots", "iSCSITargetCreationScheme", "SupportsStoragePoolAddPhysicalDisk", "OtherIdentifyingInfo", "SupportedFileSystems", "SupportsStorageTieredVirtualDiskCreation", "ReplicasPerSourceSnapshotMax", "SupportsCloneRemote", "SupportsStorageTierResize", "SupportedHostType", "FaultDomainAwarenessDefault", "SupportedDeduplicationObjectTypes", "SupportsFileServerCreation", "SupportsStoragePoolRemovePhysicalDisk", "PhysicalDisksPerStoragePoolMin", "SupportsStorageTierCreation", "MaskingOtherValidInitiatorIdTypes", "CurrentCacheLevel", "SupportsMirrorLocal", "SupportsMirrorRemote", "ObjectId", "UniqueId", "FriendlyName", "MaskingMapCountMax", "StorageConnectionType", "OtherOperationalStatusDescription", "ReplicasPerSourceCloneMax", "SupportsStoragePoolCreation", "SupportsContinuouslyAvailableFileServer", "SerialNumber", "AutomaticClusteringEnabled", "SupportsAutomaticStoragePoolSelection", "Model", "VirtualDiskRepairEnabled", "SupportsStoragePoolFriendlyNameModification", "MaskingClientSelectableDeviceNumbers", "PassThroughServer", "PassThroughIds", "MaskingOneInitiatorIdPerView", "Description", "SupportsVirtualDiskCapacityExpansion", "NameFormat", "DataTieringType", "SupportsVolumeCreation", "SupportsMaskingVirtualDiskToHosts", "SupportsMultipleResiliencySettingsPerStoragePool", "SupportsVirtualDiskModification", "Name", "SupportsVirtualDiskRepair", "SupportsSnapshotLocal", "MaskingValidInitiatorIdTypes", "SupportedFileServerProtocols", "SupportsVirtualDiskCreation", "Manufacturer", "ReplicasPerSourceMirrorMax"};

    @JsonProperty("SupportsStorageTierDeletion")
    private String supportsStorageTierDeletion;

    @JsonProperty("OtherHostTypeDescription")
    private String otherHostTypeDescription;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("MaskingPortsPerView")
    private String maskingPortsPerView;

    @JsonProperty("SupportsVirtualDiskCapacityReduction")
    private String supportsVirtualDiskCapacityReduction;

    @JsonProperty("SupportsCloneLocal")
    private String supportsCloneLocal;

    @JsonProperty("SupportsStorageTierFriendlyNameModification")
    private String supportsStorageTierFriendlyNameModification;

    @JsonProperty("OtherIdentifyingInfoDescription")
    private String otherIdentifyingInfoDescription;

    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("SupportsFileServer")
    private String supportsFileServer;

    @JsonProperty("SupportsStoragePoolDeletion")
    private String supportsStoragePoolDeletion;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("SupportsVirtualDiskDeletion")
    private String supportsVirtualDiskDeletion;

    @JsonProperty("SupportsSnapshotRemote")
    private String supportsSnapshotRemote;

    @JsonProperty("SupportedDeduplicationFileSystemTypes")
    private JsonNode supportedDeduplicationFileSystemTypes;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("NumberOfSlots")
    private String numberOfSlots;

    @JsonProperty("iSCSITargetCreationScheme")
    private String iSCSITargetCreationScheme;

    @JsonProperty("SupportsStoragePoolAddPhysicalDisk")
    private String supportsStoragePoolAddPhysicalDisk;

    @JsonProperty("OtherIdentifyingInfo")
    private String otherIdentifyingInfo;

    @JsonProperty("SupportedFileSystems")
    private JsonNode supportedFileSystems;

    @JsonProperty("SupportsStorageTieredVirtualDiskCreation")
    private String supportsStorageTieredVirtualDiskCreation;

    @JsonProperty("ReplicasPerSourceSnapshotMax")
    private String replicasPerSourceSnapshotMax;

    @JsonProperty("SupportsCloneRemote")
    private String supportsCloneRemote;

    @JsonProperty("SupportsStorageTierResize")
    private String supportsStorageTierResize;

    @JsonProperty("SupportedHostType")
    private JsonNode supportedHostType;

    @JsonProperty("FaultDomainAwarenessDefault")
    private String faultDomainAwarenessDefault;

    @JsonProperty("SupportedDeduplicationObjectTypes")
    private JsonNode supportedDeduplicationObjectTypes;

    @JsonProperty("SupportsFileServerCreation")
    private String supportsFileServerCreation;

    @JsonProperty("SupportsStoragePoolRemovePhysicalDisk")
    private String supportsStoragePoolRemovePhysicalDisk;

    @JsonProperty("PhysicalDisksPerStoragePoolMin")
    private String physicalDisksPerStoragePoolMin;

    @JsonProperty("SupportsStorageTierCreation")
    private String supportsStorageTierCreation;

    @JsonProperty("MaskingOtherValidInitiatorIdTypes")
    private String maskingOtherValidInitiatorIdTypes;

    @JsonProperty("CurrentCacheLevel")
    private String currentCacheLevel;

    @JsonProperty("SupportsMirrorLocal")
    private String supportsMirrorLocal;

    @JsonProperty("SupportsMirrorRemote")
    private String supportsMirrorRemote;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("MaskingMapCountMax")
    private String maskingMapCountMax;

    @JsonProperty("StorageConnectionType")
    private String storageConnectionType;

    @JsonProperty("OtherOperationalStatusDescription")
    private String otherOperationalStatusDescription;

    @JsonProperty("ReplicasPerSourceCloneMax")
    private String replicasPerSourceCloneMax;

    @JsonProperty("SupportsStoragePoolCreation")
    private String supportsStoragePoolCreation;

    @JsonProperty("SupportsContinuouslyAvailableFileServer")
    private String supportsContinuouslyAvailableFileServer;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("AutomaticClusteringEnabled")
    private String automaticClusteringEnabled;

    @JsonProperty("SupportsAutomaticStoragePoolSelection")
    private String supportsAutomaticStoragePoolSelection;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("VirtualDiskRepairEnabled")
    private String virtualDiskRepairEnabled;

    @JsonProperty("SupportsStoragePoolFriendlyNameModification")
    private String supportsStoragePoolFriendlyNameModification;

    @JsonProperty("MaskingClientSelectableDeviceNumbers")
    private String maskingClientSelectableDeviceNumbers;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("MaskingOneInitiatorIdPerView")
    private String maskingOneInitiatorIdPerView;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("SupportsVirtualDiskCapacityExpansion")
    private String supportsVirtualDiskCapacityExpansion;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("DataTieringType")
    private String dataTieringType;

    @JsonProperty("SupportsVolumeCreation")
    private String supportsVolumeCreation;

    @JsonProperty("SupportsMaskingVirtualDiskToHosts")
    private String supportsMaskingVirtualDiskToHosts;

    @JsonProperty("SupportsMultipleResiliencySettingsPerStoragePool")
    private String supportsMultipleResiliencySettingsPerStoragePool;

    @JsonProperty("SupportsVirtualDiskModification")
    private String supportsVirtualDiskModification;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("SupportsVirtualDiskRepair")
    private String supportsVirtualDiskRepair;

    @JsonProperty("SupportsSnapshotLocal")
    private String supportsSnapshotLocal;

    @JsonProperty("MaskingValidInitiatorIdTypes")
    private String maskingValidInitiatorIdTypes;

    @JsonProperty("SupportedFileServerProtocols")
    private String supportedFileServerProtocols;

    @JsonProperty("SupportsVirtualDiskCreation")
    private String supportsVirtualDiskCreation;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("ReplicasPerSourceMirrorMax")
    private String replicasPerSourceMirrorMax;

}
