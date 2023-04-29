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
public class BCClientConfigurationInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "CurrentClientMode", "HostedCacheDiscoveryEnabled", "Description", "Caption", "DistributedCachingIsEnabled", "HostedCacheServerList", "PreferredContentInformationVersion", "HostedCacheVersion", "ElementName", "MinimumSmbLatencyInMilliseconds", "InstanceID", "ServeDistributedCachingPeersOnBatteryPower"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("CurrentClientMode")
    private String currentClientMode;

    @JsonProperty("HostedCacheDiscoveryEnabled")
    private String hostedCacheDiscoveryEnabled;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("DistributedCachingIsEnabled")
    private String distributedCachingIsEnabled;

    @JsonProperty("HostedCacheServerList")
    private JsonNode hostedCacheServerList;

    @JsonProperty("PreferredContentInformationVersion")
    private String preferredContentInformationVersion;

    @JsonProperty("HostedCacheVersion")
    private String hostedCacheVersion;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("MinimumSmbLatencyInMilliseconds")
    private String minimumSmbLatencyInMilliseconds;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("ServeDistributedCachingPeersOnBatteryPower")
    private String serveDistributedCachingPeersOnBatteryPower;

}
