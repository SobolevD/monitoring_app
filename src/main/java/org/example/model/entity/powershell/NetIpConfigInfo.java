package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetIpConfigInfo {

    public static final String[] COLUMN_NAMES = {"Detailed", "ComputerName", "InterfaceAlias",
            "InterfaceIndex", "InterfaceDescription", "CompartmentId", "NetAdapter",
            "NetCompartment", "NetIPv6Interface", "NetIPv4Interface", "NetProfile",
            "AllIPAddresses", "IPv6Address", "IPv6TemporaryAddress", "IPv6LinkLocalAddress",
            "IPv4Address", "IPv6DefaultGateway", "IPv4DefaultGateway", "DNSServer"};

    @JsonProperty("Detailed")
    private String detailed;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("InterfaceDescription")
    private String interfaceDescription;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("NetAdapter")
    private JsonNode netAdapter;

    @JsonProperty("NetCompartment")
    private JsonNode netCompartment;

    @JsonProperty("NetIPv6Interface")
    private JsonNode netIPv6Interface;

    @JsonProperty("NetIPv4Interface")
    private JsonNode netIPv4Interface;

    @JsonProperty("NetProfile")
    private JsonNode netProfile;

    @JsonProperty("AllIPAddresses")
    private List<String> allIPAddresses;

    @JsonProperty("IPv6Address")
    private List<String> ipv6Address;

    @JsonProperty("IPv6TemporaryAddress")
    private List<String> ipv6TemporaryAddress;

    @JsonProperty("IPv6LinkLocalAddress")
    private List<String> ipv6LinkLocalAddress;

    @JsonProperty("IPv4Address")
    private List<String> ipv4Address;

    @JsonProperty("IPv6DefaultGateway")
    private List<String> ipv6DefaultGateway;

    @JsonProperty("IPv4DefaultGateway")
    private List<String> ipv4DefaultGateway;

    @JsonProperty("DNSServer")
    private List<String> dnsServer;
}
