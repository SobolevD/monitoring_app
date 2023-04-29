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
public class StorageSettingInfo {

    public static final String[] COLUMN_NAMES = {"PSComputerName", "ScrubPolicy", "NewDiskPolicy"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("ScrubPolicy")
    private String scrubPolicy;

    @JsonProperty("NewDiskPolicy")
    private String newDiskPolicy;

}
