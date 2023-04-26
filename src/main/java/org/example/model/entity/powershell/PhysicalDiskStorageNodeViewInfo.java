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
public class PhysicalDiskStorageNodeViewInfo {
    public static final String[] COLUMN_NAMES = {"HealthStatus", "OperationalStatus", "LoadBalancePolicy", "PathState", "StorageNodeObjectId", "PhysicalDiskObjectId", "DiskNumber", "IsMpioEnabled", "IsPhysicallyConnected", "PathId", "PhysicalDisk", "StorageNode", "PSComputerName"};

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("LoadBalancePolicy")
    private String loadBalancePolicy;

    @JsonProperty("PathState")
    private String pathState;

    @JsonProperty("StorageNodeObjectId")
    private String storageNodeObjectId;

    @JsonProperty("PhysicalDiskObjectId")
    private String physicalDiskObjectId;

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("IsMpioEnabled")
    private String isMpioEnabled;

    @JsonProperty("IsPhysicallyConnected")
    private String isPhysicallyConnected;

    @JsonProperty("PathId")
    private String pathId;

    @JsonProperty("PhysicalDisk")
    private String physicalDisk;

    @JsonProperty("StorageNode")
    private String storageNode;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
