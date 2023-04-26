package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventLogGeneralInfo {

    public static final String[] COLUMN_NAMES = {"Entries", "LogDisplayName", "Log", "MachineName",
            "MaximumKilobytes", "OverflowAction", "MinimumRetentionDays", "EnableRaisingEvents",
            "SynchronizingObject", "Source", "Site", "Container"};

    private String entries;
    private String logDisplayName;
    private String log;
    private String machineName;
    private String maximumKilobytes;
    private String overflowAction;
    private String minimumRetentionDays;
    private String enableRaisingEvents;
    private String synchronizingObject;
    private String source;
    private String site;
    private String container;
}
