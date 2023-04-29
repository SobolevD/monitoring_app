package org.example.services;

import com.github.sarxos.webcam.Webcam;
import org.jcodec.api.awt.AWTSequenceEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.example.utils.DateTimeHelper.getCurrentTimeForFileName;

public class WebCamService {

    private List<BufferedImage> getImages(long durationMillis, int delay) throws InterruptedException {

        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        webcam.open();

        Date currentDate = new Date();
        long currentTimeInMillis = currentDate.getTime();

        Date endTime = new Date(currentTimeInMillis + durationMillis);

        List<BufferedImage> result = new ArrayList<>();
        while (new Date().before(endTime)) {
            BufferedImage frame = webcam.getImage();
            result.add(frame);
            Thread.sleep(delay);
        }

        webcam.close();

        return result;
    }

    public File createVideo(long durationMillis, int delay)
            throws IOException, InterruptedException {

        File videoFile = new File("cam_" + getCurrentTimeForFileName() + ".mp4");
        videoFile.deleteOnExit();

        List<BufferedImage> images = getImages(durationMillis, delay);

        AWTSequenceEncoder encoder = null;
        try {
            encoder = AWTSequenceEncoder.createSequenceEncoder(videoFile, 24);
            for (BufferedImage image : images) {
                encoder.encodeImage(image);
            }
        } catch (Exception e) {
            System.out.println("Fail to generate video!");

        }
        encoder.finish();

        return videoFile;
    }
}
