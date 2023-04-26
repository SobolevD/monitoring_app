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
public class HnsNetworkInfo {
    public static final String[] COLUMN_NAMES = {"ActivityId", "AdditionalParams", "CurrentEndpointCount", "DNSServerList", "Extensions", "Flags", "GatewayMac", "Health", "ID", "IPv6", "IsolateSwitch", "LayeredOn", "MacPools", "MaxConcurrentEndpoints", "Name", "NatName", "Policies", "State", "Subnets", "TotalEndpoints", "Type", "Version", "Resources"};

    @JsonProperty("ActivityId")
    private String activityId;

    @JsonProperty("AdditionalParams")
    private String additionalParams;

    @JsonProperty("CurrentEndpointCount")
    private String currentEndpointCount;

    @JsonProperty("DNSServerList")
    private String dNSServerList;

    @JsonProperty("Extensions")
    private String extensions;

    @JsonProperty("Flags")
    private String flags;

    @JsonProperty("GatewayMac")
    private String gatewayMac;

    @JsonProperty("Health")
    private String health;

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("IPv6")
    private String iPv6;

    @JsonProperty("IsolateSwitch")
    private String isolateSwitch;

    @JsonProperty("LayeredOn")
    private String layeredOn;

    @JsonProperty("MacPools")
    private String macPools;

    @JsonProperty("MaxConcurrentEndpoints")
    private String maxConcurrentEndpoints;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("NatName")
    private String natName;

    @JsonProperty("Policies")
    private String policies;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Subnets")
    private String subnets;

    @JsonProperty("TotalEndpoints")
    private String totalEndpoints;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Resources")
    private String resources;

}
