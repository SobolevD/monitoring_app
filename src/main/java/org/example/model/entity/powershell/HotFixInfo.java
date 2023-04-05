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
public class HotFixInfo {

    public static final String[] COLUMN_NAMES = {"Scope", "Path", "Options",
            "ClassPath", "Properties", "SystemProperties", "Qualifiers",
            "Site", "Container", "PSComputerName", "InstalledOn",
            "Caption", "CSName", "Description", "FixComments",
            "HotFixID", "InstallDate", "InstalledBy", "Name",
            "ServicePackInEffect", "Status"};

    @JsonProperty("Scope")
    private JsonNode scope;

    @JsonProperty("Path")
    private JsonNode path;

    @JsonProperty("Options")
    private JsonNode options;

    @JsonProperty("ClassPath")
    private JsonNode classPath;

    @JsonProperty("Properties")
    private List<String> properties;

    @JsonProperty("SystemProperties")
    private List<String> systemProperties;

    @JsonProperty("Qualifiers")
    private List<String> qualifiers;

    @JsonProperty("Site")
    private String site;

    @JsonProperty("Container")
    private String container;

    @JsonProperty("PSComputerName")
    private String psComputerName;

    @JsonProperty("InstalledOn")
    private JsonNode installedOn;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("CSName")
    private String csName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("FixComments")
    private String fixComments;

    @JsonProperty("HotFixID")
    private String hotFixID;

    @JsonProperty("InstallDate")
    private String installDate;

    @JsonProperty("InstalledBy")
    private String installedBy;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("ServicePackInEffect")
    private String servicePackInEffect;

    @JsonProperty("Status")
    private String status;
}
