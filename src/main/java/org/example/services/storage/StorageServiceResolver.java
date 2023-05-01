package org.example.services.storage;

import lombok.extern.slf4j.Slf4j;
import org.example.services.storage.impl.AmazonS3Storage;
import org.example.services.storage.impl.AzureBlobStorage;
import org.example.utils.PropertiesLoader;

import java.util.Properties;

import static org.example.common.PropertiesNames.STORAGE_PROVIDER_PROP;
import static org.example.common.StorageProviders.*;

@Slf4j
public class StorageServiceResolver {

    private Properties properties;

    public StorageServiceResolver() {
        this.properties = PropertiesLoader.getProperties();
    }

    public StorageService resolve() {

        String storageProvider = properties.getProperty(STORAGE_PROVIDER_PROP);

        switch (storageProvider) {
            case YANDEX_OBJECTS, AMAZON_S3 -> {
                return new AmazonS3Storage();
            }
            case AZURE_BLOB -> {
                return new AzureBlobStorage();
            }
            default -> {
                throw new RuntimeException("Unable to resolve storage: " + storageProvider);
            }
        }
    }

}
