package com.example.pi_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableWebMvc
public class PiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiProjectApplication.class, args);
    }
}
