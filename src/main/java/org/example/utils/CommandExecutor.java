package org.example.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CommandExecutor {

    public static BufferedReader executeAndGetOutput(String cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);
        return new BufferedReader(new InputStreamReader(p.getInputStream()));
    }

    public static File executeWithPowershellAndGetOutputInJsonFormat(String cmd)
            throws IOException, InterruptedException {
        String powershellCommand = String.format("powershell \"%s | ConvertTo-Json | Out-File temp_shell.json\"", cmd);
        Process p = Runtime.getRuntime().exec(powershellCommand);
        p.waitFor();

        File file = new File("temp_shell.json");
        file.deleteOnExit();
        return file;
    }

    public static File executeWithPowershellAndGetOutputInCsvFormat(String cmd)
            throws IOException, InterruptedException {
        String powershellCommand = String.format("powershell \"%s | Export-Csv -NoTypeInformation temp_shell.csv\"", cmd);
        Process p = Runtime.getRuntime().exec(powershellCommand);
        p.waitFor();

        File file = new File("temp_shell.csv");
        file.deleteOnExit();
        return file;
    }
}
