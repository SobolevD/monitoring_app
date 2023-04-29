package org.example.model;

import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ObjectMetadata {
    private Class<? extends Object[]> objectArrayClass;
    private Class<?> objectClass;
    private String[] columns;
    private String command;
    private String group;
    private String simpleName;
}
