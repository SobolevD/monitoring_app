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
public class PrinterInfo {

    public static final String[] COLUMN_NAMES = {"Comment", "Priority", "Status", "StartTime", "OperationalStatus", "PrimaryStatus", "Caption", "InstallDate", "DefaultJobPriority", "DeviceType", "PrinterStatus", "Type", "JobCount", "UntilTime", "Published", "ComputerName", "Location", "HealthState", "PSComputerName", "Description", "PrintProcessor", "DisableBranchOfficeLogging", "CommunicationStatus", "Datatype", "DriverName", "PermissionSDDL", "PortName", "ShareName", "Shared", "Name", "WorkflowPolicy", "RenderingMode", "OperatingStatus", "BranchOfficeOfflineLogSizeMB", "ElementName", "DetailedStatus", "InstanceID", "StatusDescriptions", "KeepPrintedJobs", "SeparatorPageFile"};

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("Priority")
    private String priority;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("StartTime")
    private String startTime;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("DefaultJobPriority")
    private String defaultJobPriority;

    @JsonProperty("DeviceType")
    private String deviceType;

    @JsonProperty("PrinterStatus")
    private String printerStatus;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("JobCount")
    private String jobCount;

    @JsonProperty("UntilTime")
    private String untilTime;

    @JsonProperty("Published")
    private String published;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("PrintProcessor")
    private String printProcessor;

    @JsonProperty("DisableBranchOfficeLogging")
    private String disableBranchOfficeLogging;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("Datatype")
    private String datatype;

    @JsonProperty("DriverName")
    private String driverName;

    @JsonProperty("PermissionSDDL")
    private String permissionSDDL;

    @JsonProperty("PortName")
    private String portName;

    @JsonProperty("ShareName")
    private String shareName;

    @JsonProperty("Shared")
    private String shared;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("WorkflowPolicy")
    private String workflowPolicy;

    @JsonProperty("RenderingMode")
    private String renderingMode;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("BranchOfficeOfflineLogSizeMB")
    private String branchOfficeOfflineLogSizeMB;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("KeepPrintedJobs")
    private String keepPrintedJobs;

    @JsonProperty("SeparatorPageFile")
    private String separatorPageFile;

}
