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
public class StorageFileServerInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "PassThroughServer", "PassThroughIds", "ObjectId", "UniqueId", "FriendlyName", "HostNames", "PassThroughNamespace", "HealthStatus", "OperationalStatus", "PassThroughClass", "OtherOperationalStatusDescription", "SupportsContinuouslyAvailableFileShare", "FileSharingProtocols", "SupportsFileShareCreation", "FileSharingProtocolVersions"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("HostNames")
    private JsonNode hostNames;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("HealthStatus")
    private String healthStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("OtherOperationalStatusDescription")
    private String otherOperationalStatusDescription;

    @JsonProperty("SupportsContinuouslyAvailableFileShare")
    private String supportsContinuouslyAvailableFileShare;

    @JsonProperty("FileSharingProtocols")
    private String fileSharingProtocols;

    @JsonProperty("SupportsFileShareCreation")
    private String supportsFileShareCreation;

    @JsonProperty("FileSharingProtocolVersions")
    private JsonNode fileSharingProtocolVersions;

}
