package com.prokopovich.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileCheckApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new RuntimeException("Без профиля низя!");
        }
    }
}
