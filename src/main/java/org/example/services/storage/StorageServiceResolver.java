package org.example.services.storage;

import com.netcracker.cloud.dst.exceptions.DataSlicingRuntimeException;
import com.netcracker.cloud.dst.service.qualifiers.AmazonS3Storage;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.example.services.storage.impl.AmazonS3Storage;
import org.example.utils.PropertiesLoader;

import javax.inject.Inject;

import java.util.Properties;

import static com.netcracker.cloud.dst.constants.ApplicationProperties.STORAGE_PROVIDER_PROP;
import static com.netcracker.cloud.dst.constants.Common.*;
import static org.example.common.PropertiesNames.STORAGE_PROVIDER_PROP;
import static org.example.common.StorageProviders.AMAZON_S3;

@Slf4j
public class StorageServiceResolver {

    private Properties properties;

    public StorageServiceResolver() {
        this.properties = PropertiesLoader.getProperties();
    }

    public StorageService resolve() {

        String storageProvider = properties.getProperty(STORAGE_PROVIDER_PROP);

        switch (storageProvider) {
            case AMAZON_S3: {
                return new AmazonS3Storage();
            }
            default: {
                throw new RuntimeException("Unable to resolve storage!");
            }
        }
    }

}
