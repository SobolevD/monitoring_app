package org.example.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Report {
    private List<?> objects;
    private File excelReport;
}
