package com.prokopovich.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties("raven")
public class RavenProperties {

    List<String> destination;
    boolean switchedOn;
}
