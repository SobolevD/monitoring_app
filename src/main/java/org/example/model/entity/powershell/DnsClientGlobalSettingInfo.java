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
public class DnsClientGlobalSettingInfo {
    public static final String[] COLUMN_NAMES = {"Caption", "Description", "ElementName", "InstanceID", "AddressOrigin", "ProtocolIFType", "AppendParentSuffixes", "AppendPrimarySuffixes", "DNSSuffixesToAppend", "DevolutionLevel", "SuffixSearchList", "UseDevolution", "UseSuffixSearchList", "PSComputerName"};



    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("AddressOrigin")
    private String addressOrigin;

    @JsonProperty("ProtocolIFType")
    private String protocolIFType;

    @JsonProperty("AppendParentSuffixes")
    private String appendParentSuffixes;

    @JsonProperty("AppendPrimarySuffixes")
    private String appendPrimarySuffixes;

    @JsonProperty("DNSSuffixesToAppend")
    private String dNSSuffixesToAppend;

    @JsonProperty("DevolutionLevel")
    private String devolutionLevel;

    @JsonProperty("SuffixSearchList")
    private String suffixSearchList;

    @JsonProperty("UseDevolution")
    private String useDevolution;

    @JsonProperty("UseSuffixSearchList")
    private String useSuffixSearchList;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
