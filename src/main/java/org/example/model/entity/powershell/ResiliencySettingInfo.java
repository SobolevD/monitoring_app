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
    public static final String[] COLUMN_NAMES = {"ParityLayout", "NumberOfColumnsDefault", "NumberOfGroupsDefault", "ObjectId", "PassThroughClass", "PassThroughIds", "PassThroughNamespace", "PassThroughServer", "UniqueId", "Description", "InterleaveDefault", "InterleaveMax", "InterleaveMin", "Name", "NumberOfColumnsMax", "NumberOfColumnsMin", "NumberOfDataCopiesDefault", "NumberOfDataCopiesMax", "NumberOfDataCopiesMin", "NumberOfGroupsMax", "NumberOfGroupsMin", "PhysicalDiskRedundancyDefault", "PhysicalDiskRedundancyMax", "PhysicalDiskRedundancyMin", "RequestNoSinglePointOfFailure", "PSComputerName"};

    @JsonProperty("ParityLayout")
    private String parityLayout;

    @JsonProperty("NumberOfColumnsDefault")
    private String numberOfColumnsDefault;

    @JsonProperty("NumberOfGroupsDefault")
    private String numberOfGroupsDefault;

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

    @JsonProperty("Description")
    private String description;

    @JsonProperty("InterleaveDefault")
    private String interleaveDefault;

    @JsonProperty("InterleaveMax")
    private String interleaveMax;

    @JsonProperty("InterleaveMin")
    private String interleaveMin;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("NumberOfColumnsMax")
    private String numberOfColumnsMax;

    @JsonProperty("NumberOfColumnsMin")
    private String numberOfColumnsMin;

    @JsonProperty("NumberOfDataCopiesDefault")
    private String numberOfDataCopiesDefault;

    @JsonProperty("NumberOfDataCopiesMax")
    private String numberOfDataCopiesMax;

    @JsonProperty("NumberOfDataCopiesMin")
    private String numberOfDataCopiesMin;

    @JsonProperty("NumberOfGroupsMax")
    private String numberOfGroupsMax;

    @JsonProperty("NumberOfGroupsMin")
    private String numberOfGroupsMin;

    @JsonProperty("PhysicalDiskRedundancyDefault")
    private String physicalDiskRedundancyDefault;

    @JsonProperty("PhysicalDiskRedundancyMax")
    private String physicalDiskRedundancyMax;

    @JsonProperty("PhysicalDiskRedundancyMin")
    private String physicalDiskRedundancyMin;

    @JsonProperty("RequestNoSinglePointOfFailure")
    private String requestNoSinglePointOfFailure;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
