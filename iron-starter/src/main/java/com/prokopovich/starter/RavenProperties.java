package com.prokopovich.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("raven")
public class RavenProperties {

    private List<String> destination;
    private boolean switchedOn;
}
