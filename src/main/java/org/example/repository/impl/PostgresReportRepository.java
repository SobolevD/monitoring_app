package org.example.repository.impl;

import org.example.model.common.Report;
import org.example.repository.ReportRepository;
import org.example.utils.PropertiesLoader;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static org.example.common.PropertiesNames.*;

public class PostgresReportRepository implements ReportRepository {

    private final String url;
    private final String username;
    private final String password;

    public PostgresReportRepository() {
        Properties properties = PropertiesLoader.getProperties();

        this.url = properties.getProperty(DATABASE_URL_PROP);
        this.username = properties.getProperty(DATABASE_USERNAME_PROP);
        this.password = properties.getProperty(DATABASE_PASSWORD_PROP);

        prepareDatabase();
    }

    private void prepareDatabase() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS user_reports (" +
                    "    user_name     text," +
                    "    report_size   integer," +
                    "    report_date   time with time zone," +
                    "    report        bytea);");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveReport(File zipReport, String username) {
        try (Connection connection = DriverManager.getConnection(url, this.username, password)) {
            connection.setAutoCommit(false);

            PreparedStatement statement =
                    connection.prepareStatement("insert into user_reports values (?, ?, CURRENT_TIME, ?)");
            statement.setString(1, username);
            statement.setLong(2, zipReport.length());

            byte[] reportBytes = Files.readAllBytes(zipReport.toPath());
            statement.setBinaryStream(3, new ByteArrayInputStream(reportBytes));
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
