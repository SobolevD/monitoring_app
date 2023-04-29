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
public class NetRouteInfo {

    public static final String[] COLUMN_NAMES = {"Publish", "Protocol", "Store", "AddressFamily",
            "State", "ifIndex", "Caption", "Description", "ElementName", "InstanceID",
            "AdminDistance", "DestinationAddress", "IsStatic", "RouteMetric", "TypeOfRoute",
            "CompartmentId", "DestinationPrefix", "InterfaceAlias", "InterfaceIndex",
            "InterfaceMetric", "NextHop", "PreferredLifetime", "ValidLifetime", "PSComputerName"};

    @JsonProperty("Publish")
    private String publish;

    @JsonProperty("Protocol")
    private String protocol;

    @JsonProperty("Store")
    private String store;

    @JsonProperty("AddressFamily")
    private String addressFamily;

    @JsonProperty("State")
    private String state;

    @JsonProperty("ifIndex")
    private String ifIndex;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("AdminDistance")
    private String adminDistance;

    @JsonProperty("DestinationAddress")
    private String destinationAddress;

    @JsonProperty("IsStatic")
    private String isStatic;

    @JsonProperty("RouteMetric")
    private String routeMetric;

    @JsonProperty("TypeOfRoute")
    private String typeOfRoute;

    @JsonProperty("CompartmentId")
    private String compartmentId;

    @JsonProperty("DestinationPrefix")
    private String destinationPrefix;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("InterfaceMetric")
    private String interfaceMetric;

    @JsonProperty("NextHop")
    private String nextHop;

    @JsonProperty("PreferredLifetime")
    private JsonNode preferredLifetime;

    @JsonProperty("ValidLifetime")
    private JsonNode validLifetime;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
