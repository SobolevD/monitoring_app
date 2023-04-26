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
public class PartitionInfo {
    public static final String[] COLUMN_NAMES = {"OperationalStatus", "Type", "DiskPath", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "AccessPaths", "DiskId", "DiskNumber", "DriveLetter", "GptType", "Guid", "IsActive", "IsBoot", "IsDAX", "IsHidden", "IsOffline", "IsReadOnly", "IsShadowCopy", "IsSystem", "MbrType", "NoDefaultDriveLetter", "Offset", "PartitionNumber", "Size", "TransitionState", "PSComputerName"};

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("DiskPath")
    private String diskPath;

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

    @JsonProperty("AccessPaths")
    private String accessPaths;

    @JsonProperty("DiskId")
    private String diskId;

    @JsonProperty("DiskNumber")
    private String diskNumber;

    @JsonProperty("DriveLetter")
    private String driveLetter;

    @JsonProperty("GptType")
    private String gptType;

    @JsonProperty("Guid")
    private String guid;

    @JsonProperty("IsActive")
    private String isActive;

    @JsonProperty("IsBoot")
    private String isBoot;

    @JsonProperty("IsDAX")
    private String isDAX;

    @JsonProperty("IsHidden")
    private String isHidden;

    @JsonProperty("IsOffline")
    private String isOffline;

    @JsonProperty("IsReadOnly")
    private String isReadOnly;

    @JsonProperty("IsShadowCopy")
    private String isShadowCopy;

    @JsonProperty("IsSystem")
    private String isSystem;

    @JsonProperty("MbrType")
    private String mbrType;

    @JsonProperty("NoDefaultDriveLetter")
    private String noDefaultDriveLetter;

    @JsonProperty("Offset")
    private String offset;

    @JsonProperty("PartitionNumber")
    private String partitionNumber;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("TransitionState")
    private String transitionState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
