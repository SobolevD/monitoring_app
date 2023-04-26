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
public class NetworkConnectionProfileInfo {

    public static final String[] COLUMN_NAMES = {"NetworkCategory", "DomainAuthenticationKind",
            "IPv4Connectivity", "IPv6Connectivity", "Caption", "Description",
            "ElementName", "InstanceID", "InterfaceAlias", "InterfaceIndex", "Name", "PSComputerName"};

    @JsonProperty("NetworkCategory")
    private String networkCategory;

    @JsonProperty("DomainAuthenticationKind")
    private String domainAuthenticationKind;

    @JsonProperty("IPv4Connectivity")
    private String ipv4Connectivity;

    @JsonProperty("IPv6Connectivity")
    private String ipv6Connectivity;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("InterfaceAlias")
    private String interfaceAlias;

    @JsonProperty("InterfaceIndex")
    private String interfaceIndex;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PSComputerName")
    private String psComputerName;
}
