package com.example.test;

import com.example.test.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {TestApplication.class, JpaConfig.class}, args);
    }

}

