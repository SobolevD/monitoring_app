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
public class ServiceInfo {

    public static final String[] COLUMN_NAMES = {"Name", "RequiredServices", "CanPauseAndContinue",
            "CanShutdown", "CanStop", "DisplayName", "DependentServices",
            "MachineName", "ServiceName", "ServicesDependedOn", "ServiceHandle",
            "Status", "ServiceType", "StartType", "Site", "Container"};

    @JsonProperty("Name")
    private String name;

    @JsonProperty("RequiredServices")
    private List<String> requiredServices;

    @JsonProperty("CanPauseAndContinue")
    private String canPauseAndContinue;

    @JsonProperty("CanShutdown")
    private String canShutdown;

    @JsonProperty("CanStop")
    private String canStop;

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("DependentServices")
    private List<String> dependentServices;

    @JsonProperty("MachineName")
    private String machineName;

    @JsonProperty("ServiceName")
    private String serviceName;

    @JsonProperty("ServicesDependedOn")
    private List<String> servicesDependedOn;

    @JsonProperty("ServiceHandle")
    private JsonNode serviceHandle;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("ServiceType")
    private String serviceType;

    @JsonProperty("StartType")
    private String startType;

    @JsonProperty("Site")
    private String site;

    @JsonProperty("Container")
    private String container;
}
