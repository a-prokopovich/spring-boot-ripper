package com.prokopovich.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileDetectorEPP implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        environment.setActiveProfiles("ProfileConstants.ЗИМА_ТУТА");

        if (environment.getActiveProfiles().length == 0 && getTemperature() < -272) {
            environment.setActiveProfiles("ProfileConstants.ЗИМА_ТУТА");
        } else {
            environment.setActiveProfiles("ProfileConstants.ЗИМА_БЛИЗКО");
        }
    }

    private int getTemperature() {
        return -300;
    }
}
