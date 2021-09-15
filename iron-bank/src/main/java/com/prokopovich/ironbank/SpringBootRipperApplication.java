package com.prokopovich.ironbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootRipperApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringBootRipperApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootRipperApplication.class);
        builder.headless(false).run(args);
    }
}
