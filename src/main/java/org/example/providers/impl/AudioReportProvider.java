package org.example.providers.impl;

import org.example.model.common.Report;
import org.example.services.AudioService;

import java.io.File;
import java.io.IOException;

public class AudioReportProvider {

    private final AudioService AUDIO_SERVICE = new AudioService();

    public Report getReport(long durationMillis)
            throws IOException, InterruptedException {

        File record = AUDIO_SERVICE.record(durationMillis);
        return new Report(null, record);
    }
}
