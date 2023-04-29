package org.example.common;

import java.util.Arrays;
import java.util.List;

public abstract class Groups {
    public static final String SECURITY = "security";
    public static final String APPLICATION = "application";
    public static final String BRANCH_CACHE = "branch-cache";
    public static final String COMMON_INFO = "common-info";
    public static final String DIRECT_ACCESS = "direct-access";
    public static final String STORAGE = "storage";
    public static final String DNS_CLIENT = "dns-client";
    public static final String EVENT_LOG = "event-log";
    public static final String NETWORK = "network";
    public static final String SYSTEM_INFO = "system-info";
    public static final String PNP_DEVICE = "pnp-device";
    public static final String PRINT_MANAGEMENT = "print-management";
    public static final String REALTIME_MANAGEMENT = "realtime-management";
    public static final String WMI_OBJECTS = "wmi-objects";
    public static final String AUDIO = "audio";
    public static final String VIDEO = "video";

    public static final List<String> GROUPS_WITH_CUSTOM_EXCEL_REPORT_PROVIDERS
            = Arrays.asList("event-log", "wmi-objects");
}
