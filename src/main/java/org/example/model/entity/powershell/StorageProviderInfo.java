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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "PassThroughServer", "PassThroughIds", "SupportedRemoteSubsystemCacheModes", "ObjectId", "UniqueId", "PassThroughNamespace", "URI", "URI_IP", "RemoteSubsystemCacheMode", "PassThroughClass", "Name", "Type", "SupportsSubsystemRegistration", "Manufacturer", "Version"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("SupportedRemoteSubsystemCacheModes")
    private String supportedRemoteSubsystemCacheModes;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("URI")
    private String uRI;

    @JsonProperty("URI_IP")
    private String uRI_IP;

    @JsonProperty("RemoteSubsystemCacheMode")
    private String remoteSubsystemCacheMode;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("SupportsSubsystemRegistration")
    private String supportsSubsystemRegistration;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Version")
    private String version;

}
