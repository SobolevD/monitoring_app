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
public class HnsEndpointInfo {
    public static final String[] COLUMN_NAMES = {"ID", "Name", "Version", "AdditionalParams", "Resources", "State", "VirtualNetwork", "VirtualNetworkName", "MacAddress", "IPAddress", "PrefixLength", "GatewayAddress", "IPSubnetId", "DNSServerList", "SharedContainers", "VirtualMachine"};

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("AdditionalParams")
    private String additionalParams;

    @JsonProperty("Resources")
    private String resources;

    @JsonProperty("State")
    private String state;

    @JsonProperty("VirtualNetwork")
    private String virtualNetwork;

    @JsonProperty("VirtualNetworkName")
    private String virtualNetworkName;

    @JsonProperty("MacAddress")
    private String macAddress;

    @JsonProperty("IPAddress")
    private String iPAddress;

    @JsonProperty("PrefixLength")
    private String prefixLength;

    @JsonProperty("GatewayAddress")
    private String gatewayAddress;

    @JsonProperty("IPSubnetId")
    private String iPSubnetId;

    @JsonProperty("DNSServerList")
    private String dNSServerList;

    @JsonProperty("SharedContainers")
    private String sharedContainers;

    @JsonProperty("VirtualMachine")
    private String virtualMachine;

}
