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
public class ProcessResourcesInfo {

    public static final String[] COLUMN_NAMES = {"Name", "SI", "Handles", "VM", "WS", "PM", "NPM", "Path", "Company", "CPU", "FileVersion",
            "ProductVersion", "Description", "Product", "__NounName", "BasePriority", "ExitCode",
            "HasExited", "ExitTime", "Handle", "SafeHandle", "HandleCount", "Id", "MachineName",
            "MainWindowHandle", "MainWindowTitle", "MainModule", "MaxWorkingSet",
            "MinWorkingSet", "Modules", "NonpagedSystemMemorySize", "NonpagedSystemMemorySize64",
            "PagedMemorySize", "PagedMemorySize64", "PagedSystemMemorySize", "PagedSystemMemorySize64",
            "PeakPagedMemorySize", "PeakPagedMemorySize64", "PeakWorkingSet", "PeakWorkingSet64",
            "PeakVirtualMemorySize", "PeakVirtualMemorySize64", "PriorityBoostEnabled", "PriorityClass",
            "PrivateMemorySize", "PrivateMemorySize64", "PrivilegedProcessorTime", "ProcessName",
            "ProcessorAffinity", "Responding", "SessionId", "StartInfo", "StartTime", "SynchronizingObject",
            "Threads", "TotalProcessorTime", "UserProcessorTime", "VirtualMemorySize", "VirtualMemorySize64",
            "EnableRaisingEvents", "StandardInput", "StandardOutput", "StandardError", "WorkingSet",
            "WorkingSet64", "Site", "Container"};

    @JsonProperty("Name")
    private String name;
    @JsonProperty("SI")
    private Short systemIndex;
    @JsonProperty("Handles")
    private Integer handles;
    @JsonProperty("VM")
    private Long virtualMemory;
    @JsonProperty("WS")
    private Long ws;
    @JsonProperty("PM")
    private Long physicalMemoryUsage;
    @JsonProperty("NPM")
    private Integer numberOfProcessesInMemory;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("Company")
    private String company;
    @JsonProperty("CPU")
    private String cpu;
    @JsonProperty("FileVersion")
    private String fileVersion;
    @JsonProperty("ProductVersion")
    private String productVersion;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("__NounName")
    private String nounName;
    @JsonProperty("BasePriority")
    private Short basePriority;
    @JsonProperty("ExitCode")
    private Short exitCode;
    @JsonProperty("HasExited")
    private Boolean hasExited;
    @JsonProperty("ExitTime")
    private String exitTime;
    @JsonProperty("Handle")
    private Integer handle;
    @JsonProperty("SafeHandle")
    private JsonNode safeHandle;
    @JsonProperty("HandleCount")
    private Integer handleCount;
    @JsonProperty("Id")
    private Integer pid;
    @JsonProperty("MachineName")
    private String machineName;
    @JsonProperty("MainWindowHandle")
    private Long mainWindowHandle;
    @JsonProperty("MainWindowTitle")
    private String mainWindowTitle;
    @JsonProperty("MainModule")
    private JsonNode mainModule;
    @JsonProperty("MaxWorkingSet")
    private Long maxWorkingSet;
    @JsonProperty("MinWorkingSet")
    private Long minWorkingSet;
    @JsonProperty("Modules")
    private List<String> modules;
    @JsonProperty("NonpagedSystemMemorySize")
    private Integer nonpagedSystemMemorySize;
    @JsonProperty("NonpagedSystemMemorySize64")
    private Long nonpagedSystemMemorySize64;
    @JsonProperty("PagedMemorySize")
    private Integer pagedMemorySize;
    @JsonProperty("PagedMemorySize64")
    private Long pagedMemorySize64;
    @JsonProperty("PagedSystemMemorySize")
    private Integer pagedSystemMemorySize;
    @JsonProperty("PagedSystemMemorySize64")
    private Long pagedSystemMemorySize64;
    @JsonProperty("PeakPagedMemorySize")
    private Integer peakPagedMemorySize;
    @JsonProperty("PeakPagedMemorySize64")
    private Long peakPagedMemorySize64;
    @JsonProperty("PeakWorkingSet")
    private Integer peakWorkingSet;
    @JsonProperty("PeakWorkingSet64")
    private Long peakWorkingSet64;
    @JsonProperty("PeakVirtualMemorySize")
    private Integer peakVirtualMemorySize;
    @JsonProperty("PeakVirtualMemorySize64")
    private Long peakVirtualMemorySize64;
    @JsonProperty("PriorityBoostEnabled")
    private Boolean priorityBoostEnabled;
    @JsonProperty("PriorityClass")
    private Integer priorityClass;
    @JsonProperty("PrivateMemorySize")
    private Integer privateMemorySize;
    @JsonProperty("PrivateMemorySize64")
    private Long privateMemorySize64;
    @JsonProperty("PrivilegedProcessorTime")
    private JsonNode privilegedProcessorTime;
    @JsonProperty("ProcessName")
    private String processName;
    @JsonProperty("ProcessorAffinity")
    private Integer processorAffinity;
    @JsonProperty("Responding")
    private Boolean responding;
    @JsonProperty("SessionId")
    private Integer sessionId;
    @JsonProperty("StartInfo")
    private JsonNode startInfo;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("SynchronizingObject")
    private String synchronizingObject;
    @JsonProperty("Threads")
    private List<String> threads;
    @JsonProperty("TotalProcessorTime")
    private JsonNode totalProcessorTime;
    @JsonProperty("UserProcessorTime")
    private JsonNode userProcessorTime;
    @JsonProperty("VirtualMemorySize")
    private Integer virtualMemorySize;
    @JsonProperty("VirtualMemorySize64")
    private Long virtualMemorySize64;
    @JsonProperty("EnableRaisingEvents")
    private Boolean enableRaisingEvents;
    @JsonProperty("StandardInput")
    private String standardInput;
    @JsonProperty("StandardOutput")
    private String standardOutput;
    @JsonProperty("StandardError")
    private String standardError;
    @JsonProperty("WorkingSet")
    private Integer workingSet;
    @JsonProperty("WorkingSet64")
    private Long workingSet64;
    @JsonProperty("Site")
    private String site;
    @JsonProperty("Container")
    private String container;
}
