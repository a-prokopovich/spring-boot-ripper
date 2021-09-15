package com.prokopovich.ironbank;

import com.prokopovich.starter.RavenListener;
import com.prokopovich.starter.RavenProperties;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyRavenListener extends RavenListener {

    public MyRavenListener(RavenProperties ravenProperties) {
        super(ravenProperties);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("\nevent = " + event + "\n");
    }
}
