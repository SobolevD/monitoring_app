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
public class StorageProviderInfo {
    public static final String[] COLUMN_NAMES = {"Type", "RemoteSubsystemCacheMode", "SupportedRemoteSubsystemCacheModes", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "CimServerName", "Manufacturer", "Name", "SupportsSubsystemRegistration", "URI", "URI_IP", "Version", "PSComputerName"};

    @JsonProperty("Type")
    private String type;

    @JsonProperty("RemoteSubsystemCacheMode")
    private String remoteSubsystemCacheMode;

    @JsonProperty("SupportedRemoteSubsystemCacheModes")
    private String supportedRemoteSubsystemCacheModes;

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

    @JsonProperty("CimServerName")
    private String cimServerName;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("SupportsSubsystemRegistration")
    private String supportsSubsystemRegistration;

    @JsonProperty("URI")
    private String uRI;

    @JsonProperty("URI_IP")
    private String uRI_IP;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
