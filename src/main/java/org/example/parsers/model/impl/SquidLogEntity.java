package org.example.parsers.model.impl;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.example.parsers.model.ProxyServerBaseLogEntity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@ToString
public class SquidLogEntity extends ProxyServerBaseLogEntity {

    public SquidLogEntity(Date date,
                          int duration,
                          URL endpoint,
                          String clientIp,
                          StatusCode statusCode,
                          long responseBodySize,
                          String httpMethod,
                          String hierarchyIdentifier,
                          String contentType) {
        super(date, duration, endpoint, clientIp, statusCode, responseBodySize,
                httpMethod, hierarchyIdentifier, contentType);
    }

    public static ProxyServerBaseLogEntity fromString(String logRecord) {
        String[] stringTokens = logRecord.split(" ");

        try {
            Date date = new Date((long) Double.parseDouble(stringTokens[0]) * 1000L);
            int duration = Integer.parseInt(stringTokens[1]);
            String clientIp = stringTokens[2];

            String[] responseTagAndCode = stringTokens[3].split("/");

            String responseTag = responseTagAndCode[0];
            int responseCode = Integer.parseInt(responseTagAndCode[1]);

            long contentSize = Long.parseLong(stringTokens[4]);
            String httpMethod = stringTokens[5];

            URL url = new URL(stringTokens[6]);

            String hierarchyIdentifier = stringTokens[8];
            String contentType = stringTokens[9];

            return new SquidLogEntity(date,
                    duration,
                    url,
                    clientIp,
                    StatusCode.builder()
                            .tag(responseTag)
                            .code(responseCode)
                            .build(),
                    contentSize,
                    httpMethod,
                    hierarchyIdentifier,
                    contentType);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        SquidLogEntity.fromString("1556757568.937 1132 192.168.0.25 TAG_NONE/200 2885333 GET http://www.google.com/robots.txt - HIER_NONE/- text/plain");
//    }

}
