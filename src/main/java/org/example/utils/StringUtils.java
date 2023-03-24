package org.example.utils;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

import static java.util.Objects.isNull;

public abstract class StringUtils {

    public static String getShortOrNull(Short value) {
        if (isNull(value)) {
            return null;
        }
        return value.toString();
    }

    public static String getIntegerOrNull(Integer value) {
        if (isNull(value)) {
            return null;
        }
        return value.toString();
    }

    public static String getLongOrNull(Long value) {
        if (isNull(value)) {
            return null;
        }
        return value.toString();
    }

    public static String getBoolOrNull(Boolean value) {
        if (isNull(value)) {
            return null;
        }
        return value.toString();
    }

    public static String getJsonOrNull(JsonNode value) {
        if (isNull(value)) {
            return null;
        }
        return value.toString();
    }

    public static String getListOrNull(List<?> value) {
        if (isNull(value)) {
            return null;
        }
        return value.toString();
    }
}
