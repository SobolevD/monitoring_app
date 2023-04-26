package scripts;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.example.utils.CommandExecutor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.common.Commands.*;

public class ModelFieldsGenerator {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<String> commands = Arrays.asList(
            "Get-AutologgerConfig",
                "Get-BCClientConfiguration",
                "Get-BCContentServerConfiguration",
                "Get-BCDataCache",
                "Get-BCHashCache",
                "Get-BCStatus",
                "Get-BitLockerVolume",
                "Get-DAClientExperienceConfiguration",
                "Get-DiskStorageNodeView",
                "Get-DnsClientGlobalSetting",
                "Get-HnsEndpoint",
                "Get-HnsNetwork",
                "Get-HnsNamespace",
                "Get-MpPreference",
                "Get-MpThreat",
                "Get-Net6to4Configuration",
                "Get-NetAdapter",
                "Get-NetAdapterAdvancedProperty",
                "Get-NetAdapterBinding",
                "Get-NetAdapterChecksumOffload",
                "Get-NetAdapterHardwareInfo",
                "Get-NetAdapterIPsecOffload",
                "Get-NetAdapterLso",
                "Get-NetAdapterPowerManagement",
                "Get-NetAdapterRdma",
                "Get-NetAdapterRsc",
                "Get-NetAdapterRss",
                "Get-NetAdapterStatistics",
                "Get-NetCompartment",
                "Get-NetFirewallAddressFilter",
                "Get-NetFirewallApplicationFilter",
                "Get-NetFirewallInterfaceFilter",
                "Get-NetFirewallInterfaceTypeFilter",
                "Get-NetFirewallPortFilter",
                "Get-NetFirewallProfile",
                "Get-NetFirewallRule",
                "Get-NetFirewallSecurityFilter",
                "Get-NetFirewallServiceFilter",
                "Get-NetFirewallSetting",
                "Get-NetIPAddress",
                "Get-NetIPInterface",
                "Get-NetIPv4Protocol",
                "Get-NetIPv6Protocol",
                "Get-NetIsatapConfiguration",
                "Get-NetNatExternalAddress",
                "Get-NetNatGlobal",
                "Get-NetNeighbor",
                "Get-NetOffloadGlobalSetting",
                "Get-NetPrefixPolicy",
                "Get-NetTCPConnection",
                "Get-NetTCPSetting",
                "Get-NetTeredoConfiguration",
                "Get-NetTransportFilter",
                "Get-NetUDPEndpoint",
                "Get-NetUDPSetting",
                "Get-OdbcDriver",
                "Get-OdbcDsn",
                "Get-OdbcPerfCounter",
                "Get-Partition",
                "Get-PhysicalDisk",
                "Get-PhysicalDiskStorageNodeView",
                "Get-Printer",
                "Get-PrinterDriver",
                "Get-PrinterPort",
                "Get-ResiliencySetting",
                "Get-StartApps",
                "Get-StorageFaultDomain",
                "Get-StorageFileServer",
                "Get-StorageNode",
                "Get-StoragePool",
                "Get-StorageProvider",
                "Get-StorageSetting",
                "Get-StorageSubSystem",
                "Get-Volume",
                "Get-WindowsUpdateLog"
        );

        for (String command : commands) {
            JsonNode objectByCommand = getObjectByCommand(command);
            List<String> fields = getFieldNames(objectByCommand);

            List<String> output = new ArrayList<>();

            output.add("package org.example.model.entity.powershell;");
            output.add("import com.fasterxml.jackson.annotation.JsonProperty;");
            output.add("import com.fasterxml.jackson.databind.JsonNode;");
            output.add("import lombok.*;");
            output.add("import java.util.List;");
            output.add("");
            output.add("@Data");
            output.add("@Builder");
            output.add("@ToString");
            output.add("@EqualsAndHashCode");
            output.add("@NoArgsConstructor");
            output.add("@AllArgsConstructor");
            output.add(String.format("public class %sInfo {", command.substring(4)));

            output.add(generateColumnNames(fields));
            output.add("");

            for (String field : fields) {
                output.addAll(generateField(field));
            }

            output.add("}");

            try (FileWriter fileWriter = new FileWriter(String.format("C:\\Users\\dmso0321\\Desktop\\cpm data\\%sInfo.java", command.substring(4))))  {
                for (String line : output) {
                    fileWriter.write(line + "\n");
                }
            }
        }

        int a = 3;
    }

    private static String generateColumnNames(List<String> fields) {

        List<String> quotedColumnNames = fields.stream()
                .map(field -> "\"" + field + "\"")
                .collect(Collectors.toList());

        return String.format("public static final String[] COLUMN_NAMES = {%s};",
                String.join(", ", quotedColumnNames));
    }

    private static List<String> generateField(String field) {
        String annotation = String.format("@JsonProperty(\"%s\")", field);

        String camelCasedField = ("" + field.charAt(0)).toLowerCase() + field.substring(1);
        String privateField = String.format("private String %s;", camelCasedField);
        String emptyLine = "";

        return Arrays.asList(annotation, privateField, emptyLine);
    }

    private static JsonNode getObjectByCommand(String command)
            throws IOException, InterruptedException {
        File consoleOutput = CommandExecutor.executeWithPowershellAndGetOutputInJsonFormat(command);
        JsonNode jsonNode = new ObjectMapper().readTree(consoleOutput);

        if (jsonNode.isArray()) {
            return jsonNode.get(0);
        }
        return jsonNode;
    }

    private static List<String> getFieldNames(JsonNode object) {
        Iterator<String> stringIterator = object.fieldNames();

        List<String> fieldNames = new ArrayList<>();
        while (stringIterator.hasNext()) {
            fieldNames.add(stringIterator.next());
        }

        return fieldNames;
    }
}
