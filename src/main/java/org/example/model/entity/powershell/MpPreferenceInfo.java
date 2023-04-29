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
public class MpPreferenceInfo {

    public static final String[] COLUMN_NAMES = {"DisableScanningNetworkFiles", "SignatureScheduleDay", "DisableCatchupQuickScan", "EnableLowCpuPriority", "EnableNetworkProtection", "DisableRestorePoint", "DisableRemovableDriveScanning", "ComputerID", "ScanScheduleDay", "DisableIOAVProtection", "PUAProtection", "ReportingAdditionalActionTimeOut", "AttackSurfaceReductionRules_Actions", "CheckForSignaturesBeforeRunningScan", "DisableArchiveScanning", "PSComputerName", "ReportingNonCriticalTimeOut", "SignatureScheduleTime", "SevereThreatDefaultAction", "SignatureFallbackOrder", "SignatureFirstAuGracePeriod", "DisableCatchupFullScan", "EnableFileHashComputation", "ControlledFolderAccessAllowedApplications", "UILockdown", "RemediationScheduleTime", "RandomizeScheduleTaskTimes", "AttackSurfaceReductionRules_Ids", "ThreatIDDefaultAction_Ids", "DisableEmailScanning", "DisableIntrusionPreventionSystem", "ScanAvgCPULoadFactor", "DisableBlockAtFirstSeen", "HighThreatDefaultAction", "DisableRealtimeMonitoring", "DisableScriptScanning", "AttackSurfaceReductionOnlyExclusions", "CloudBlockLevel", "DisableBehaviorMonitoring", "ThreatIDDefaultAction_Actions", "CloudExtendedTimeout", "RealTimeScanDirection", "EnableControlledFolderAccess", "DisableScanningMappedNetworkDrivesForFullScan", "ScanOnlyIfIdleEnabled", "ScanParameters", "MAPSReporting", "SharedSignaturesPath", "ScanPurgeItemsAfterDelay", "QuarantinePurgeItemsAfterDelay", "SubmitSamplesConsent", "DisablePrivacyMode", "ModerateThreatDefaultAction", "SignatureDisableUpdateOnStartupWithoutEngine", "ReportingCriticalFailureTimeOut", "ScanScheduleQuickScanTime", "DisableAutoExclusions", "ScanScheduleTime", "LowThreatDefaultAction", "SignatureAuGracePeriod", "SignatureDefinitionUpdateFileSharesSources", "SignatureUpdateCatchupInterval", "ExclusionPath", "RemediationScheduleDay", "ExclusionProcess", "ControlledFolderAccessProtectedFolders", "UnknownThreatDefaultAction", "ExclusionExtension", "SignatureUpdateInterval"};

    @JsonProperty("DisableScanningNetworkFiles")
    private String disableScanningNetworkFiles;

    @JsonProperty("SignatureScheduleDay")
    private String signatureScheduleDay;

    @JsonProperty("DisableCatchupQuickScan")
    private String disableCatchupQuickScan;

    @JsonProperty("EnableLowCpuPriority")
    private String enableLowCpuPriority;

    @JsonProperty("EnableNetworkProtection")
    private String enableNetworkProtection;

    @JsonProperty("DisableRestorePoint")
    private String disableRestorePoint;

    @JsonProperty("DisableRemovableDriveScanning")
    private String disableRemovableDriveScanning;

    @JsonProperty("ComputerID")
    private String computerID;

    @JsonProperty("ScanScheduleDay")
    private String scanScheduleDay;

    @JsonProperty("DisableIOAVProtection")
    private String disableIOAVProtection;

    @JsonProperty("PUAProtection")
    private String pUAProtection;

    @JsonProperty("ReportingAdditionalActionTimeOut")
    private String reportingAdditionalActionTimeOut;

    @JsonProperty("AttackSurfaceReductionRules_Actions")
    private String attackSurfaceReductionRules_Actions;

    @JsonProperty("CheckForSignaturesBeforeRunningScan")
    private String checkForSignaturesBeforeRunningScan;

    @JsonProperty("DisableArchiveScanning")
    private String disableArchiveScanning;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ReportingNonCriticalTimeOut")
    private String reportingNonCriticalTimeOut;

    @JsonProperty("SignatureScheduleTime")
    private JsonNode signatureScheduleTime;

    @JsonProperty("SevereThreatDefaultAction")
    private String severeThreatDefaultAction;

    @JsonProperty("SignatureFallbackOrder")
    private String signatureFallbackOrder;

    @JsonProperty("SignatureFirstAuGracePeriod")
    private String signatureFirstAuGracePeriod;

    @JsonProperty("DisableCatchupFullScan")
    private String disableCatchupFullScan;

    @JsonProperty("EnableFileHashComputation")
    private String enableFileHashComputation;

    @JsonProperty("ControlledFolderAccessAllowedApplications")
    private String controlledFolderAccessAllowedApplications;

    @JsonProperty("UILockdown")
    private String uILockdown;

    @JsonProperty("RemediationScheduleTime")
    private JsonNode remediationScheduleTime;

    @JsonProperty("RandomizeScheduleTaskTimes")
    private String randomizeScheduleTaskTimes;

    @JsonProperty("AttackSurfaceReductionRules_Ids")
    private String attackSurfaceReductionRules_Ids;

    @JsonProperty("ThreatIDDefaultAction_Ids")
    private String threatIDDefaultAction_Ids;

    @JsonProperty("DisableEmailScanning")
    private String disableEmailScanning;

    @JsonProperty("DisableIntrusionPreventionSystem")
    private String disableIntrusionPreventionSystem;

    @JsonProperty("ScanAvgCPULoadFactor")
    private String scanAvgCPULoadFactor;

    @JsonProperty("DisableBlockAtFirstSeen")
    private String disableBlockAtFirstSeen;

    @JsonProperty("HighThreatDefaultAction")
    private String highThreatDefaultAction;

    @JsonProperty("DisableRealtimeMonitoring")
    private String disableRealtimeMonitoring;

    @JsonProperty("DisableScriptScanning")
    private String disableScriptScanning;

    @JsonProperty("AttackSurfaceReductionOnlyExclusions")
    private String attackSurfaceReductionOnlyExclusions;

    @JsonProperty("CloudBlockLevel")
    private String cloudBlockLevel;

    @JsonProperty("DisableBehaviorMonitoring")
    private String disableBehaviorMonitoring;

    @JsonProperty("ThreatIDDefaultAction_Actions")
    private String threatIDDefaultAction_Actions;

    @JsonProperty("CloudExtendedTimeout")
    private String cloudExtendedTimeout;

    @JsonProperty("RealTimeScanDirection")
    private String realTimeScanDirection;

    @JsonProperty("EnableControlledFolderAccess")
    private String enableControlledFolderAccess;

    @JsonProperty("DisableScanningMappedNetworkDrivesForFullScan")
    private String disableScanningMappedNetworkDrivesForFullScan;

    @JsonProperty("ScanOnlyIfIdleEnabled")
    private String scanOnlyIfIdleEnabled;

    @JsonProperty("ScanParameters")
    private String scanParameters;

    @JsonProperty("MAPSReporting")
    private String mAPSReporting;

    @JsonProperty("SharedSignaturesPath")
    private String sharedSignaturesPath;

    @JsonProperty("ScanPurgeItemsAfterDelay")
    private String scanPurgeItemsAfterDelay;

    @JsonProperty("QuarantinePurgeItemsAfterDelay")
    private String quarantinePurgeItemsAfterDelay;

    @JsonProperty("SubmitSamplesConsent")
    private String submitSamplesConsent;

    @JsonProperty("DisablePrivacyMode")
    private String disablePrivacyMode;

    @JsonProperty("ModerateThreatDefaultAction")
    private String moderateThreatDefaultAction;

    @JsonProperty("SignatureDisableUpdateOnStartupWithoutEngine")
    private String signatureDisableUpdateOnStartupWithoutEngine;

    @JsonProperty("ReportingCriticalFailureTimeOut")
    private String reportingCriticalFailureTimeOut;

    @JsonProperty("ScanScheduleQuickScanTime")
    private JsonNode scanScheduleQuickScanTime;

    @JsonProperty("DisableAutoExclusions")
    private String disableAutoExclusions;

    @JsonProperty("ScanScheduleTime")
    private JsonNode scanScheduleTime;

    @JsonProperty("LowThreatDefaultAction")
    private String lowThreatDefaultAction;

    @JsonProperty("SignatureAuGracePeriod")
    private String signatureAuGracePeriod;

    @JsonProperty("SignatureDefinitionUpdateFileSharesSources")
    private String signatureDefinitionUpdateFileSharesSources;

    @JsonProperty("SignatureUpdateCatchupInterval")
    private String signatureUpdateCatchupInterval;

    @JsonProperty("ExclusionPath")
    private String exclusionPath;

    @JsonProperty("RemediationScheduleDay")
    private String remediationScheduleDay;

    @JsonProperty("ExclusionProcess")
    private String exclusionProcess;

    @JsonProperty("ControlledFolderAccessProtectedFolders")
    private String controlledFolderAccessProtectedFolders;

    @JsonProperty("UnknownThreatDefaultAction")
    private String unknownThreatDefaultAction;

    @JsonProperty("ExclusionExtension")
    private String exclusionExtension;

    @JsonProperty("SignatureUpdateInterval")
    private String signatureUpdateInterval;

}
