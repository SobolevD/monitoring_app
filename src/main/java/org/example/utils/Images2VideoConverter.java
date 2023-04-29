package org.example.utils;

import org.jcodec.api.awt.AWTSequenceEncoder;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.example.utils.DateTimeHelper.getCurrentTimeForFileName;

public abstract class Images2VideoConverter {

    public static File createVideo(List<BufferedImage> images)
            throws IOException {

        File videoFile = new File("video_" + getCurrentTimeForFileName() + ".mp4");
        videoFile.deleteOnExit();

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
