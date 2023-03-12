package org.example.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Properties;

public abstract class PropertiesLoader {

    private static Properties APPLICATION_PROPERTIES;
    public static void loadProps(String filename) {
        File propertiesFile = new File(filename);
        if (!propertiesFile.exists()) {
            throw new RuntimeException("File with properties " + filename + " doesn't exist");
        }

        try (InputStream is = Files.newInputStream(propertiesFile.toPath())) {
            APPLICATION_PROPERTIES = new Properties();
            APPLICATION_PROPERTIES.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties systemProperties = System.getProperties();
        APPLICATION_PROPERTIES.putAll(systemProperties);
    }

    public static Properties getProperties() {
        return APPLICATION_PROPERTIES;
    }
}
