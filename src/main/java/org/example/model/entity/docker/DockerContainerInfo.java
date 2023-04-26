package org.example.model.entity.docker;


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
public class DockerContainerInfo {
    public static final String[] COLUMN_NAMES = {"Command", "CreatedAt",
            "ID", "Image", "Labels", "LocalVolumes", "Mounts", "Names", "Networks", "Ports",
            "RunningFor", "Size", "State", "Status"};

    @JsonProperty("Command")
    private String command;

    @JsonProperty("CreatedAt")
    private String createdAt;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Image")
    private String image;

    @JsonProperty("Labels")
    private String labels;

    @JsonProperty("LocalVolumes")
    private String localVolumes;

    @JsonProperty("Mounts")
    private String mounts;

    @JsonProperty("Names")
    private String names;

    @JsonProperty("Networks")
    private String networks;

    @JsonProperty("Ports")
    private String ports;

    @JsonProperty("RunningFor")
    private String runningFor;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Status")
    private String status;
}
