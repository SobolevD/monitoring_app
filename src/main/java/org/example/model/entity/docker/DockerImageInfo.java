package org.example.model.entity.docker;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DockerImageInfo {
    public static final String[] COLUMN_NAMES = {"Containers", "CreatedAt",
            "CreatedSince", "Digest", "ID", "Repository", "SharedSize", "Size", "Tag",
            "UniqueSize", "VirtualSize"};

    @JsonProperty("Containers")
    private String containers;

    @JsonProperty("CreatedAt")
    private String createdAt;

    @JsonProperty("CreatedSince")
    private String createdSince;

    @JsonProperty("Digest")
    private String digest;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Repository")
    private String repository;

    @JsonProperty("SharedSize")
    private String sharedSize;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("Tag")
    private String tag;

    @JsonProperty("UniqueSize")
    private String uniqueSize;

    @JsonProperty("VirtualSize")
    private String virtualSize;
}
