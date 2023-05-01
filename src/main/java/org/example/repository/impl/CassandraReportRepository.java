package org.example.repository.impl;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.example.model.common.Report;
import org.example.repository.ReportRepository;
import org.example.utils.PropertiesLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static org.example.common.PropertiesNames.*;

public class CassandraReportRepository implements ReportRepository {

    private final String url;
    private final String username;
    private final String password;
    private final String hostname;

    public CassandraReportRepository() {
        Properties properties = PropertiesLoader.getProperties();

        this.url = properties.getProperty(DATABASE_URL_PROP);
        this.username = properties.getProperty(DATABASE_USERNAME_PROP);
        this.password = properties.getProperty(DATABASE_PASSWORD_PROP);
        this.hostname = properties.getProperty(DATABASE_HOSTNAME_PROP);
    }

    private void prepareDatabase() {
        try (Cluster cluster = Cluster.builder().addContactPoint(this.hostname).build()) {
            try (Session session = cluster.connect()) {
                session.execute("CREATE TABLE IF NOT EXISTS \"user_reports\"( \n" +
                        "    user_name text,\n" +
                        "    report_size int,\n" +
                        "    report_date timestamp,\n" +
                        "    report blob,\n" +
                        "    PRIMARY KEY (user_name, report_size, report_date)\n" +
                        ");");
            }
        }
    }

    @Override
    public void saveReport(Report report) {

        try (Cluster cluster = Cluster.builder().addContactPoint(this.hostname).build()) {
            try (Session session = cluster.connect()) {
                byte[] reportBytes = Files.readAllBytes(report.getReport().toPath());

                String query =
                        "INSERT INTO user_reports (user_name, report_size, report_date, report) VALUES (?, dateof(now()), ?, ?);";
                com.datastax.driver.core.PreparedStatement statement = session.prepare(query);

                String filename = report.getReport().getName();

                BoundStatement boundStatement = new BoundStatement(statement).bind(report.getUsername(),
                        filename, reportBytes);
                session.execute(boundStatement);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
