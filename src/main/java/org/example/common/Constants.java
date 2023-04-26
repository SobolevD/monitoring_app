package org.example.common;

public abstract class Constants {
    public static final String CURRENT_USERNAME = System.getenv("username");
    public static final String PROPERTIES_FILE_PATH_IN_PROJECT = "src/main/resources/application.properties";
    public static final String PROPERTIES_FILE_PATH_IN_ARCHIVE = "classes/application.properties";
    public static final String TRUSTED_PROCESSES_FILE_PATH = "src/main/resources/trusted_processes.json";
}
