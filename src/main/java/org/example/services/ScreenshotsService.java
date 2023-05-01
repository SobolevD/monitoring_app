package org.example.services;

import org.example.utils.Images2VideoConverter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScreenshotsService {

    public File createVideo(long durationMillis, int delay)
            throws AWTException, IOException, InterruptedException {
        List<BufferedImage> images = getImages(durationMillis, delay);
        return Images2VideoConverter.createVideo(images);
    }

    private List<BufferedImage> getImages(long durationMillis, int delay) throws InterruptedException, AWTException {

        Robot robot = new Robot();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Rectangle rectangle = new Rectangle(toolkit.getScreenSize());

        Date currentDate = new Date();
        long currentTimeInMillis = currentDate.getTime();

        Date endTime = new Date(currentTimeInMillis + durationMillis);

        List<BufferedImage> result = new ArrayList<>();
        while (new Date().before(endTime)) {
            BufferedImage image = robot.createScreenCapture(rectangle);
            result.add(image);
            Thread.sleep(delay);
        }

        return result;
    }

}
