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
public class NetTeredoConfigurationInfo {
    public static final String[] COLUMN_NAMES = {"Type", "Caption", "Description", "ElementName", "InstanceID", "ClientPort", "DefaultQualified", "PolicyStore", "RefreshInterval", "ServerName", "ServerShunt", "ServerVirtualIP", "PSComputerName"};

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("ClientPort")
    private String clientPort;

    @JsonProperty("DefaultQualified")
    private String defaultQualified;

    @JsonProperty("PolicyStore")
    private String policyStore;

    @JsonProperty("RefreshInterval")
    private String refreshInterval;

    @JsonProperty("ServerName")
    private String serverName;

    @JsonProperty("ServerShunt")
    private String serverShunt;

    @JsonProperty("ServerVirtualIP")
    private String serverVirtualIP;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
