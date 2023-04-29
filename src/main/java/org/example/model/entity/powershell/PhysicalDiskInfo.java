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
public class PhysicalDiskInfo {

    public static final String[] COLUMN_NAMES = {"SupportedUsages", "AllocatedSize", "Usage", "ObjectId", "UniqueId", "FriendlyName", "SlotNumber", "SpindleSpeed", "OperationalStatus", "HealthStatus", "PassThroughClass", "EnclosureNumber", "FirmwareVersion", "SoftwareVersion", "StoragePoolUniqueId", "SerialNumber", "IsPartial", "UniqueIdFormat", "Model", "OperationalDetails", "LogicalSectorSize", "IsIndicationEnabled", "PSComputerName", "PassThroughServer", "PassThroughIds", "PartNumber", "Description", "PhysicalSectorSize", "BusType", "DeviceId", "Size", "PassThroughNamespace", "CanPool", "VirtualDiskFootprint", "AdapterSerialNumber", "PhysicalLocation", "ClassName", "Manufacturer", "MediaType", "CannotPoolReason", "OtherCannotPoolReasonDescription"};

    @JsonProperty("SupportedUsages")
    private JsonNode supportedUsages;

    @JsonProperty("AllocatedSize")
    private String allocatedSize;

    @JsonProperty("Usage")
    private String usage;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("SlotNumber")
    private String slotNumber;

    @JsonProperty("SpindleSpeed")
    private String spindleSpeed;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("EnclosureNumber")
    private String enclosureNumber;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("SoftwareVersion")
    private String softwareVersion;

    @JsonProperty("StoragePoolUniqueId")
    private String storagePoolUniqueId;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("IsPartial")
    private String isPartial;

    @JsonProperty("UniqueIdFormat")
    private String uniqueIdFormat;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("OperationalDetails")
    private String operationalDetails;

    @JsonProperty("LogicalSectorSize")
    private String logicalSectorSize;

    @JsonProperty("IsIndicationEnabled")
    private String isIndicationEnabled;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("PartNumber")
    private String partNumber;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("PhysicalSectorSize")
    private String physicalSectorSize;

    @JsonProperty("BusType")
    private String busType;

    @JsonProperty("DeviceId")
    private String deviceId;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("CanPool")
    private String canPool;

    @JsonProperty("VirtualDiskFootprint")
    private String virtualDiskFootprint;

    @JsonProperty("AdapterSerialNumber")
    private String adapterSerialNumber;

    @JsonProperty("PhysicalLocation")
    private String physicalLocation;

    @JsonProperty("ClassName")
    private String className;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("MediaType")
    private String mediaType;

    @JsonProperty("CannotPoolReason")
    private String cannotPoolReason;

    @JsonProperty("OtherCannotPoolReasonDescription")
    private String otherCannotPoolReasonDescription;

}
