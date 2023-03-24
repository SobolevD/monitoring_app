package org.example.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class WMIObjectsListInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Name", "__GENUS",
            "__CLASS", "__SUPERCLASS", "__DYNASTY", "__RELPATH", "__PROPERTY_COUNT",
            "__DERIVATION", "__SERVER", "__NAMESPACE", "__PATH"};

    private String psComputerName;
    private String name;
    private String genus;
    private String clazz;
    private String superClass;
    private String dynasty;
    private String relpath;
    private String propertyCount;
    private String derivation;
    private String server;
    private String namespace;
    private String path;
}
