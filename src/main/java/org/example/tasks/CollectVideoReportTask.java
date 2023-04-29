package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.Report;
import org.example.providers.impl.VideoReportProvider;
import org.example.utils.PropertiesLoader;

import java.io.IOException;
import java.util.Collections;

@Slf4j
public class CollectVideoReportTask extends ReportTask {

    private final VideoReportProvider videoReportProvider;
    private final long recordDurationMillis;
    private final int delayBetweenImages;

    public CollectVideoReportTask(long recordDurationMillis, int delayBetweenImages) {
        super(PropertiesLoader.getProperties());
        this.videoReportProvider = new VideoReportProvider();
        this.recordDurationMillis = recordDurationMillis;
        this.delayBetweenImages = delayBetweenImages;
    }

    @Override
    public void run() {

        try {
            Report report = videoReportProvider.getReport(recordDurationMillis, delayBetweenImages);
            collectAndSendReport(Collections.singletonList(report));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
