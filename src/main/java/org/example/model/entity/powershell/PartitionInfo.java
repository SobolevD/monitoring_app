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
public class PartitionInfo {

    public static final String[] COLUMN_NAMES = {"ObjectId", "UniqueId", "IsHidden", "GptType", "OperationalStatus", "PassThroughClass", "IsOffline", "Offset", "DiskId", "Type", "DriveLetter", "IsSystem", "NoDefaultDriveLetter", "PSComputerName", "PassThroughServer", "PassThroughIds", "DiskPath", "IsShadowCopy", "Size", "PassThroughNamespace", "Guid", "IsDAX", "AccessPaths", "PartitionNumber", "DiskNumber", "IsActive", "IsReadOnly", "TransitionState", "IsBoot", "MbrType"};

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("IsHidden")
    private String isHidden;

    @JsonProperty("GptType")
    private String gptType;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("IsOffline")
    private String isOffline;

    @JsonProperty("Offset")
    private String offset;

    @JsonProperty("DiskId")
    private String diskId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("DriveLetter")
    private String driveLetter;

    @JsonProperty("IsSystem")
    private String isSystem;

    @JsonProperty("NoDefaultDriveLetter")
    private String noDefaultDriveLetter;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("DiskPath")
    private String diskPath;

    @JsonProperty("IsShadowCopy")
    private String isShadowCopy;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("Guid")
    private String guid;

    @JsonProperty("IsDAX")
    private String isDAX;

    @JsonProperty("AccessPaths")
    private JsonNode accessPaths;

    @JsonProperty("PartitionNumber")
    private String partitionNumber;

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("IsActive")
    private String isActive;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("TransitionState")
    private String transitionState;

    @JsonProperty("IsBoot")
    private String isBoot;

    @JsonProperty("MbrType")
    private String mbrType;

}
