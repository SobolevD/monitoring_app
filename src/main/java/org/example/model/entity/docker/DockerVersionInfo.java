package org.example.model.entity.docker;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DockerVersionInfo {
    public static final String[] COLUMN_NAMES = {"Client", "Server"};

    @JsonProperty("Client")
    private JsonNode client;

    @JsonProperty("Server")
    private JsonNode server;
}
