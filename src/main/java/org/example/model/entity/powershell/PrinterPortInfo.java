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
public class PrinterPortInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Status", "PortMonitor", "Description", "CommunicationStatus", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "Name", "OperatingStatus", "ElementName", "DetailedStatus", "InstanceID", "ComputerName", "StatusDescriptions", "HealthState"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PortMonitor")
    private String portMonitor;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("HealthState")
    private String healthState;

}
