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
    public static final String[] COLUMN_NAMES = {"RenderingMode", "PrinterStatus", "Type", "DeviceType", "Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "BranchOfficeOfflineLogSizeMB", "Comment", "ComputerName", "Datatype", "DefaultJobPriority", "DisableBranchOfficeLogging", "DriverName", "JobCount", "KeepPrintedJobs", "Location", "PermissionSDDL", "PortName", "PrintProcessor", "Priority", "Published", "SeparatorPageFile", "Shared", "ShareName", "StartTime", "UntilTime", "WorkflowPolicy", "PSComputerName"};

    @JsonProperty("RenderingMode")
    private String renderingMode;

    @JsonProperty("PrinterStatus")
    private String printerStatus;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("DeviceType")
    private String deviceType;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

    @JsonProperty("BranchOfficeOfflineLogSizeMB")
    private String branchOfficeOfflineLogSizeMB;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("Datatype")
    private String datatype;

    @JsonProperty("DefaultJobPriority")
    private String defaultJobPriority;

    @JsonProperty("DisableBranchOfficeLogging")
    private String disableBranchOfficeLogging;

    @JsonProperty("DriverName")
    private String driverName;

    @JsonProperty("JobCount")
    private String jobCount;

    @JsonProperty("KeepPrintedJobs")
    private String keepPrintedJobs;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("PermissionSDDL")
    private String permissionSDDL;

    @JsonProperty("PortName")
    private String portName;

    @JsonProperty("PrintProcessor")
    private String printProcessor;

    @JsonProperty("Priority")
    private String priority;

    @JsonProperty("Published")
    private String published;

    @JsonProperty("SeparatorPageFile")
    private String separatorPageFile;

    @JsonProperty("Shared")
    private String shared;

    @JsonProperty("ShareName")
    private String shareName;

    @JsonProperty("StartTime")
    private String startTime;

    @JsonProperty("UntilTime")
    private String untilTime;

    @JsonProperty("WorkflowPolicy")
    private String workflowPolicy;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
