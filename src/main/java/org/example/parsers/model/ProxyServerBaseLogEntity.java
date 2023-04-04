package org.example.parsers.model;

import lombok.*;

import java.net.URL;
import java.util.Date;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public abstract class ProxyServerBaseLogEntity {

    protected Date date;

    protected int duration;

    protected URL endpoint;

    protected String clientIpAddress;

    protected StatusCode statusCode;

    protected Long responseBodySize;

    protected String httpMethod;

    protected String hierarchyIdentifier;

    protected String contentType;

    @Data
    @ToString
    @EqualsAndHashCode
    @Builder
    public static class StatusCode {

        protected String tag;

        protected Integer code;
    }
}
