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
    public static final String[] COLUMN_NAMES = {"Active", "Caption", "Description", "ElementName", "InstanceID", "ExternalAddressID", "IPAddress", "NatName", "PortEnd", "PortStart", "PSComputerName"};

    @JsonProperty("Active")
    private String active;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("ExternalAddressID")
    private String externalAddressID;

    @JsonProperty("IPAddress")
    private String iPAddress;

    @JsonProperty("NatName")
    private String natName;

    @JsonProperty("PortEnd")
    private String portEnd;

    @JsonProperty("PortStart")
    private String portStart;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
