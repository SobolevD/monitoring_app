package org.example.repository;

import org.example.repository.impl.CassandraReportRepository;
import org.example.repository.impl.PostgresReportRepository;
import org.example.utils.PropertiesLoader;

import java.util.Properties;

import static org.example.common.DatabaseTypes.CASSANDRA;
import static org.example.common.DatabaseTypes.POSTGRES;
import static org.example.common.PropertiesNames.DATABASE_TYPE_PROP;

public class ReportRepositoryResolver {

    private Properties properties;

    public ReportRepositoryResolver() {
        this.properties = PropertiesLoader.getProperties();
    }

    public ReportRepository resolve() {

        String databaseType = properties.getProperty(DATABASE_TYPE_PROP);

        switch (databaseType) {
            case POSTGRES -> {
                return new PostgresReportRepository();
            }
            case CASSANDRA -> {
                return new CassandraReportRepository();
            }
            default -> throw new RuntimeException("Unable to resolve database type: " + databaseType);
        }
    }
}
