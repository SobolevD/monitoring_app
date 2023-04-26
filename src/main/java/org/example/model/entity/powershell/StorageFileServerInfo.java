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
public class StorageFileServerInfo {
    public static final String[] COLUMN_NAMES = {"HealthStatus", "OperationalStatus", "FileSharingProtocols", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "FileSharingProtocolVersions", "FriendlyName", "HostNames", "OtherOperationalStatusDescription", "SupportsContinuouslyAvailableFileShare", "SupportsFileShareCreation", "PSComputerName"};

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("FileSharingProtocols")
    private String fileSharingProtocols;

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

    @JsonProperty("FileSharingProtocolVersions")
    private String fileSharingProtocolVersions;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("HostNames")
    private String hostNames;

    @JsonProperty("OtherOperationalStatusDescription")
    private String otherOperationalStatusDescription;

    @JsonProperty("SupportsContinuouslyAvailableFileShare")
    private String supportsContinuouslyAvailableFileShare;

    @JsonProperty("SupportsFileShareCreation")
    private String supportsFileShareCreation;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
