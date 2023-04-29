package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.Report;
import org.example.providers.impl.AudioReportProvider;
import org.example.utils.PropertiesLoader;

import java.io.IOException;
import java.util.Collections;

@Slf4j
public class CollectAudioReportTask extends ReportTask {

    private final AudioReportProvider audioReportProvider;
    private final long recordDurationMillis;

    public CollectAudioReportTask(long recordDurationMillis) {
        super(PropertiesLoader.getProperties());
        this.audioReportProvider = new AudioReportProvider();
        this.recordDurationMillis = recordDurationMillis;
    }

    @Override
    public void run() {

        try {
            Report report = audioReportProvider.getReport(recordDurationMillis);
            collectAndSendReport(Collections.singletonList(report));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
