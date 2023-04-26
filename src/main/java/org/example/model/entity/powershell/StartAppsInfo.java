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
public class StartAppsInfo {
    public static final String[] COLUMN_NAMES = {"Name", "AppID"};

    @JsonProperty("Name")
    private String name;

    @JsonProperty("AppID")
    private String appID;

}
