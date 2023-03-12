package org.example.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailCredentials {
    private String email;
    private String password;
}
