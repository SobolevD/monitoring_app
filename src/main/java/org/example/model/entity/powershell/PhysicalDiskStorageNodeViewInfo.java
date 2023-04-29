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
public class PhysicalDiskStorageNodeViewInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "IsPhysicallyConnected", "StorageNodeObjectId", "HealthStatus", "OperationalStatus", "PathState", "PhysicalDiskObjectId", "PhysicalDisk", "PathId", "StorageNode", "DiskNumber", "LoadBalancePolicy", "IsMpioEnabled"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("IsPhysicallyConnected")
    private String isPhysicallyConnected;

    @JsonProperty("StorageNodeObjectId")
    private String storageNodeObjectId;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PathState")
    private JsonNode pathState;

    @JsonProperty("PhysicalDiskObjectId")
    private String physicalDiskObjectId;

    @JsonProperty("PhysicalDisk")
    private JsonNode physicalDisk;

    @JsonProperty("PathId")
    private String pathId;

    @JsonProperty("StorageNode")
    private JsonNode storageNode;

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("LoadBalancePolicy")
    private JsonNode loadBalancePolicy;

    @JsonProperty("IsMpioEnabled")
    private String isMpioEnabled;

}
