package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class TrustedProcesses {

    @JsonProperty(value = "processNames")
    private List<String> processNames;

    @JsonProperty(value = "pathPrefixes")
    private List<String> pathPrefixes;

    @JsonProperty(value = "companies")
    private List<String> companies;

    public static TrustedProcesses fromFile(String trustedProcessesFilePath) throws IOException {
        String trustedProcessesString = Files.readString(Paths.get(trustedProcessesFilePath));
        return new ObjectMapper().readValue(trustedProcessesString, TrustedProcesses.class);
    }

    public boolean containsProcessName(String processName) {
        return processNames.contains(processName);
    }

    public boolean containsPathPrefix(String path) {
        for (String pathPrefix : pathPrefixes) {
            if (path.toLowerCase().startsWith(pathPrefix.toLowerCase()))
                return true;
        }
        return false;
    }

    public boolean containsCompany(String company) {
        return companies.contains(company);
    }
}
