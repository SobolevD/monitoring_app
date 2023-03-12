package org.example.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CommandExecutor {

    public static BufferedReader executeAndGetOutput(String cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);
        return new BufferedReader(new InputStreamReader(p.getInputStream()));
    }
}
