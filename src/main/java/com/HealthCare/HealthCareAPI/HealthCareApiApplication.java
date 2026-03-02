package com.HealthCare.HealthCareAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Application class to start the Healthcare API.
 * This class initializes the Spring Boot framework and scans for all controllers.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.HealthCare.HealthCareAPI")
public class HealthCareApiApplication {

    public static void main(String[] args) {
        // This line launches the embedded Tomcat server on port 8080
        SpringApplication.run(HealthCareApiApplication.class, args);
        System.out.println("----------------------------------------------");
        System.out.println("Healthcare API System is Up and Running!");
        System.out.println("Test Home: http://localhost:8080/home/status");
        System.out.println("----------------------------------------------");
    }

}