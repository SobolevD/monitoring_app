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
public class NetFirewallApplicationFilterInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Status", "Program", "Description", "AppPath", "CommunicationStatus", "SystemCreationClassName", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "Name", "CreationClassName", "OperatingStatus", "IsNegated", "ElementName", "Package", "DetailedStatus", "SystemName", "InstanceID", "StatusDescriptions", "HealthState"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Program")
    private String program;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("AppPath")
    private String appPath;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("SystemCreationClassName")
    private String systemCreationClassName;

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

    @JsonProperty("CreationClassName")
    private String creationClassName;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("IsNegated")
    private String isNegated;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("Package")
    private String packageInfo;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("SystemName")
    private String systemName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("HealthState")
    private String healthState;

}
