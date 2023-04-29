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
public class ResiliencySettingInfo {

    public static final String[] COLUMN_NAMES = {"NumberOfGroupsMin", "PhysicalDiskRedundancyMax", "ObjectId", "UniqueId", "InterleaveMax", "PassThroughClass", "NumberOfColumnsMin", "PhysicalDiskRedundancyMin", "NumberOfDataCopiesMin", "NumberOfColumnsDefault", "PSComputerName", "PassThroughServer", "PassThroughIds", "Description", "PassThroughNamespace", "NumberOfDataCopiesMax", "NumberOfDataCopiesDefault", "Name", "NumberOfGroupsMax", "InterleaveDefault", "PhysicalDiskRedundancyDefault", "NumberOfGroupsDefault", "InterleaveMin", "NumberOfColumnsMax", "RequestNoSinglePointOfFailure", "ParityLayout"};

    @JsonProperty("NumberOfGroupsMin")
    private String numberOfGroupsMin;

    @JsonProperty("PhysicalDiskRedundancyMax")
    private String physicalDiskRedundancyMax;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("UniqueId")
    private String uniqueId;

    @JsonProperty("InterleaveMax")
    private String interleaveMax;

    @JsonProperty("PassThroughClass")
    private String passThroughClass;

    @JsonProperty("NumberOfColumnsMin")
    private String numberOfColumnsMin;

    @JsonProperty("PhysicalDiskRedundancyMin")
    private String physicalDiskRedundancyMin;

    @JsonProperty("NumberOfDataCopiesMin")
    private String numberOfDataCopiesMin;

    @JsonProperty("NumberOfColumnsDefault")
    private String numberOfColumnsDefault;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("PassThroughServer")
    private String passThroughServer;

    @JsonProperty("PassThroughIds")
    private String passThroughIds;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("PassThroughNamespace")
    private String passThroughNamespace;

    @JsonProperty("NumberOfDataCopiesMax")
    private String numberOfDataCopiesMax;

    @JsonProperty("NumberOfDataCopiesDefault")
    private String numberOfDataCopiesDefault;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("NumberOfGroupsMax")
    private String numberOfGroupsMax;

    @JsonProperty("InterleaveDefault")
    private String interleaveDefault;

    @JsonProperty("PhysicalDiskRedundancyDefault")
    private String physicalDiskRedundancyDefault;

    @JsonProperty("NumberOfGroupsDefault")
    private String numberOfGroupsDefault;

    @JsonProperty("InterleaveMin")
    private String interleaveMin;

    @JsonProperty("NumberOfColumnsMax")
    private String numberOfColumnsMax;

    @JsonProperty("RequestNoSinglePointOfFailure")
    private String requestNoSinglePointOfFailure;

    @JsonProperty("ParityLayout")
    private String parityLayout;

}
