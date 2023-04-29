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
public class ControlPanelItemInfo {

    public static final String[] COLUMN_NAMES = {"Name", "CanonicalName", "Category", "Description"};

    @JsonProperty("Name")
    private String name;

    @JsonProperty("CanonicalName")
    private String canonicalName;

    @JsonProperty("Category")
    private JsonNode category;

    @JsonProperty("Description")
    private String description;
}
