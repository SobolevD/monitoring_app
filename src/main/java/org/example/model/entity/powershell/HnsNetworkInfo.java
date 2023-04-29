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
public class HnsNetworkInfo {

    public static final String[] COLUMN_NAMES = {"AdditionalParams", "Health", "GatewayMac", "ActivityId", "IPv6", "DNSServerList", "IsolateSwitch", "MacPools", "Flags", "LayeredOn", "Extensions", "Name", "CurrentEndpointCount", "Subnets", "Type", "State", "NatName", "ID", "Version", "Resources", "MaxConcurrentEndpoints", "Policies", "TotalEndpoints"};

    @JsonProperty("AdditionalParams")
    private JsonNode additionalParams;

    @JsonProperty("Health")
    private JsonNode health;

    @JsonProperty("GatewayMac")
    private String gatewayMac;

    @JsonProperty("ActivityId")
    private String activityId;

    @JsonProperty("IPv6")
    private String iPv6;

    @JsonProperty("DNSServerList")
    private String dNSServerList;

    @JsonProperty("IsolateSwitch")
    private String isolateSwitch;

    @JsonProperty("MacPools")
    private JsonNode macPools;

    @JsonProperty("Flags")
    private String flags;

    @JsonProperty("LayeredOn")
    private String layeredOn;

    @JsonProperty("Extensions")
    private JsonNode extensions;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("CurrentEndpointCount")
    private String currentEndpointCount;

    @JsonProperty("Subnets")
    private JsonNode subnets;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("State")
    private String state;

    @JsonProperty("NatName")
    private String natName;

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Resources")
    private JsonNode resources;

    @JsonProperty("MaxConcurrentEndpoints")
    private String maxConcurrentEndpoints;

    @JsonProperty("Policies")
    private JsonNode policies;

    @JsonProperty("TotalEndpoints")
    private String totalEndpoints;

}
