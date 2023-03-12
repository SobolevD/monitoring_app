package org.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class ProcessInfo {
    private String imageName;
    private int pid;
    private String sessionName;
    private short sessionNum;
    private String memoryUsage;
    private String status;
    private String username;
    private String cpuTime;
    private String title;
}
