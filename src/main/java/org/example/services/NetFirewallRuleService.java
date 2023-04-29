package org.example.services;

import org.example.model.entity.netsh.NetFirewallRule;
import org.example.utils.CommandExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NetFirewallRuleService {
    public List<NetFirewallRule> getInfo(String command)
            throws IOException {
        BufferedReader consoleOutput = CommandExecutor.executeAndGetOutput(command);

        String regexWithMinuses = "-+";

        Stream<String> lines = consoleOutput.lines();
        lines = lines.filter(line -> !line.isBlank() && !line.matches(regexWithMinuses));

        String regexToSplit = ": +";

        List<String[]> fields = lines.map(line -> line.split(regexToSplit)).collect(Collectors.toUnmodifiableList());

        List<NetFirewallRule> firewallRules = new ArrayList<>();
        for (int i = 0; i < fields.size(); i += 12) {
            firewallRules.add(NetFirewallRule.builder()
                    .name(fields.get(i).length == 2 ? fields.get(i)[1] : null)
                    .enabled(fields.get(i + 1).length == 2 ? Boolean.parseBoolean(fields.get(i + 1)[1]) : null)
                    .direction(fields.get(i + 2).length == 2 ? fields.get(i + 2)[1] : null)
                    .profiles(fields.get(i + 3).length == 2 ? fields.get(i + 3)[1] : null)
                    .grouping(fields.get(i + 4).length == 2 ? fields.get(i + 4)[1] : null)
                    .localIp(fields.get(i + 5).length == 2 ? fields.get(i + 5)[1] : null)
                    .remoteIp(fields.get(i + 6).length == 2 ? fields.get(i + 6)[1] : null)
                    .protocol(fields.get(i + 7).length == 2 ? fields.get(i + 7)[1] : null)
                    .localPort(fields.get(i + 8).length == 2 ? fields.get(i + 8)[1] : null)
                    .remotePort(fields.get(i + 9).length == 2 ? fields.get(i + 9)[1] : null)
                    .edgeTraversal(fields.get(i + 10).length == 2 ? fields.get(i + 10)[1] : null)
                    .action(fields.get(i + 11).length == 2 ? fields.get(i + 11)[1] : null)
                    .build());
        }
        return firewallRules;
    }
}
