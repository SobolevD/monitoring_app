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
public class DiskStorageNodeViewInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "OfflineReason", "DiskObjectId", "DiskNumber", "StorageNodeObjectId", "IsReadOnly", "HealthStatus", "OperationalStatus", "Disk", "IsOffline", "StorageNode"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("OfflineReason")
    private String offlineReason;

    @JsonProperty("DiskObjectId")
    private String diskObjectId;

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("StorageNodeObjectId")
    private String storageNodeObjectId;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("Disk")
    private JsonNode disk;

    @JsonProperty("IsOffline")
    private String isOffline;

    @JsonProperty("StorageNode")
    private JsonNode storageNode;

}
