package com.example.airportsapi.service;

import com.example.airportsapi.dao.AirportRepository;
import com.example.airportsapi.dto.RequestAirportDto;
import com.example.airportsapi.model.AirportResource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class AirportServiceImpl implements AirportService {
    private final AirportRepository airportRepository;

    @Override
    public AirportResource getAirport(RequestAirportDto request) {
        var airport = airportRepository.findAirport(request.getId());
        return new AirportResource(airport, request.getRequestId(), request.getRequestTimeStamp(), UUID.randomUUID().toString());
    }
}
