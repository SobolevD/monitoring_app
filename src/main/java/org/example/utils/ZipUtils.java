package org.example.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Slf4j
public abstract class ZipUtils {
    public static File createZip(List<File> filesToZip, String zipName) {

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipName))) {
            for (File fileToZip : filesToZip) {
                try (FileInputStream fis = new FileInputStream(fileToZip)) {

                    ZipEntry entry=new ZipEntry(fileToZip.getName());
                    zout.putNextEntry(entry);

                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);

                    zout.write(buffer);

                    zout.closeEntry();
                }
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }

        File zip = new File(zipName);
        zip.deleteOnExit();
        return zip;
    }
}
