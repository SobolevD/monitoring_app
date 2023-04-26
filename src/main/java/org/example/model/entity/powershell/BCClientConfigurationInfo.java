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
public class BCClientConfigurationInfo {
    public static final String[] COLUMN_NAMES = {"CurrentClientMode", "PreferredContentInformationVersion", "HostedCacheVersion", "Caption", "Description", "ElementName", "InstanceID", "DistributedCachingIsEnabled", "HostedCacheDiscoveryEnabled", "HostedCacheServerList", "MinimumSmbLatencyInMilliseconds", "ServeDistributedCachingPeersOnBatteryPower", "PSComputerName"};

    @JsonProperty("CurrentClientMode")
    private String currentClientMode;

    @JsonProperty("PreferredContentInformationVersion")
    private String preferredContentInformationVersion;

    @JsonProperty("HostedCacheVersion")
    private String hostedCacheVersion;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("DistributedCachingIsEnabled")
    private String distributedCachingIsEnabled;

    @JsonProperty("HostedCacheDiscoveryEnabled")
    private String hostedCacheDiscoveryEnabled;

    @JsonProperty("HostedCacheServerList")
    private String hostedCacheServerList;

    @JsonProperty("MinimumSmbLatencyInMilliseconds")
    private String minimumSmbLatencyInMilliseconds;

    @JsonProperty("ServeDistributedCachingPeersOnBatteryPower")
    private String serveDistributedCachingPeersOnBatteryPower;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
