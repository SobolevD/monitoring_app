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
public class NetNatExternalAddressInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Active", "PortEnd", "Description", "PortStart", "ElementName", "NatName", "InstanceID", "ExternalAddressID", "Caption", "IPAddress"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Active")
    private String active;

    @JsonProperty("PortEnd")
    private String portEnd;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("PortStart")
    private String portStart;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("NatName")
    private String natName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("ExternalAddressID")
    private String externalAddressID;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("IPAddress")
    private String iPAddress;

}
