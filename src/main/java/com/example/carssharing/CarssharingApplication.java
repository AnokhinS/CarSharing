package com.example.carssharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.carssharing.repositories")
@ComponentScan(basePackages = { "com.example.carssharing.controllers", "com.example.carssharing.services",
        "com.example.carssharing.security"})
@SpringBootApplication
public class CarssharingApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CarssharingApplication.class, args);

    }
}
