package org.example.model;

import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GroupMetadata {
    private String name;
    private String delayPropertyName;
    private String periodPropertyName;
}
