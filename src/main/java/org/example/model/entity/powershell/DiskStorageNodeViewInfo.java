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
public class DiskStorageNodeViewInfo {
    public static final String[] COLUMN_NAMES = {"HealthStatus", "OperationalStatus", "OfflineReason", "StorageNodeObjectId", "DiskObjectId", "Disk", "DiskNumber", "IsOffline", "IsReadOnly", "StorageNode", "PSComputerName"};



    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("OfflineReason")
    private String offlineReason;

    @JsonProperty("StorageNodeObjectId")
    private String storageNodeObjectId;

    @JsonProperty("DiskObjectId")
    private String diskObjectId;

    @JsonProperty("Disk")
    private String disk;

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("IsOffline")
    private String isOffline;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("StorageNode")
    private String storageNode;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
