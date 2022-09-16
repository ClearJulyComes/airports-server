package com.example.airportsapi.service;

import com.example.airportsapi.dto.RequestAirportDto;
import com.example.airportsapi.model.AirportResource;

public interface AirportService {
    AirportResource getAirport(RequestAirportDto request);
}
