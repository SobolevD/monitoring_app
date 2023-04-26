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
public class InstalledAppsInfo {

    public static final String[] COLUMN_NAMES = {
            "DisplayName", "DisplayVersion", "InstallDate",
            "IsMinorUpgrade", "ParentDisplayName", "MoreInfoURL", "ParentKeyName",
            "(default)", "Installed", "Resume", "EngineVersion", "BundleTag", "BundleProviderKey",
            "BundleVersion", "BundlePatchCode", "BundleDetectCode", "BundleAddonCode",
            "BundleUpgradeCode", "BundleCachePath", "Inno Setup CodeFile: SetupType",
            "Inno Setup: Deselected Tasks", "Inno Setup: Selected Tasks",
            "Inno Setup: Deselected Components", "Inno Setup: Selected Components",
            "Inno Setup: Setup Type", "MinorVersion", "MajorVersion", "QuietUninstallString",
            "Inno Setup: Language", "Inno Setup: User", "Inno Setup: Icon Group",
            "Inno Setup: App Path", "Inno Setup: Setup Version", "ProductID", "SPPSkuId",
            "SkuComponents", "ShellUITransformLanguage", "ProductCodes", "AuthorizedCDFPrefix",
            "Brand", "DisplayIcon", "PackageRefs", "CacheLocation", "NoElevateOnModify",
            "SystemComponent", "InstallType", "UnInstallString", "ProductCode", "NoRemove",
            "Comments", "Contact", "HelpLink", "HelpTelephone",
            "InstallLocation", "InstallSource", "ModifyPath", "NoModify", "NoRepair",
            "Publisher", "Readme", "Size", "EstimatedSize", "UninstallString", "URLInfoAbout",
            "URLUpdateInfo", "VersionMajor", "VersionMinor", "WindowsInstaller", "Version",
            "Language", "PSPath", "PSParentPath", "PSChildName", "PSDrive",
            "PSProvider"};

    @JsonProperty("DisplayName")
    private String displayName;

    @JsonProperty("DisplayVersion")
    private String displayVersion;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("ParentDisplayName")
    private String parentDisplayName;

    @JsonProperty("IsMinorUpgrade")
    private String isMinorUpgrade;

    @JsonProperty("MoreInfoURL")
    private String moreInfoURL;

    @JsonProperty("ParentKeyName")
    private String parentKeyName;

    @JsonProperty("(default)")
    private String defaultValue;

    @JsonProperty("Installed")
    private String installed;

    @JsonProperty("Resume")
    private String resume;

    @JsonProperty("EngineVersion")
    private String engineVersion;

    @JsonProperty("BundleTag")
    private String bundleTag;

    @JsonProperty("BundleProviderKey")
    private String bundleProviderKey;

    @JsonProperty("BundleVersion")
    private String bundleVersion;

    @JsonProperty("BundleDetectCode")
    private List<String> bundleDetectCode;

    @JsonProperty("BundlePatchCode")
    private List<String> bundlePatchCode;

    @JsonProperty("BundleAddonCode")
    private List<String> bundleAddonCode;

    @JsonProperty("BundleUpgradeCode")
    private List<String> bundleUpgradeCode;

    @JsonProperty("BundleCachePath")
    private String bundleCachePath;

    @JsonProperty("Inno Setup CodeFile: SetupType")
    private String innoSetupCodeFileSetupType;

    @JsonProperty("Inno Setup: Deselected Tasks")
    private String innoSetupDeselectedTasks;

    @JsonProperty("Inno Setup: Selected Tasks")
    private String innoSetupSelectedTasks;

    @JsonProperty("Inno Setup: Deselected Components")
    private String innoSetupDeselectedComponents;

    @JsonProperty("Inno Setup: Selected Components")
    private String innoSetupSelectedComponents;

    @JsonProperty("Inno Setup: Setup Type")
    private String innoSetupType;

    @JsonProperty("MinorVersion")
    private String minorVersion;

    @JsonProperty("MajorVersion")
    private String majorVersion;

    @JsonProperty("QuietUninstallString")
    private String quietUninstallString;

    @JsonProperty("Inno Setup: Language")
    private String innoSetupLanguage;

    @JsonProperty("Inno Setup: User")
    private String innoSetupUser;

    @JsonProperty("Inno Setup: Icon Group")
    private String innoSetupIconGroup;

    @JsonProperty("Inno Setup: App Path")
    private String innoSetupAppPath;

    @JsonProperty("Inno Setup: Setup Version")
    private String innoSetupVersion;

    @JsonProperty("ProductID")
    private String productID;

    @JsonProperty("SPPSkuId")
    private List<String> sppSkuId;

    @JsonProperty("SkuComponents")
    private List<String> skuComponents;

    @JsonProperty("ShellUITransformLanguage")
    private String shellUITransformLanguage;

    @JsonProperty("ProductCodes")
    private List<String> productCodes;

    @JsonProperty("AuthorizedCDFPrefix")
    private String authorizedCDFPrefix;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("DisplayIcon")
    private String displayIcon;

    @JsonProperty("PackageRefs")
    private List<String> packageRefs;

    @JsonProperty("CacheLocation")
    private String cacheLocation;

    @JsonProperty("NoElevateOnModify")
    private String noElevateOnModify;

    @JsonProperty("SystemComponent")
    private String systemComponent;

    @JsonProperty("InstallType")
    private String installType;

    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("NoRemove")
    private String noRemove;

    @JsonProperty("UnInstallString")
    private String unInstallString;

    @JsonProperty("Comments")
    private String comments;

    @JsonProperty("Contact")
    private String contact;

    @JsonProperty("HelpLink")
    private String helpLink;

    @JsonProperty("HelpTelephone")
    private String helpTelephone;

    @JsonProperty("InstallLocation")
    private String installLocation;

    @JsonProperty("InstallSource")
    private String installSource;

    @JsonProperty("ModifyPath")
    private String modifyPath;

    @JsonProperty("NoModify")
    private String noModify;

    @JsonProperty("NoRepair")
    private String noRepair;

    @JsonProperty("Publisher")
    private String publisher;

    @JsonProperty("Readme")
    private String readme;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("EstimatedSize")
    private String estimatedSize;

    @JsonProperty("UninstallString")
    private String uninstallString;

    @JsonProperty("URLInfoAbout")
    private String urlInfoAbout;

    @JsonProperty("URLUpdateInfo")
    private String urlUpdateInfo;

    @JsonProperty("VersionMajor")
    private String versionMajor;

    @JsonProperty("VersionMinor")
    private String versionMinor;

    @JsonProperty("WindowsInstaller")
    private String windowsInstaller;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Language")
    private String language;

    @JsonProperty("PSPath")
    private String psPath;

    @JsonProperty("PSParentPath")
    private String psParentPath;

    @JsonProperty("PSChildName")
    private String psChildName;

    @JsonProperty("PSDrive")
    private JsonNode psDrive;

    @JsonProperty("PSProvider")
    private JsonNode psProvider;
}
