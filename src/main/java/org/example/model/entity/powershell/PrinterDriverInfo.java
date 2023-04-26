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
public class PrinterDriverInfo {
    public static final String[] COLUMN_NAMES = {"Caption", "Description", "ElementName", "InstanceID", "CommunicationStatus", "DetailedStatus", "HealthState", "InstallDate", "Name", "OperatingStatus", "OperationalStatus", "PrimaryStatus", "Status", "StatusDescriptions", "ColorProfiles", "ComputerName", "ConfigFile", "CoreDriverDependencies", "DataFile", "Date", "DefaultDatatype", "DependentFiles", "DriverVersion", "HardwareID", "HelpFile", "InfPath", "IsPackageAware", "MajorVersion", "Manufacturer", "Monitor", "OEMUrl", "Path", "PreviousCompatibleNames", "PrinterEnvironment", "PrintProcessor", "provider", "VendorSetup", "PSComputerName"};

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

    @JsonProperty("ColorProfiles")
    private String colorProfiles;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("ConfigFile")
    private String configFile;

    @JsonProperty("CoreDriverDependencies")
    private String coreDriverDependencies;

    @JsonProperty("DataFile")
    private String dataFile;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("DefaultDatatype")
    private String defaultDatatype;

    @JsonProperty("DependentFiles")
    private String dependentFiles;

    @JsonProperty("DriverVersion")
    private String driverVersion;

    @JsonProperty("HardwareID")
    private String hardwareID;

    @JsonProperty("HelpFile")
    private String helpFile;

    @JsonProperty("InfPath")
    private String infPath;

    @JsonProperty("IsPackageAware")
    private String isPackageAware;

    @JsonProperty("MajorVersion")
    private String majorVersion;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Monitor")
    private String monitor;

    @JsonProperty("OEMUrl")
    private String oEMUrl;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("PreviousCompatibleNames")
    private String previousCompatibleNames;

    @JsonProperty("PrinterEnvironment")
    private String printerEnvironment;

    @JsonProperty("PrintProcessor")
    private String printProcessor;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("VendorSetup")
    private String vendorSetup;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
