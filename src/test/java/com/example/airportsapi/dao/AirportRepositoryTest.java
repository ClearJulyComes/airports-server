package com.example.airportsapi.dao;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@DataMongoTest
@ExtendWith(SpringExtension.class)
class AirportRepositoryTest {
    @Autowired
    private AirportRepository airportRepository;

    @Test
    void testRepo() {
        var actual = airportRepository.findAirportById(4);
        System.out.println(actual);
        assertNotNull(actual);
    }
}