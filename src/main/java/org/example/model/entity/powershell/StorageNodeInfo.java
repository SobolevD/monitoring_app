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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "PassThroughServer", "PassThroughIds", "ObjectId", "UniqueId", "NameFormat", "PassThroughNamespace", "OperationalStatus", "PassThroughClass", "Name", "FirmwareVersion", "OtherIdentifyingInfo", "OtherIdentifyingInfoDescription", "SerialNumber", "Manufacturer", "Model"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("NameFormat")
    private String nameFormat;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("OperationalStatus")
    private String operationalStatus;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("FirmwareVersion")
    private String firmwareVersion;

    @JsonProperty("OtherIdentifyingInfo")
    private String otherIdentifyingInfo;

    @JsonProperty("OtherIdentifyingInfoDescription")
    private String otherIdentifyingInfoDescription;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("Manufacturer")
    private String manufacturer;

    @JsonProperty("Model")
    private String model;

}
