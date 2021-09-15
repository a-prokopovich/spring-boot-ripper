package com.prokopovich.starter.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnRavenConditional extends AllNestedConditions {

    public OnRavenConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty("raven.destination")
    public static class R { }

    @ConditionalOnProperty(value = "raven.on", havingValue = "true")
    public static class C { }
}
