package org.example.services.storage.impl;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.example.model.common.Report;
import org.example.services.storage.StorageService;
import org.example.utils.PropertiesLoader;

import java.util.Properties;

import static org.example.common.PropertiesNames.*;

public class AmazonS3Storage implements StorageService {

    private String storageUrl;

    private String storageUsername;

    private String storagePassword;

    private String storageBucket;

    private String storageRegion;

    private AmazonS3 client;

    private Properties properties;

    public AmazonS3Storage() {
        this.properties = PropertiesLoader.getProperties();

        this.storageUsername = properties.getProperty(STORAGE_USERNAME_PROP);
        this.storagePassword = properties.getProperty(STORAGE_PASSWORD_PROP);
        this.storageUrl = properties.getProperty(STORAGE_SERVER_URL_PROP);
        this.storageBucket = properties.getProperty(STORAGE_BUCKET_PROP);
        this.storageRegion = properties.getProperty(STORAGE_REGION_PROP);

        this.client = buildClient();
    }

    @Override
    public void storeReport(Report report) {
        String fileName = report.getReport().getName();
        client.putObject(this.storageBucket, fileName, report.getReport());
    }

    private AmazonS3 buildClient() {
        AWSCredentials credentials = new BasicAWSCredentials(
                this.storageUsername,
                this.storagePassword
        );

        AwsClientBuilder.EndpointConfiguration endpointConfiguration =
                new AwsClientBuilder.EndpointConfiguration(
                        this.storageUrl,
                        this.storageRegion);

        return AmazonS3ClientBuilder
                .standard()
                .withPathStyleAccessEnabled(true)
                .withEndpointConfiguration(endpointConfiguration)
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .build();
    }
}
