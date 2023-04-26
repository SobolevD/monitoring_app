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
public class DiskInfo {

    public static final String[] COLUMN_NAMES = {"DiskNumber", "PartitionStyle", "ProvisioningType",
            "OperationalStatus", "HealthStatus", "BusType", "UniqueIdFormat", "OfflineReason",
            "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace",
            "PassThroughServer", "UniqueId", "AdapterSerialNumber", "AllocatedSize",
            "BootFromDisk", "FirmwareVersion", "FriendlyName", "Guid", "IsBoot", "IsClustered",
            "IsHighlyAvailable", "IsOffline", "IsReadOnly", "IsScaleOut", "IsSystem",
            "LargestFreeExtent", "Location", "LogicalSectorSize", "Manufacturer", "Model",
            "Number", "NumberOfPartitions", "Path", "PhysicalSectorSize", "SerialNumber",
            "Signature", "Size", "PSComputerName"};

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("PartitionStyle")
    private String partitionStyle;

    @JsonProperty("ProvisioningType")
    private String provisioningType;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("BusType")
    private String busType;

    @JsonProperty("UniqueIdFormat")
    private String uniqueIdFormat;

    @JsonProperty("OfflineReason")
    private String offlineReason;

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

    @JsonProperty("AdapterSerialNumber")
    private String adapterSerialNumber;

    @JsonProperty("AllocatedSize")
    private String allocatedSize;

    @JsonProperty("BootFromDisk")
    private String bootFromDisk;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("Guid")
    private String guid;

    @JsonProperty("IsBoot")
    private String isBoot;

    @JsonProperty("IsClustered")
    private String isClustered;

    @JsonProperty("IsHighlyAvailable")
    private String isHighlyAvailable;

    @JsonProperty("IsOffline")
    private String isOffline;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("IsScaleOut")
    private String isScaleOut;

    @JsonProperty("IsSystem")
    private String isSystem;

    @JsonProperty("LargestFreeExtent")
    private String largestFreeExtent;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("LogicalSectorSize")
    private String logicalSectorSize;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("Number")
    private String number;

    @JsonProperty("NumberOfPartitions")
    private String numberOfPartitions;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("PhysicalSectorSize")
    private String physicalSectorSize;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("Signature")
    private String signature;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
