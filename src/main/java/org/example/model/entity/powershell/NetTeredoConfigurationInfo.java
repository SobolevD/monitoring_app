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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "ServerShunt", "RefreshInterval", "DefaultQualified", "Caption", "ClientPort", "Type", "ServerVirtualIP", "ServerName", "ElementName", "InstanceID", "PolicyStore"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ServerShunt")
    private String serverShunt;

    @JsonProperty("RefreshInterval")
    private String refreshInterval;

    @JsonProperty("DefaultQualified")
    private String defaultQualified;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("ClientPort")
    private String clientPort;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("ServerVirtualIP")
    private String serverVirtualIP;

    @JsonProperty("ServerName")
    private String serverName;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PolicyStore")
    private String policyStore;

}
