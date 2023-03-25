package org.example.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class WMIObjectsListInfo {

    public static final String[] COLUMN_NAMES = {"Path", "Derivation", "Methods",
            "Scope", "Options", "ClassPath", "Properties", "SystemProperties",
            "Qualifiers", "Site", "Container", "PSComputerName", "Name", "__GENUS", "__CLASS",
            "__SUPERCLASS", "__DYNASTY", "__RELPATH", "__PROPERTY_COUNT", "__DERIVATION",
            "__SERVER", "__NAMESPACE", "__PATH"};

    @Data
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PathInfo {

        @JsonProperty("Path")
        private String path;

        @JsonProperty("RelativePath")
        private String relativePath;

        @JsonProperty("Server")
        private String server;

        @JsonProperty("NamespacePath")
        private String namespacePath;

        @JsonProperty("ClassName")
        private String className;

        @JsonProperty("IsClass")
        private String isClass;

        @JsonProperty("IsInstance")
        private String isInstance;

        @JsonProperty("IsSingleton")
        private String isSingleton;
    }

    @Data
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Scope {

        @JsonProperty("IsConnected")
        private String isConnected;

        @JsonProperty("Options")
        private String options;

        @JsonProperty("Path")
        private String path;
    }

    @Data
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Options {

        @JsonProperty("UseAmendedQualifiers")
        private String useAmendedQualifiers;

        @JsonProperty("Context")
        private String context;

        @JsonProperty("Timeout")
        private String timeout;
    }

    @Data
    @Builder
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ClassPath {

        @JsonProperty("Path")
        private String path;

        @JsonProperty("RelativePath")
        private String relativePath;

        @JsonProperty("Server")
        private String server;

        @JsonProperty("NamespacePath")
        private String namespacePath;

        @JsonProperty("ClassName")
        private String className;

        @JsonProperty("IsClass")
        private String isClass;

        @JsonProperty("IsInstance")
        private String isInstance;

        @JsonProperty("IsSingleton")
        private String isSingleton;
    }

    @JsonProperty("Path")
    private PathInfo pathInfo;

    @JsonProperty("Derivation")
    private List<String> derivation;

    @JsonProperty("Methods")
    private List<String> methods;

    @JsonProperty("Scope")
    private Scope scope;

    @JsonProperty("Options")
    private Options options;

    @JsonProperty("ClassPath")
    private ClassPath classPath;

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

    @JsonProperty("Name")
    private String name;

    @JsonProperty("__GENUS")
    private String genus;

    @JsonProperty("__CLASS")
    private String clazz;

    @JsonProperty("__SUPERCLASS")
    private String superClass;

    @JsonProperty("__DYNASTY")
    private String dynasty;

    @JsonProperty("__RELPATH")
    private String relPath;

    @JsonProperty("__PROPERTY_COUNT")
    private String propertyCount;

    @JsonProperty("__DERIVATION")
    private List<String> __derivation;

    @JsonProperty("__SERVER")
    private String server;

    @JsonProperty("__NAMESPACE")
    private String namespace;

    @JsonProperty("__PATH")
    private String path;
}
