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
public class OdbcPerfCounterInfo {
    public static final String[] COLUMN_NAMES = {"IsEnabled", "Platform", "PSComputerName"};

    @JsonProperty("IsEnabled")
    private String isEnabled;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
