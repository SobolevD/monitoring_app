package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DnsClientGlobalSettingInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "UseDevolution", "DNSSuffixesToAppend", "DevolutionLevel", "Caption", "AppendParentSuffixes", "AppendPrimarySuffixes", "AddressOrigin", "ElementName", "UseSuffixSearchList", "ProtocolIFType", "InstanceID", "SuffixSearchList"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("UseDevolution")
    private String useDevolution;

    @JsonProperty("DNSSuffixesToAppend")
    private JsonNode dNSSuffixesToAppend;

    @JsonProperty("DevolutionLevel")
    private String devolutionLevel;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("AppendParentSuffixes")
    private String appendParentSuffixes;

    @JsonProperty("AppendPrimarySuffixes")
    private String appendPrimarySuffixes;

    @JsonProperty("AddressOrigin")
    private String addressOrigin;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("UseSuffixSearchList")
    private String useSuffixSearchList;

    @JsonProperty("ProtocolIFType")
    private String protocolIFType;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("SuffixSearchList")
    private JsonNode suffixSearchList;

}
