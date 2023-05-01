package org.example.services.storage.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.example.model.common.Report;
import org.example.services.storage.StorageService;
import org.example.utils.PropertiesLoader;

import java.io.File;
import java.util.Properties;

import static org.example.common.PropertiesNames.*;

public class AzureBlobStorage implements StorageService {

    private String storageUrl;

    private String storageUsername;

    private String storagePassword;

    private String storageBucket;

    private String storageRegion;

    private BlobServiceClient client;
    private BlobContainerClient container;

    private Properties properties;

    public AzureBlobStorage() {
        this.properties = PropertiesLoader.getProperties();

        this.storageUsername = properties.getProperty(STORAGE_USERNAME_PROP);
        this.storagePassword = properties.getProperty(STORAGE_PASSWORD_PROP);
        this.storageUrl = properties.getProperty(STORAGE_SERVER_URL_PROP);
        this.storageBucket = properties.getProperty(STORAGE_BUCKET_PROP);
        this.storageRegion = properties.getProperty(STORAGE_REGION_PROP);

        this.client = buildClient();
        this.container = buildContainer(this.client, this.storageBucket);
    }

    @Override
    public void storeReport(Report report) {
        File reportFile = report.getReport();
        String fileName = reportFile.getName();
        BlobClient blobClient = this.container.getBlobClient(fileName);
        blobClient.uploadFromFile(fileName);
    }

    private BlobServiceClient buildClient() {

        String connectStr = String.format("DefaultEndpointsProtocol=https;" +
                        "AccountName=%s;" +
                        "AccountKey=%s",
                this.storageUsername, this. storagePassword);

        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .endpoint(this.storageUrl)
                .connectionString(connectStr)
                .buildClient();
        return blobServiceClient;
    }

    private BlobContainerClient buildContainer(BlobServiceClient blobServiceClient, String containerName) {
        return blobServiceClient.createBlobContainer(containerName);
    }
}
