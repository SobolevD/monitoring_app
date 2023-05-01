package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.Report;
import org.example.providers.impl.ScreenshotCaptureReportProvider;
import org.example.utils.PropertiesLoader;

import java.awt.*;
import java.io.IOException;
import java.util.Collections;

@Slf4j
public class CollectScreenshotsVideoReportTask extends ReportTask {

    private final ScreenshotCaptureReportProvider screenshotCaptureReportProvider;
    private final long recordDurationMillis;
    private final int delayBetweenImages;

    public CollectScreenshotsVideoReportTask(long recordDurationMillis, int delayBetweenImages) {
        super(PropertiesLoader.getProperties());
        this.screenshotCaptureReportProvider = new ScreenshotCaptureReportProvider();
        this.recordDurationMillis = recordDurationMillis;
        this.delayBetweenImages = delayBetweenImages;
    }

    @Override
    public void run() {

        try {
            Report report = screenshotCaptureReportProvider.getReport(recordDurationMillis, delayBetweenImages);
            collectAndSendReport(Collections.singletonList(report));
        } catch (IOException | InterruptedException | AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
