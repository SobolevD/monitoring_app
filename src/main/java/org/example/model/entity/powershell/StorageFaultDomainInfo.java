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
public class StorageFaultDomainInfo {
    public static final String[] COLUMN_NAMES = {"Usage", "UniqueIdFormat", "BusType", "CannotPoolReason", "SupportedUsages", "MediaType", "SpindleSpeed", "ClassName", "HealthStatus", "OperationalStatus", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "Description", "FriendlyName", "Manufacturer", "Model", "OperationalDetails", "PhysicalLocation", "SerialNumber", "AdapterSerialNumber", "AllocatedSize", "CanPool", "DeviceId", "EnclosureNumber", "FirmwareVersion", "IsIndicationEnabled", "IsPartial", "LogicalSectorSize", "OtherCannotPoolReasonDescription", "PartNumber", "PhysicalSectorSize", "Size", "SlotNumber", "SoftwareVersion", "StoragePoolUniqueId", "VirtualDiskFootprint", "PSComputerName"};

    @JsonProperty("Usage")
    private String usage;

    @JsonProperty("UniqueIdFormat")
    private String uniqueIdFormat;

    @JsonProperty("BusType")
    private String busType;

    @JsonProperty("CannotPoolReason")
    private String cannotPoolReason;

    @JsonProperty("SupportedUsages")
    private String supportedUsages;

    @JsonProperty("MediaType")
    private String mediaType;

    @JsonProperty("SpindleSpeed")
    private String spindleSpeed;

    @JsonProperty("ClassName")
    private String className;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

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

    @JsonProperty("Description")
    private String description;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("OperationalDetails")
    private String operationalDetails;

    @JsonProperty("PhysicalLocation")
    private String physicalLocation;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("AdapterSerialNumber")
    private String adapterSerialNumber;

    @JsonProperty("AllocatedSize")
    private String allocatedSize;

    @JsonProperty("CanPool")
    private String canPool;

    @JsonProperty("DeviceId")
    private String deviceId;

    @JsonProperty("EnclosureNumber")
    private String enclosureNumber;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("IsIndicationEnabled")
    private String isIndicationEnabled;

    @JsonProperty("IsPartial")
    private String isPartial;

    @JsonProperty("LogicalSectorSize")
    private String logicalSectorSize;

    @JsonProperty("OtherCannotPoolReasonDescription")
    private String otherCannotPoolReasonDescription;

    @JsonProperty("PartNumber")
    private String partNumber;

    @JsonProperty("PhysicalSectorSize")
    private String physicalSectorSize;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("SlotNumber")
    private String slotNumber;

    @JsonProperty("SoftwareVersion")
    private String softwareVersion;

    @JsonProperty("StoragePoolUniqueId")
    private String storagePoolUniqueId;

    @JsonProperty("VirtualDiskFootprint")
    private String virtualDiskFootprint;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
