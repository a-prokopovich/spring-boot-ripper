package com.prokopovich.starter.listener;

import com.prokopovich.starter.property.RavenProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    private final RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        ravenProperties.getDestination().forEach(s -> {

            System.out.println("\n--- Ворон полетел в " + s + " ---\n");
        });
    }
}
