package org.example.model.entity.powershell;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class WMIObjectInfo {
    private JsonNode content;

    public String[] getFields() {

        Iterator<String> fieldIterator = content.fieldNames();

        List<String> fieldNames = new ArrayList<>();
        while (fieldIterator.hasNext()) {
            fieldNames.add(fieldIterator.next());
        }

        return fieldNames.toArray(new String[0]);
    }
}
