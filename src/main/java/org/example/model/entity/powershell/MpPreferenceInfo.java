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
public class MpPreferenceInfo {
    public static final String[] COLUMN_NAMES = {"AttackSurfaceReductionOnlyExclusions", "AttackSurfaceReductionRules_Actions", "AttackSurfaceReductionRules_Ids", "CheckForSignaturesBeforeRunningScan", "CloudBlockLevel", "CloudExtendedTimeout", "ComputerID", "ControlledFolderAccessAllowedApplications", "ControlledFolderAccessProtectedFolders", "DisableArchiveScanning", "DisableAutoExclusions", "DisableBehaviorMonitoring", "DisableBlockAtFirstSeen", "DisableCatchupFullScan", "DisableCatchupQuickScan", "DisableEmailScanning", "DisableIntrusionPreventionSystem", "DisableIOAVProtection", "DisablePrivacyMode", "DisableRealtimeMonitoring", "DisableRemovableDriveScanning", "DisableRestorePoint", "DisableScanningMappedNetworkDrivesForFullScan", "DisableScanningNetworkFiles", "DisableScriptScanning", "EnableControlledFolderAccess", "EnableFileHashComputation", "EnableLowCpuPriority", "EnableNetworkProtection", "ExclusionExtension", "ExclusionPath", "ExclusionProcess", "HighThreatDefaultAction", "LowThreatDefaultAction", "MAPSReporting", "ModerateThreatDefaultAction", "PUAProtection", "QuarantinePurgeItemsAfterDelay", "RandomizeScheduleTaskTimes", "RealTimeScanDirection", "RemediationScheduleDay", "RemediationScheduleTime", "ReportingAdditionalActionTimeOut", "ReportingCriticalFailureTimeOut", "ReportingNonCriticalTimeOut", "ScanAvgCPULoadFactor", "ScanOnlyIfIdleEnabled", "ScanParameters", "ScanPurgeItemsAfterDelay", "ScanScheduleDay", "ScanScheduleQuickScanTime", "ScanScheduleTime", "SevereThreatDefaultAction", "SharedSignaturesPath", "SignatureAuGracePeriod", "SignatureDefinitionUpdateFileSharesSources", "SignatureDisableUpdateOnStartupWithoutEngine", "SignatureFallbackOrder", "SignatureFirstAuGracePeriod", "SignatureScheduleDay", "SignatureScheduleTime", "SignatureUpdateCatchupInterval", "SignatureUpdateInterval", "SubmitSamplesConsent", "ThreatIDDefaultAction_Actions", "ThreatIDDefaultAction_Ids", "UILockdown", "UnknownThreatDefaultAction", "PSComputerName"};

    @JsonProperty("AttackSurfaceReductionOnlyExclusions")
    private String attackSurfaceReductionOnlyExclusions;

    @JsonProperty("AttackSurfaceReductionRules_Actions")
    private String attackSurfaceReductionRules_Actions;

    @JsonProperty("AttackSurfaceReductionRules_Ids")
    private String attackSurfaceReductionRules_Ids;

    @JsonProperty("CheckForSignaturesBeforeRunningScan")
    private String checkForSignaturesBeforeRunningScan;

    @JsonProperty("CloudBlockLevel")
    private String cloudBlockLevel;

    @JsonProperty("CloudExtendedTimeout")
    private String cloudExtendedTimeout;

    @JsonProperty("ComputerID")
    private String computerID;

    @JsonProperty("ControlledFolderAccessAllowedApplications")
    private String controlledFolderAccessAllowedApplications;

    @JsonProperty("ControlledFolderAccessProtectedFolders")
    private String controlledFolderAccessProtectedFolders;

    @JsonProperty("DisableArchiveScanning")
    private String disableArchiveScanning;

    @JsonProperty("DisableAutoExclusions")
    private String disableAutoExclusions;

    @JsonProperty("DisableBehaviorMonitoring")
    private String disableBehaviorMonitoring;

    @JsonProperty("DisableBlockAtFirstSeen")
    private String disableBlockAtFirstSeen;

    @JsonProperty("DisableCatchupFullScan")
    private String disableCatchupFullScan;

    @JsonProperty("DisableCatchupQuickScan")
    private String disableCatchupQuickScan;

    @JsonProperty("DisableEmailScanning")
    private String disableEmailScanning;

    @JsonProperty("DisableIntrusionPreventionSystem")
    private String disableIntrusionPreventionSystem;

    @JsonProperty("DisableIOAVProtection")
    private String disableIOAVProtection;

    @JsonProperty("DisablePrivacyMode")
    private String disablePrivacyMode;

    @JsonProperty("DisableRealtimeMonitoring")
    private String disableRealtimeMonitoring;

    @JsonProperty("DisableRemovableDriveScanning")
    private String disableRemovableDriveScanning;

    @JsonProperty("DisableRestorePoint")
    private String disableRestorePoint;

    @JsonProperty("DisableScanningMappedNetworkDrivesForFullScan")
    private String disableScanningMappedNetworkDrivesForFullScan;

    @JsonProperty("DisableScanningNetworkFiles")
    private String disableScanningNetworkFiles;

    @JsonProperty("DisableScriptScanning")
    private String disableScriptScanning;

    @JsonProperty("EnableControlledFolderAccess")
    private String enableControlledFolderAccess;

    @JsonProperty("EnableFileHashComputation")
    private String enableFileHashComputation;

    @JsonProperty("EnableLowCpuPriority")
    private String enableLowCpuPriority;

    @JsonProperty("EnableNetworkProtection")
    private String enableNetworkProtection;

    @JsonProperty("ExclusionExtension")
    private String exclusionExtension;

    @JsonProperty("ExclusionPath")
    private String exclusionPath;

    @JsonProperty("ExclusionProcess")
    private String exclusionProcess;

    @JsonProperty("HighThreatDefaultAction")
    private String highThreatDefaultAction;

    @JsonProperty("LowThreatDefaultAction")
    private String lowThreatDefaultAction;

    @JsonProperty("MAPSReporting")
    private String mAPSReporting;

    @JsonProperty("ModerateThreatDefaultAction")
    private String moderateThreatDefaultAction;

    @JsonProperty("PUAProtection")
    private String pUAProtection;

    @JsonProperty("QuarantinePurgeItemsAfterDelay")
    private String quarantinePurgeItemsAfterDelay;

    @JsonProperty("RandomizeScheduleTaskTimes")
    private String randomizeScheduleTaskTimes;

    @JsonProperty("RealTimeScanDirection")
    private String realTimeScanDirection;

    @JsonProperty("RemediationScheduleDay")
    private String remediationScheduleDay;

    @JsonProperty("RemediationScheduleTime")
    private String remediationScheduleTime;

    @JsonProperty("ReportingAdditionalActionTimeOut")
    private String reportingAdditionalActionTimeOut;

    @JsonProperty("ReportingCriticalFailureTimeOut")
    private String reportingCriticalFailureTimeOut;

    @JsonProperty("ReportingNonCriticalTimeOut")
    private String reportingNonCriticalTimeOut;

    @JsonProperty("ScanAvgCPULoadFactor")
    private String scanAvgCPULoadFactor;

    @JsonProperty("ScanOnlyIfIdleEnabled")
    private String scanOnlyIfIdleEnabled;

    @JsonProperty("ScanParameters")
    private String scanParameters;

    @JsonProperty("ScanPurgeItemsAfterDelay")
    private String scanPurgeItemsAfterDelay;

    @JsonProperty("ScanScheduleDay")
    private String scanScheduleDay;

    @JsonProperty("ScanScheduleQuickScanTime")
    private String scanScheduleQuickScanTime;

    @JsonProperty("ScanScheduleTime")
    private String scanScheduleTime;

    @JsonProperty("SevereThreatDefaultAction")
    private String severeThreatDefaultAction;

    @JsonProperty("SharedSignaturesPath")
    private String sharedSignaturesPath;

    @JsonProperty("SignatureAuGracePeriod")
    private String signatureAuGracePeriod;

    @JsonProperty("SignatureDefinitionUpdateFileSharesSources")
    private String signatureDefinitionUpdateFileSharesSources;

    @JsonProperty("SignatureDisableUpdateOnStartupWithoutEngine")
    private String signatureDisableUpdateOnStartupWithoutEngine;

    @JsonProperty("SignatureFallbackOrder")
    private String signatureFallbackOrder;

    @JsonProperty("SignatureFirstAuGracePeriod")
    private String signatureFirstAuGracePeriod;

    @JsonProperty("SignatureScheduleDay")
    private String signatureScheduleDay;

    @JsonProperty("SignatureScheduleTime")
    private String signatureScheduleTime;

    @JsonProperty("SignatureUpdateCatchupInterval")
    private String signatureUpdateCatchupInterval;

    @JsonProperty("SignatureUpdateInterval")
    private String signatureUpdateInterval;

    @JsonProperty("SubmitSamplesConsent")
    private String submitSamplesConsent;

    @JsonProperty("ThreatIDDefaultAction_Actions")
    private String threatIDDefaultAction_Actions;

    @JsonProperty("ThreatIDDefaultAction_Ids")
    private String threatIDDefaultAction_Ids;

    @JsonProperty("UILockdown")
    private String uILockdown;

    @JsonProperty("UnknownThreatDefaultAction")
    private String unknownThreatDefaultAction;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
