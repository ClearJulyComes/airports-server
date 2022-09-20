package com.example.airportsapi.dao;

import com.example.airportsapi.model.Airport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AirportRepository extends MongoRepository<Airport, String> {
    @Query("{'_id': ?0}")
    Airport findAirportById(int id);
}
