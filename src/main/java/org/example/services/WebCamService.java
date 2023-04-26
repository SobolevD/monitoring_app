package org.example.services;

import com.github.sarxos.webcam.Webcam;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class WebCamService {

    public List<BufferedImage> getImages(int framesCount, int delay) throws InterruptedException {

        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        webcam.open();

        List<BufferedImage> result = new ArrayList<>();
        for (int currentFrameNum = 0; currentFrameNum < framesCount; ++currentFrameNum) {
            BufferedImage frame = webcam.getImage();
            result.add(frame);
            Thread.sleep(delay);
        }

        return result;
    }
}
