package org.example.services;

import com.github.sarxos.webcam.Webcam;
import org.example.utils.Images2VideoConverter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        List<BufferedImage> images = getImages(durationMillis, delay);
        return Images2VideoConverter.createVideo(images);
    }
}
