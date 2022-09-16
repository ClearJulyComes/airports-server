package com.example.airportsapi.service;

import com.example.airportsapi.dao.AirportRepository;
import com.example.airportsapi.dto.RequestAirportDto;
import com.example.airportsapi.model.AirportResource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AirportServiceImpl implements AirportService {
    private AirportRepository airportRepository;

    @Override
    public AirportResource getAirport(RequestAirportDto request) {
        return null;
    }
}
