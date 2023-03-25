package org.example.model.entity;

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
public class NetworkConnectionProfileInfo {

    public static final String[] COLUMN_NAMES = {"CimClass", "CimInstanceProperties",
            "CimSystemProperties", "NetworkCategory", "DomainAuthenticationKind",
            "IPv4Connectivity", "IPv6Connectivity", "Caption", "Description",
            "ElementName", "InstanceID", "InterfaceAlias", "InterfaceIndex", "Name", "PSComputerName"};

    @Data
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CimInstanceProperties {

        @JsonProperty("Name")
        private String name;

        @JsonProperty("Value")
        private String value;

        @JsonProperty("CimType")
        private String cimType;

        @JsonProperty("Flags")
        private String flags;

        @JsonProperty("IsValueModified")
        private String isValueModified;
    }

    @Data
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CimSystemProperties {

        @JsonProperty("Namespace")
        private String namespace;

        @JsonProperty("ServerName")
        private String serverName;

        @JsonProperty("ClassName")
        private String className;

        @JsonProperty("Path")
        private String path;
    }

    @JsonProperty("CimClass")
    private JsonNode cimClass;

    @JsonProperty("CimInstanceProperties")
    private List<CimInstanceProperties> cimInstanceProperties;

    @JsonProperty("CimSystemProperties")
    private CimSystemProperties cimSystemProperties;

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
