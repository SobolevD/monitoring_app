package org.example.common;

import org.example.model.GroupMetadata;
import org.example.model.ObjectMetadata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.common.Groups.*;
import static org.example.common.PropertiesNames.*;

public class ResourcesGroupMetadataDictionary {

    private static final Map<String, GroupMetadata> MAP = new HashMap<>() {{
        put(SECURITY, GroupMetadata.builder()
                .name(SECURITY)
                .delayPropertyName(TASK_COLLECT_SECURITY_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_SECURITY_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(APPLICATION, GroupMetadata.builder()
                .name(APPLICATION)
                .delayPropertyName(TASK_COLLECT_APPLICATION_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_APPLICATION_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(BRANCH_CACHE, GroupMetadata.builder()
                .name(BRANCH_CACHE)
                .delayPropertyName(TASK_COLLECT_BC_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_BC_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(COMMON_INFO, GroupMetadata.builder()
                .name(COMMON_INFO)
                .delayPropertyName(TASK_COLLECT_COMMON_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_COMMON_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(DIRECT_ACCESS, GroupMetadata.builder()
                .name(DIRECT_ACCESS)
                .delayPropertyName(TASK_COLLECT_DIRECT_ACCESS_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_DIRECT_ACCESS_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(STORAGE, GroupMetadata.builder()
                .name(STORAGE)
                .delayPropertyName(TASK_COLLECT_STORAGE_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_STORAGE_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(DNS_CLIENT, GroupMetadata.builder()
                .name(DNS_CLIENT)
                .delayPropertyName(TASK_COLLECT_DNS_CLIENT_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_DNS_CLIENT_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(EVENT_LOG, GroupMetadata.builder()
                .name(EVENT_LOG)
                .delayPropertyName(TASK_COLLECT_EVENT_LOG_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_EVENT_LOG_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(NETWORK, GroupMetadata.builder()
                .name(NETWORK)
                .delayPropertyName(TASK_COLLECT_NETWORK_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_NETWORK_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(SYSTEM_INFO, GroupMetadata.builder()
                .name(SYSTEM_INFO)
                .delayPropertyName(TASK_COLLECT_SYSTEM_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_SYSTEM_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(PNP_DEVICE, GroupMetadata.builder()
                .name(PNP_DEVICE)
                .delayPropertyName(TASK_COLLECT_PNP_DEVICES_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_PNP_DEVICES_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(PRINT_MANAGEMENT, GroupMetadata.builder()
                .name(PRINT_MANAGEMENT)
                .delayPropertyName(TASK_COLLECT_PRINT_MANAGEMENT_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_PRINT_MANAGEMENT_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(REALTIME_MANAGEMENT, GroupMetadata.builder()
                .name(REALTIME_MANAGEMENT)
                .delayPropertyName(TASK_COLLECT_REALTIME_MANAGEMENT_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_REALTIME_MANAGEMENT_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(WMI_OBJECTS, GroupMetadata.builder()
                .name(WMI_OBJECTS)
                .delayPropertyName(TASK_COLLECT_WMI_OBJECTS_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_WMI_OBJECTS_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(AUDIO, GroupMetadata.builder()
                .name(AUDIO)
                .delayPropertyName(TASK_COLLECT_AUDIO_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_AUDIO_INFO_PERIOD_SECONDS_PROP)
                .build());
        put(VIDEO, GroupMetadata.builder()
                .name(VIDEO)
                .delayPropertyName(TASK_COLLECT_VIDEO_INFO_DELAY_SECONDS_PROP)
                .periodPropertyName(TASK_COLLECT_VIDEO_INFO_PERIOD_SECONDS_PROP)
                .build());
    }};

    public static GroupMetadata getGroupMetadataByGroup(String group) {
        return MAP.values()
                .stream()
                .filter(groupMetadata -> groupMetadata.getName().equals(group))
                .findFirst().get();
    }
}
