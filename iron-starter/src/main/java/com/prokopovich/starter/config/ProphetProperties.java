package com.prokopovich.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties("ironbank")
public class ProphetProperties {

    private List<String> теКтоВозвращаютДолги;
}
