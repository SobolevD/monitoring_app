package org.example.repository.impl;

import org.example.model.common.Report;
import org.example.repository.ReportRepository;
import org.example.utils.PropertiesLoader;

import java.io.FileInputStream;
import java.io.IOException;
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
    }

    private void prepareDatabase() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS user_reports (" +
                    "    user_name     text," +
                    "    report_size   integer," +
                    "    report_date   date," +
                    "    report        blob);");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveReport(Report report) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            try (FileInputStream fileInputStream = new FileInputStream(report.getReport())) {
                PreparedStatement statement =
                        connection.prepareStatement("insert into user_reports values ?, CURRENT_TIME, ?, ?::blob;");
                statement.setString(1, report.getUsername());
                statement.setLong(2, report.getReport().length());
                statement.setBlob(3, fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
