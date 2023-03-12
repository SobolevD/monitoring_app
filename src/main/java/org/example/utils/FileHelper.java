package org.example.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class FileHelper {
    public static File collectConsoleOutput(BufferedReader consoleOutput) {
        File temporaryFile;
        try {
            temporaryFile = File.createTempFile("consoleOutput", ".csv");

            List<String> consoleOutputList = new ArrayList<>();

            String consoleLine;
            while (nonNull(consoleLine = consoleOutput.readLine())) {
                consoleOutputList.add(consoleLine);
            }
            consoleOutput.close();

            String entireConsoleOutput = String.join("\n", consoleOutputList);

            try (FileWriter fw = new FileWriter(temporaryFile)) {
                fw.write(entireConsoleOutput);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return temporaryFile;
    }
}
