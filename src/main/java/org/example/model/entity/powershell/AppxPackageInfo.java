package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AppxPackageInfo {

    public static final String[] COLUMN_NAMES = {"Name", "Publisher", "PublisherId",
            "Architecture", "ResourceId", "Version", "PackageFamilyName",
            "PackageFullName", "InstallLocation", "IsFramework", "PackageUserInformation",
            "IsResourcePackage", "IsBundle", "IsDevelopmentMode", "NonRemovable", "Dependencies",
            "IsPartiallyStaged", "SignatureKind", "Status"};

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Publisher")
    private String publisher;

    @JsonProperty("PublisherId")
    private String publisherId;

    @JsonProperty("Architecture")
    private String architecture;

    @JsonProperty("ResourceId")
    private String resourceId;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("PackageFamilyName")
    private String packageFamilyName;

    @JsonProperty("PackageFullName")
    private String packageFullName;

    @JsonProperty("InstallLocation")
    private String installLocation;

    @JsonProperty("IsFramework")
    private String isFramework;

    @JsonProperty("PackageUserInformation")
    private List<String> packageUserInformation;

    @JsonProperty("IsResourcePackage")
    private String isResourcePackage;

    @JsonProperty("IsBundle")
    private String isBundle;

    @JsonProperty("IsDevelopmentMode")
    private String isDevelopmentMode;

    @JsonProperty("NonRemovable")
    private String nonRemovable;

    @JsonProperty("Dependencies")
    private List<String> dependencies;

    @JsonProperty("IsPartiallyStaged")
    private String isPartiallyStaged;

    @JsonProperty("SignatureKind")
    private String signatureKind;

    @JsonProperty("Status")
    private String status;
}
