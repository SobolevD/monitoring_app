package org.example.model.entity.netsh;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.example.utils.CommandExecutor;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetFirewallRule {

    private String name;
    private boolean enabled;
    private String direction;
    private String profiles;
    private String grouping;
    private String localIp;
    private String remoteIp;
    private String protocol;
    private String localPort;
    private String remotePort;
    private String edgeTraversal;
    private String action;
}
