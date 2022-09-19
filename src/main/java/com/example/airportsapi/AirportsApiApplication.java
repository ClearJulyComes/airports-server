package com.example.airportsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class AirportsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirportsApiApplication.class, args);
    }

}
