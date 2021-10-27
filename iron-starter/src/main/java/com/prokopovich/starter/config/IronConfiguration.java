package com.prokopovich.starter.config;

import com.prokopovich.starter.annotation.ConditionOnProduction;
import com.prokopovich.starter.annotation.ConditionalOnRaven;
import com.prokopovich.starter.listener.RavenListener;
import com.prokopovich.starter.property.RavenProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

    @Bean
    @ConditionOnProduction
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    public RavenListener ravenListener(RavenProperties r) {
        return new RavenListener(r);
    }
}
