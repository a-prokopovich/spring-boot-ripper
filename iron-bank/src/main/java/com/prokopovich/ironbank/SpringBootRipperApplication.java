package com.prokopovich.ironbank;

import com.prokopovich.ironbank.service.ProphetService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProphetService.class)
public class SpringBootRipperApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringBootRipperApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootRipperApplication.class);
        builder.headless(false).run(args);
    }
}
