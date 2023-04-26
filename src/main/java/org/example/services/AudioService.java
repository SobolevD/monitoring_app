package org.example.services;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class AudioService {

    private static final AudioFileFormat.Type FILE_TYPE = AudioFileFormat.Type.WAVE;
    private static final int MONO = 1;
    // определение формата аудио данных
    private static final AudioFormat FORMAT = new AudioFormat(
            AudioFormat.Encoding.PCM_SIGNED, 44100, 16, MONO, 2, 44100, true);

    private TargetDataLine mike;

    public File record(long recordLengthMillis) throws InterruptedException, IOException {

        File audioFile = File.createTempFile("record_" + "_", "." + FILE_TYPE.getExtension());

        startRecording(audioFile);
        Thread.sleep(recordLengthMillis);
        stopRecording();

        return audioFile;
    }

    private void startRecording(File file) {
        new Thread(() -> {

            DataLine.Info info = new DataLine.Info(TargetDataLine.class, FORMAT);

            if (!AudioSystem.isLineSupported(info)) {
                JOptionPane.showMessageDialog(null, "Line not supported" +
                                info, "Line not supported",
                        JOptionPane.ERROR_MESSAGE);
            }
            try {
                mike = (TargetDataLine) AudioSystem.getLine(info);
                mike.open(FORMAT, mike.getBufferSize());

                AudioInputStream sound = new AudioInputStream(mike);
                mike.start();

                AudioSystem.write(sound, FILE_TYPE, file);
            } catch (LineUnavailableException ex) {
                JOptionPane.showMessageDialog(null, "Line not available" +
                                ex, "Line not available",
                        JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "I/O Error " + ex,
                        "I/O Error", JOptionPane.ERROR_MESSAGE);
            }
        }).start();
    }

    private void stopRecording() {
        mike.stop();
        mike.close();
    }
}
