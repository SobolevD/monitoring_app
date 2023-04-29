package org.example.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public abstract class DateTimeHelper {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS z";
    private static final String DATE_FORMAT_FOR_FILE_NAME = "yyyy-MM-dd_HH-mm-ss";

    public static String getCurrentTimeAsString() {
        SimpleDateFormat dateFormatGMT = new SimpleDateFormat(DATE_FORMAT);
        dateFormatGMT.setTimeZone(TimeZone.getTimeZone("GMT+4"));
        return dateFormatGMT.format(new Date());
    }

    public static String getCurrentTimeForFileName() {
        SimpleDateFormat dateFormatGMT = new SimpleDateFormat(DATE_FORMAT_FOR_FILE_NAME);
        dateFormatGMT.setTimeZone(TimeZone.getTimeZone("GMT+4"));
        return dateFormatGMT.format(new Date());
    }
}
