package org.example.model.common;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;

import static org.example.common.Constants.CURRENT_USERNAME;

@NoArgsConstructor
@Getter
public class Report {
    private List<?> objects;
    private String username;
    private File report;

    public Report(List<?> objects, File report) {
        this.objects = objects;
        this.report = report;
        this.username = CURRENT_USERNAME;
    }
}
