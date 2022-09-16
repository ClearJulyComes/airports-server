package com.example.airportsapi.dao;

import com.example.airportsapi.model.Airport;

public interface AirportRepository {
    Airport findAirport(int id);
}
