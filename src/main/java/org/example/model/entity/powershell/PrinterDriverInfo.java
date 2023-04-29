package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrinterDriverInfo {

    public static final String[] COLUMN_NAMES = {"MajorVersion", "Path", "Status", "ConfigFile", "OperationalStatus", "PrimaryStatus", "DriverVersion", "CoreDriverDependencies", "Caption", "InstallDate", "Date", "ColorProfiles", "PreviousCompatibleNames", "DefaultDatatype", "ComputerName", "VendorSetup", "HelpFile", "IsPackageAware", "HealthState", "PSComputerName", "Description", "HardwareID", "PrintProcessor", "CommunicationStatus", "OEMUrl", "DependentFiles", "Name", "Monitor", "OperatingStatus", "DataFile", "provider", "PrinterEnvironment", "ElementName", "DetailedStatus", "Manufacturer", "InstanceID", "InfPath", "StatusDescriptions"};

    @JsonProperty("MajorVersion")
    private String majorVersion;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("ConfigFile")
    private String configFile;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PrimaryStatus")
    private String primaryStatus;

    @JsonProperty("DriverVersion")
    private String driverVersion;

    @JsonProperty("CoreDriverDependencies")
    private String coreDriverDependencies;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("ColorProfiles")
    private String colorProfiles;

    @JsonProperty("PreviousCompatibleNames")
    private String previousCompatibleNames;

    @JsonProperty("DefaultDatatype")
    private String defaultDatatype;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("VendorSetup")
    private String vendorSetup;

    @JsonProperty("HelpFile")
    private String helpFile;

    @JsonProperty("IsPackageAware")
    private String isPackageAware;

    @JsonProperty("HealthState")
    private String healthState;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("HardwareID")
    private String hardwareID;

    @JsonProperty("PrintProcessor")
    private String printProcessor;

    @JsonProperty("CommunicationStatus")
    private String communicationStatus;

    @JsonProperty("OEMUrl")
    private String oEMUrl;

    @JsonProperty("DependentFiles")
    private JsonNode dependentFiles;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Monitor")
    private String monitor;

    @JsonProperty("OperatingStatus")
    private String operatingStatus;

    @JsonProperty("DataFile")
    private String dataFile;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("PrinterEnvironment")
    private String printerEnvironment;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("DetailedStatus")
    private String detailedStatus;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("InfPath")
    private String infPath;

    @JsonProperty("StatusDescriptions")
    private String statusDescriptions;

}
