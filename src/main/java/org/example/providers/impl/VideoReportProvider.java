package org.example.providers.impl;

import org.example.model.common.Report;
import org.example.services.WebCamService;

import java.io.File;
import java.io.IOException;

public class VideoReportProvider {

    private final WebCamService VIDEO_SERVICE = new WebCamService();

    public Report getReport(long durationMillis, int delay)
            throws IOException, InterruptedException {

        File record = VIDEO_SERVICE.createVideo(durationMillis, delay);
        return new Report(null, record);
    }
}
