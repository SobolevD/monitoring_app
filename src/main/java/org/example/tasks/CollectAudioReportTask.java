package org.example.tasks;

import lombok.extern.slf4j.Slf4j;
import org.example.model.ObjectMetadata;
import org.example.model.common.EmailCredentials;
import org.example.model.common.Report;
import org.example.providers.ExcelReportProvider;
import org.example.providers.impl.AudioReportProvider;
import org.example.services.EmailService;
import org.example.utils.PropertiesLoader;
import org.example.utils.ZipUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static org.example.common.ObjectsMetadataDictionary.getObjectMetadataByGroup;
import static org.example.common.PropertiesNames.*;

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
