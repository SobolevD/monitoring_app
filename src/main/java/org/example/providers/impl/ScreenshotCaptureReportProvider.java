package org.example.providers.impl;

import org.example.model.common.Report;
import org.example.services.ScreenshotsService;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ScreenshotCaptureReportProvider {

    private final ScreenshotsService SCREENSHOTS_SERVICE = new ScreenshotsService();

    public Report getReport(long durationMillis, int delay)
            throws IOException, InterruptedException, AWTException {

        File record = SCREENSHOTS_SERVICE.createVideo(durationMillis, delay);
        return new Report(null, record);
    }
}
