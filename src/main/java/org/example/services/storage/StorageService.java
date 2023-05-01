package org.example.services.storage;

import org.example.model.common.Report;

import java.io.File;

public interface StorageService {

    void storeReport(File zipReport);
}
