package com.prokopovich.starter;

import com.prokopovich.starter.annotation.ConditionOnProduction;
import com.prokopovich.starter.annotation.ConditionalOnRaven;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
