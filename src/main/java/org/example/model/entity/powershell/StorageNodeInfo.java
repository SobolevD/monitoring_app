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
public class StorageNodeInfo {
    public static final String[] COLUMN_NAMES = {"NameFormat", "OperationalStatus", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "FirmwareVersion", "Manufacturer", "Model", "Name", "OtherIdentifyingInfo", "OtherIdentifyingInfoDescription", "SerialNumber", "PSComputerName"};

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OtherIdentifyingInfo")
    private String otherIdentifyingInfo;

    @JsonProperty("OtherIdentifyingInfoDescription")
    private String otherIdentifyingInfoDescription;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
