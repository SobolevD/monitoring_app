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
public class StoragePoolInfo {
    public static final String[] COLUMN_NAMES = {"Usage", "OperationalStatus", "HealthStatus", "ProvisioningTypeDefault", "SupportedProvisioningTypes", "MediaTypeDefault", "ReadOnlyReason", "RepairPolicy", "RetireMissingPhysicalDisks", "WriteCacheSizeDefault", "Version", "FaultDomainAwarenessDefault", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "AllocatedSize", "ClearOnDeallocate", "EnclosureAwareDefault", "FriendlyName", "IsClustered", "IsPowerProtected", "IsPrimordial", "IsReadOnly", "LogicalSectorSize", "Name", "OtherOperationalStatusDescription", "OtherUsageDescription", "PhysicalSectorSize", "ResiliencySettingNameDefault", "Size", "SupportsDeduplication", "ThinProvisioningAlertThresholds", "WriteCacheSizeMax", "WriteCacheSizeMin", "PSComputerName"};

    @JsonProperty("Usage")
    private String usage;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("ProvisioningTypeDefault")
    private String provisioningTypeDefault;

    @JsonProperty("SupportedProvisioningTypes")
    private String supportedProvisioningTypes;

    @JsonProperty("MediaTypeDefault")
    private String mediaTypeDefault;

    @JsonProperty("ReadOnlyReason")
    private String readOnlyReason;

    @JsonProperty("RepairPolicy")
    private String repairPolicy;

    @JsonProperty("RetireMissingPhysicalDisks")
    private String retireMissingPhysicalDisks;

    @JsonProperty("WriteCacheSizeDefault")
    private String writeCacheSizeDefault;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("FaultDomainAwarenessDefault")
    private String faultDomainAwarenessDefault;

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

    @JsonProperty("AllocatedSize")
    private String allocatedSize;

    @JsonProperty("ClearOnDeallocate")
    private String clearOnDeallocate;

    @JsonProperty("EnclosureAwareDefault")
    private String enclosureAwareDefault;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("IsClustered")
    private String isClustered;

    @JsonProperty("IsPowerProtected")
    private String isPowerProtected;

    @JsonProperty("IsPrimordial")
    private String isPrimordial;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("LogicalSectorSize")
    private String logicalSectorSize;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OtherOperationalStatusDescription")
    private String otherOperationalStatusDescription;

    @JsonProperty("OtherUsageDescription")
    private String otherUsageDescription;

    @JsonProperty("PhysicalSectorSize")
    private String physicalSectorSize;

    @JsonProperty("ResiliencySettingNameDefault")
    private String resiliencySettingNameDefault;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("SupportsDeduplication")
    private String supportsDeduplication;

    @JsonProperty("ThinProvisioningAlertThresholds")
    private String thinProvisioningAlertThresholds;

    @JsonProperty("WriteCacheSizeMax")
    private String writeCacheSizeMax;

    @JsonProperty("WriteCacheSizeMin")
    private String writeCacheSizeMin;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
