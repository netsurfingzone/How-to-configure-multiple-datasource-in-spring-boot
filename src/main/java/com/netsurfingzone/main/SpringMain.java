package com.netsurfingzone.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.netsurfingzone")
@SpringBootApplication
@EntityScan("com.netsurfingzone.entity")
public class SpringMain extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringMain.class, args);
    }

    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringMain.class);
    }
}
