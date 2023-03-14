package org.example.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class ProcessResourcesInfo {

    public static final String[] COLUMN_NAMES = {"Name","SI","Handles","VM","WS","PM", "NPM","Path","Company", "CPU", "FileVersion",
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

    private String name;
    private String systemIndex;
    private String handles;
    private String virtualMemory;
    private String ws;
    private String physicalMemoryUsage;
    private String numberOfProcessesInMemory;
    private String path;
    private String company;
    private String cpu;
    private String fileVersion;
    private String productVersion;
    private String description;
    private String product;
    private String nounName;
    private String basePriority;
    private String exitCode;
    private String hasExited;
    private String exitTime;
    private String handle;
    private String safeHandle;
    private String handleCount;
    private String pid;
    private String machineName;
    private String mainWindowHandle;
    private String mainWindowTitle;
    private String mainModule;
    private String maxWorkingSet;
    private String minWorkingSet;
    private String modules;
    private String nonpagedSystemMemorySize;
    private String nonpagedSystemMemorySize64;
    private String pagedMemorySize;
    private String pagedMemorySize64;
    private String pagedSystemMemorySize;
    private String pagedSystemMemorySize64;
    private String peakPagedMemorySize;
    private String peakPagedMemorySize64;
    private String peakWorkingSet;
    private String peakWorkingSet64;
    private String peakVirtualMemorySize;
    private String peakVirtualMemorySize64;
    private String priorityBoostEnabled;
    private String priorityClass;
    private String privateMemorySize;
    private String privateMemorySize64;
    private String privilegedProcessorTime;
    private String processName;
    private String processorAffinity;
    private String responding;
    private String sessionId;
    private String startInfo;
    private String startTime;
    private String synchronizingObject;
    private String threads;
    private String totalProcessorTime;
    private String userProcessorTime;
    private String virtualMemorySize;
    private String virtualMemorySize64;
    private String enableRaisingEvents;
    private String standardInput;
    private String standardOutput;
    private String standardError;
    private String workingSet;
    private String workingSet64;
    private String site;
    private String container;
}
