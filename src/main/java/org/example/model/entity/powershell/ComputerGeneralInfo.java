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
public class ComputerGeneralInfo {

    public static final String[] COLUMN_NAMES = {"WindowsBuildLabEx", "WindowsCurrentVersion",
            "WindowsEditionId", "WindowsInstallationType", "WindowsInstallDateFromRegistry",
            "WindowsProductId", "WindowsProductName", "WindowsRegisteredOrganization",
            "WindowsRegisteredOwner", "WindowsSystemRoot", "WindowsVersion", "BiosCharacteristics",
            "BiosBIOSVersion", "BiosBuildNumber", "BiosCaption", "BiosCodeSet", "BiosCurrentLanguage",
            "BiosDescription", "BiosEmbeddedControllerMajorVersion", "BiosEmbeddedControllerMinorVersion",
            "BiosFirmwareType", "BiosIdentificationCode", "BiosInstallableLanguages", "BiosInstallDate",
            "BiosLanguageEdition", "BiosListOfLanguages", "BiosManufacturer", "BiosName",
            "BiosOtherTargetOS", "BiosPrimaryBIOS", "BiosReleaseDate", "BiosSeralNumber",
            "BiosSMBIOSBIOSVersion", "BiosSMBIOSMajorVersion", "BiosSMBIOSMinorVersion",
            "BiosSMBIOSPresent", "BiosSoftwareElementState", "BiosStatus", "BiosSystemBiosMajorVersion",
            "BiosSystemBiosMinorVersion", "BiosTargetOperatingSystem", "BiosVersion",
            "CsAdminPasswordStatus", "CsAutomaticManagedPagefile", "CsAutomaticResetBootOption",
            "CsAutomaticResetCapability", "CsBootOptionOnLimit", "CsBootOptionOnWatchDog",
            "CsBootROMSupported", "CsBootStatus", "CsBootupState", "CsCaption", "CsChassisBootupState",
            "CsChassisSKUNumber", "CsCurrentTimeZone", "CsDaylightInEffect", "CsDescription",
            "CsDNSHostName", "CsDomain", "CsDomainRole", "CsEnableDaylightSavingsTime",
            "CsFrontPanelResetStatus", "CsHypervisorPresent", "CsInfraredSupported", "CsInitialLoadInfo",
            "CsInstallDate", "CsKeyboardPasswordStatus", "CsLastLoadInfo", "CsManufacturer", "CsModel",
            "CsName", "CsNetworkAdapters", "CsNetworkServerModeEnabled", "CsNumberOfLogicalProcessors",
            "CsNumberOfProcessors", "CsProcessors", "CsOEMStringArray", "CsPartOfDomain",
            "CsPauseAfterReset", "CsPCSystemType", "CsPCSystemTypeEx", "CsPowerManagementCapabilities",
            "CsPowerManagementSupported", "CsPowerOnPasswordStatus", "CsPowerState", "CsPowerSupplyState",
            "CsPrimaryOwnerContact", "CsPrimaryOwnerName", "CsResetCapability", "CsResetCount",
            "CsResetLimit", "CsRoles", "CsStatus", "CsSupportContactDescription", "CsSystemFamily",
            "CsSystemSKUNumber", "CsSystemType", "CsThermalState", "CsTotalPhysicalMemory",
            "CsPhyicallyInstalledMemory", "CsUserName", "CsWakeUpType", "CsWorkgroup", "OsName", "OsType",
            "OsOperatingSystemSKU", "OsVersion", "OsCSDVersion", "OsBuildNumber", "OsHotFixes",
            "OsBootDevice", "OsSystemDevice", "OsSystemDirectory", "OsSystemDrive", "OsWindowsDirectory",
            "OsCountryCode", "OsCurrentTimeZone", "OsLocaleID", "OsLocale", "OsLocalDateTime",
            "OsLastBootUpTime", "OsUptime", "OsBuildType", "OsCodeSet", "OsDataExecutionPreventionAvailable",
            "OsDataExecutionPrevention32BitApplications", "OsDataExecutionPreventionDrivers",
            "OsDataExecutionPreventionSupportPolicy", "OsDebug", "OsDistributed", "OsEncryptionLevel",
            "OsForegroundApplicationBoost", "OsTotalVisibleMemorySize", "OsFreePhysicalMemory",
            "OsTotalVirtualMemorySize", "OsFreeVirtualMemory", "OsInUseVirtualMemory", "OsTotalSwapSpaceSize",
            "OsSizeStoredInPagingFiles", "OsFreeSpaceInPagingFiles", "OsPagingFiles", "OsHardwareAbstractionLayer",
            "OsInstallDate", "OsManufacturer", "OsMaxNumberOfProcesses", "OsMaxProcessMemorySize",
            "OsMuiLanguages", "OsNumberOfLicensedUsers", "OsNumberOfProcesses", "OsNumberOfUsers",
            "OsOrganization", "OsArchitecture", "OsLanguage", "OsProductSuites", "OsOtherTypeDescription",
            "OsPAEEnabled", "OsPortableOperatingSystem", "OsPrimary", "OsProductType", "OsRegisteredUser",
            "OsSerialNumber", "OsServicePackMajorVersion", "OsServicePackMinorVersion", "OsStatus",
            "OsSuites", "OsServerLevel", "KeyboardLayout", "TimeZone", "LogonServer", "PowerPlatformRole",
            "HyperVisorPresent", "HyperVRequirementDataExecutionPreventionAvailable", "HyperVRequirementSecondLevelAddressTranslation",
            "HyperVRequirementVirtualizationFirmwareEnabled", "HyperVRequirementVMMonitorModeExtensions",
            "DeviceGuardSmartStatus", "DeviceGuardRequiredSecurityProperties", "DeviceGuardAvailableSecurityProperties",
            "DeviceGuardSecurityServicesConfigured", "DeviceGuardSecurityServicesRunning",
            "DeviceGuardCodeIntegrityPolicyEnforcementStatus", "DeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus"};

    @JsonProperty("WindowsBuildLabEx")
    private String windowsBuildLabEx;

    @JsonProperty("WindowsCurrentVersion")
    private String windowsCurrentVersion;

    @JsonProperty("WindowsEditionId")
    private String windowsEditionId;

    @JsonProperty("WindowsInstallationType")
    private String windowsInstallationType;

    @JsonProperty("WindowsInstallDateFromRegistry")
    private String windowsInstallDateFromRegistry;

    @JsonProperty("WindowsProductId")
    private String windowsProductId;

    @JsonProperty("WindowsProductName")
    private String windowsProductName;

    @JsonProperty("WindowsRegisteredOrganization")
    private String windowsRegisteredOrganization;

    @JsonProperty("WindowsRegisteredOwner")
    private String windowsRegisteredOwner;

    @JsonProperty("WindowsSystemRoot")
    private String windowsSystemRoot;

    @JsonProperty("WindowsVersion")
    private String windowsVersion;

    @JsonProperty("BiosCharacteristics")
    private List<Integer> biosCharacteristics;

    @JsonProperty("BiosBIOSVersion")
    private JsonNode biosBIOSVersion;

    @JsonProperty("BiosBuildNumber")
    private String biosBuildNumber;

    @JsonProperty("BiosCaption")
    private String biosCaption;

    @JsonProperty("BiosCodeSet")
    private String biosCodeSet;

    @JsonProperty("BiosCurrentLanguage")
    private String biosCurrentLanguage;

    @JsonProperty("BiosDescription")
    private String biosDescription;

    @JsonProperty("BiosEmbeddedControllerMajorVersion")
    private String biosEmbeddedControllerMajorVersion;

    @JsonProperty("BiosEmbeddedControllerMinorVersion")
    private String biosEmbeddedControllerMinorVersion;

    @JsonProperty("BiosFirmwareType")
    private String biosFirmwareType;

    @JsonProperty("BiosIdentificationCode")
    private String biosIdentificationCode;

    @JsonProperty("BiosInstallableLanguages")
    private String biosInstallableLanguages;

    @JsonProperty("BiosInstallDate")
    private String biosInstallDate;

    @JsonProperty("BiosLanguageEdition")
    private String biosLanguageEdition;

    @JsonProperty("BiosListOfLanguages")
    private List<String> biosListOfLanguages;

    @JsonProperty("BiosManufacturer")
    private String biosManufacturer;

    @JsonProperty("BiosName")
    private String biosName;

    @JsonProperty("BiosOtherTargetOS")
    private String biosOtherTargetOS;

    @JsonProperty("BiosPrimaryBIOS")
    private String biosPrimaryBIOS;

    @JsonProperty("BiosReleaseDate")
    private String biosReleaseDate;

    @JsonProperty("BiosSeralNumber")
    private String biosSeralNumber;

    @JsonProperty("BiosSMBIOSBIOSVersion")
    private String biosSMBIOSBIOSVersion;

    @JsonProperty("BiosSMBIOSMajorVersion")
    private String biosSMBIOSMajorVersion;

    @JsonProperty("BiosSMBIOSMinorVersion")
    private String biosSMBIOSMinorVersion;

    @JsonProperty("BiosSMBIOSPresent")
    private String biosSMBIOSPresent;

    @JsonProperty("BiosSoftwareElementState")
    private String biosSoftwareElementState;

    @JsonProperty("BiosStatus")
    private String biosStatus;

    @JsonProperty("BiosSystemBiosMajorVersion")
    private String biosSystemBiosMajorVersion;

    @JsonProperty("BiosSystemBiosMinorVersion")
    private String biosSystemBiosMinorVersion;

    @JsonProperty("BiosTargetOperatingSystem")
    private String biosTargetOperatingSystem;

    @JsonProperty("BiosVersion")
    private String biosVersion;

    @JsonProperty("CsAdminPasswordStatus")
    private String csAdminPasswordStatus;

    @JsonProperty("CsAutomaticManagedPagefile")
    private String csAutomaticManagedPagefile;

    @JsonProperty("CsAutomaticResetBootOption")
    private String csAutomaticResetBootOption;

    @JsonProperty("CsAutomaticResetCapability")
    private String csAutomaticResetCapability;

    @JsonProperty("CsBootOptionOnLimit")
    private String csBootOptionOnLimit;

    @JsonProperty("CsBootOptionOnWatchDog")
    private String csBootOptionOnWatchDog;

    @JsonProperty("CsBootROMSupported")
    private String csBootROMSupported;

    @JsonProperty("CsBootStatus")
    private String csBootStatus;

    @JsonProperty("CsBootupState")
    private String csBootupState;

    @JsonProperty("CsCaption")
    private String csCaption;

    @JsonProperty("CsChassisBootupState")
    private String csChassisBootupState;

    @JsonProperty("CsChassisSKUNumber")
    private String csChassisSKUNumber;

    @JsonProperty("CsCurrentTimeZone")
    private String csCurrentTimeZone;

    @JsonProperty("CsDaylightInEffect")
    private String csDaylightInEffect;

    @JsonProperty("CsDescription")
    private String csDescription;

    @JsonProperty("CsDNSHostName")
    private String csDNSHostName;

    @JsonProperty("CsDomain")
    private String csDomain;

    @JsonProperty("CsDomainRole")
    private String csDomainRole;

    @JsonProperty("CsEnableDaylightSavingsTime")
    private String csEnableDaylightSavingsTime;

    @JsonProperty("CsFrontPanelResetStatus")
    private String csFrontPanelResetStatus;

    @JsonProperty("CsHypervisorPresent")
    private String csHypervisorPresent;

    @JsonProperty("CsInfraredSupported")
    private String csInfraredSupported;

    @JsonProperty("CsInitialLoadInfo")
    private String csInitialLoadInfo;

    @JsonProperty("CsInstallDate")
    private String csInstallDate;

    @JsonProperty("CsKeyboardPasswordStatus")
    private String csKeyboardPasswordStatus;

    @JsonProperty("CsLastLoadInfo")
    private String csLastLoadInfo;

    @JsonProperty("CsManufacturer")
    private String csManufacturer;

    @JsonProperty("CsModel")
    private String csModel;

    @JsonProperty("CsName")
    private String csName;

    @JsonProperty("CsNetworkAdapters")
    private JsonNode csNetworkAdapters;

    @JsonProperty("CsNetworkServerModeEnabled")
    private String csNetworkServerModeEnabled;

    @JsonProperty("CsNumberOfLogicalProcessors")
    private String csNumberOfLogicalProcessors;

    @JsonProperty("CsNumberOfProcessors")
    private String csNumberOfProcessors;

    @JsonProperty("CsProcessors")
    private JsonNode csProcessors;

    @JsonProperty("CsOEMStringArray")
    private String csOEMStringArray;

    @JsonProperty("CsPartOfDomain")
    private String csPartOfDomain;

    @JsonProperty("CsPauseAfterReset")
    private String csPauseAfterReset;

    @JsonProperty("CsPCSystemType")
    private String csPCSystemType;

    @JsonProperty("CsPCSystemTypeEx")
    private String csPCSystemTypeEx;

    @JsonProperty("CsPowerManagementCapabilities")
    private String csPowerManagementCapabilities;

    @JsonProperty("CsPowerManagementSupported")
    private String csPowerManagementSupported;

    @JsonProperty("CsPowerOnPasswordStatus")
    private String csPowerOnPasswordStatus;

    @JsonProperty("CsPowerState")
    private String csPowerState;

    @JsonProperty("CsPowerSupplyState")
    private String csPowerSupplyState;

    @JsonProperty("CsPrimaryOwnerContact")
    private String csPrimaryOwnerContact;

    @JsonProperty("CsPrimaryOwnerName")
    private String csPrimaryOwnerName;

    @JsonProperty("CsResetCapability")
    private String csResetCapability;

    @JsonProperty("CsResetCount")
    private String csResetCount;

    @JsonProperty("CsResetLimit")
    private String csResetLimit;

    @JsonProperty("CsRoles")
    private List<String> csRoles;

    @JsonProperty("CsStatus")
    private String csStatus;

    @JsonProperty("CsSupportContactDescription")
    private String csSupportContactDescription;

    @JsonProperty("CsSystemFamily")
    private String csSystemFamily;

    @JsonProperty("CsSystemSKUNumber")
    private String csSystemSKUNumber;

    @JsonProperty("CsSystemType")
    private String csSystemType;

    @JsonProperty("CsThermalState")
    private String csThermalState;

    @JsonProperty("CsTotalPhysicalMemory")
    private String csTotalPhysicalMemory;

    @JsonProperty("CsPhyicallyInstalledMemory")
    private String csPhyicallyInstalledMemory;

    @JsonProperty("CsUserName")
    private String csUserName;

    @JsonProperty("CsWakeUpType")
    private String csWakeUpType;

    @JsonProperty("CsWorkgroup")
    private String csWorkgroup;

    @JsonProperty("OsName")
    private String osName;

    @JsonProperty("OsType")
    private String osType;

    @JsonProperty("OsOperatingSystemSKU")
    private String osOperatingSystemSKU;

    @JsonProperty("OsVersion")
    private String osVersion;

    @JsonProperty("OsCSDVersion")
    private String osCSDVersion;

    @JsonProperty("OsBuildNumber")
    private String osBuildNumber;

    @JsonProperty("OsHotFixes")
    private JsonNode osHotFixes;

    @JsonProperty("OsBootDevice")
    private String osBootDevice;

    @JsonProperty("OsSystemDevice")
    private String osSystemDevice;

    @JsonProperty("OsSystemDirectory")
    private String osSystemDirectory;

    @JsonProperty("OsSystemDrive")
    private String osSystemDrive;

    @JsonProperty("OsWindowsDirectory")
    private String osWindowsDirectory;

    @JsonProperty("OsCountryCode")
    private String osCountryCode;

    @JsonProperty("OsCurrentTimeZone")
    private String osCurrentTimeZone;

    @JsonProperty("OsLocaleID")
    private String osLocaleID;

    @JsonProperty("OsLocale")
    private String osLocale;

    @JsonProperty("OsLocalDateTime")
    private String osLocalDateTime;

    @JsonProperty("OsLastBootUpTime")
    private String osLastBootUpTime;

    @JsonProperty("OsUptime")
    private JsonNode osUptime;

    @JsonProperty("OsBuildType")
    private String osBuildType;

    @JsonProperty("OsCodeSet")
    private String osCodeSet;

    @JsonProperty("OsDataExecutionPreventionAvailable")
    private String osDataExecutionPreventionAvailable;

    @JsonProperty("OsDataExecutionPrevention32BitApplications")
    private String osDataExecutionPrevention32BitApplications;

    @JsonProperty("OsDataExecutionPreventionDrivers")
    private String osDataExecutionPreventionDrivers;

    @JsonProperty("OsDataExecutionPreventionSupportPolicy")
    private String osDataExecutionPreventionSupportPolicy;

    @JsonProperty("OsDebug")
    private String osDebug;

    @JsonProperty("OsDistributed")
    private String osDistributed;

    @JsonProperty("OsEncryptionLevel")
    private String osEncryptionLevel;

    @JsonProperty("OsForegroundApplicationBoost")
    private String osForegroundApplicationBoost;

    @JsonProperty("OsTotalVisibleMemorySize")
    private String osTotalVisibleMemorySize;

    @JsonProperty("OsFreePhysicalMemory")
    private String osFreePhysicalMemory;

    @JsonProperty("OsTotalVirtualMemorySize")
    private String osTotalVirtualMemorySize;

    @JsonProperty("OsFreeVirtualMemory")
    private String osFreeVirtualMemory;

    @JsonProperty("OsInUseVirtualMemory")
    private String osInUseVirtualMemory;

    @JsonProperty("OsTotalSwapSpaceSize")
    private String osTotalSwapSpaceSize;

    @JsonProperty("OsSizeStoredInPagingFiles")
    private String osSizeStoredInPagingFiles;

    @JsonProperty("OsFreeSpaceInPagingFiles")
    private String osFreeSpaceInPagingFiles;

    @JsonProperty("OsPagingFiles")
    private List<String> osPagingFiles;

    @JsonProperty("OsHardwareAbstractionLayer")
    private String osHardwareAbstractionLayer;

    @JsonProperty("OsInstallDate")
    private String osInstallDate;

    @JsonProperty("OsManufacturer")
    private String osManufacturer;

    @JsonProperty("OsMaxNumberOfProcesses")
    private String osMaxNumberOfProcesses;

    @JsonProperty("OsMaxProcessMemorySize")
    private String osMaxProcessMemorySize;

    @JsonProperty("OsMuiLanguages")
    private List<String> osMuiLanguages;

    @JsonProperty("OsNumberOfLicensedUsers")
    private String osNumberOfLicensedUsers;

    @JsonProperty("OsNumberOfProcesses")
    private String osNumberOfProcesses;

    @JsonProperty("OsNumberOfUsers")
    private String osNumberOfUsers;

    @JsonProperty("OsOrganization")
    private String osOrganization;

    @JsonProperty("OsArchitecture")
    private String osArchitecture;

    @JsonProperty("OsLanguage")
    private String osLanguage;

    @JsonProperty("OsProductSuites")
    private List<String> osProductSuites;

    @JsonProperty("OsOtherTypeDescription")
    private String osOtherTypeDescription;

    @JsonProperty("OsPAEEnabled")
    private String osPAEEnabled;

    @JsonProperty("OsPortableOperatingSystem")
    private String osPortableOperatingSystem;

    @JsonProperty("OsPrimary")
    private String osPrimary;

    @JsonProperty("OsProductType")
    private String osProductType;

    @JsonProperty("OsRegisteredUser")
    private String osRegisteredUser;

    @JsonProperty("OsSerialNumber")
    private String osSerialNumber;

    @JsonProperty("OsServicePackMajorVersion")
    private String osServicePackMajorVersion;

    @JsonProperty("OsServicePackMinorVersion")
    private String osServicePackMinorVersion;

    @JsonProperty("OsStatus")
    private String osStatus;

    @JsonProperty("OsSuites")
    private List<String> osSuites;

    @JsonProperty("OsServerLevel")
    private String osServerLevel;

    @JsonProperty("KeyboardLayout")
    private String keyboardLayout;

    @JsonProperty("TimeZone")
    private String timeZone;

    @JsonProperty("LogonServer")
    private String logonServer;

    @JsonProperty("PowerPlatformRole")
    private String powerPlatformRole;

    @JsonProperty("HyperVisorPresent")
    private String hyperVisorPresent;

    @JsonProperty("HyperVRequirementDataExecutionPreventionAvailable")
    private String hyperVRequirementDataExecutionPreventionAvailable;

    @JsonProperty("HyperVRequirementSecondLevelAddressTranslation")
    private String hyperVRequirementSecondLevelAddressTranslation;

    @JsonProperty("HyperVRequirementVirtualizationFirmwareEnabled")
    private String hyperVRequirementVirtualizationFirmwareEnabled;

    @JsonProperty("HyperVRequirementVMMonitorModeExtensions")
    private String hyperVRequirementVMMonitorModeExtensions;

    @JsonProperty("DeviceGuardSmartStatus")
    private String deviceGuardSmartStatus;

    @JsonProperty("DeviceGuardRequiredSecurityProperties")
    private List<String> deviceGuardRequiredSecurityProperties;

    @JsonProperty("DeviceGuardAvailableSecurityProperties")
    private List<String> deviceGuardAvailableSecurityProperties;

    @JsonProperty("DeviceGuardSecurityServicesConfigured")
    private List<String> deviceGuardSecurityServicesConfigured;

    @JsonProperty("DeviceGuardSecurityServicesRunning")
    private List<String> deviceGuardSecurityServicesRunning;

    @JsonProperty("DeviceGuardCodeIntegrityPolicyEnforcementStatus")
    private String deviceGuardCodeIntegrityPolicyEnforcementStatus;

    @JsonProperty("DeviceGuardUserModeCodeIntegrityPolicyEnforcementStatus")
    private String deviceGuardUserModeCodeIntegrityPolicyEnforcementStatus;
}
