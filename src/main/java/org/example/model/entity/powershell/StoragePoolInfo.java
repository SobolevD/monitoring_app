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
public class StoragePoolInfo {

    public static final String[] COLUMN_NAMES = {"AllocatedSize", "Usage", "IsPowerProtected", "ObjectId", "UniqueId", "FriendlyName", "OperationalStatus", "HealthStatus", "PassThroughClass", "OtherOperationalStatusDescription", "ThinProvisioningAlertThresholds", "SupportedProvisioningTypes", "ProvisioningTypeDefault", "IsPrimordial", "SupportsDeduplication", "MediaTypeDefault", "ResiliencySettingNameDefault", "LogicalSectorSize", "PSComputerName", "PassThroughServer", "PassThroughIds", "OtherUsageDescription", "WriteCacheSizeDefault", "PhysicalSectorSize", "Size", "PassThroughNamespace", "WriteCacheSizeMin", "ReadOnlyReason", "IsClustered", "EnclosureAwareDefault", "Name", "WriteCacheSizeMax", "Version", "ClearOnDeallocate", "IsReadOnly", "RepairPolicy", "FaultDomainAwarenessDefault", "RetireMissingPhysicalDisks"};

    @JsonProperty("AllocatedSize")
    private String allocatedSize;

    @JsonProperty("Usage")
    private String usage;

    @JsonProperty("IsPowerProtected")
    private String isPowerProtected;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("OtherOperationalStatusDescription")
    private String otherOperationalStatusDescription;

    @JsonProperty("ThinProvisioningAlertThresholds")
    private JsonNode thinProvisioningAlertThresholds;

    @JsonProperty("SupportedProvisioningTypes")
    private JsonNode supportedProvisioningTypes;

    @JsonProperty("ProvisioningTypeDefault")
    private String provisioningTypeDefault;

    @JsonProperty("IsPrimordial")
    private String isPrimordial;

    @JsonProperty("SupportsDeduplication")
    private String supportsDeduplication;

    @JsonProperty("MediaTypeDefault")
    private String mediaTypeDefault;

    @JsonProperty("ResiliencySettingNameDefault")
    private String resiliencySettingNameDefault;

    @JsonProperty("LogicalSectorSize")
    private String logicalSectorSize;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("OtherUsageDescription")
    private String otherUsageDescription;

    @JsonProperty("WriteCacheSizeDefault")
    private String writeCacheSizeDefault;

    @JsonProperty("PhysicalSectorSize")
    private String physicalSectorSize;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("WriteCacheSizeMin")
    private String writeCacheSizeMin;

    @JsonProperty("ReadOnlyReason")
    private String readOnlyReason;

    @JsonProperty("IsClustered")
    private String isClustered;

    @JsonProperty("EnclosureAwareDefault")
    private String enclosureAwareDefault;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("WriteCacheSizeMax")
    private String writeCacheSizeMax;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("ClearOnDeallocate")
    private String clearOnDeallocate;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("RepairPolicy")
    private String repairPolicy;

    @JsonProperty("FaultDomainAwarenessDefault")
    private String faultDomainAwarenessDefault;

    @JsonProperty("RetireMissingPhysicalDisks")
    private String retireMissingPhysicalDisks;

}
