package com.example.airportsapi.service;

import com.example.airportsapi.dao.AirportRepository;
import com.example.airportsapi.dto.RequestAirportDto;
import com.example.airportsapi.model.AirportResource;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class AirportServiceImpl implements AirportService {
    private final AirportRepository airportRepository;

    {log.info("Start");}

    @Override
    public AirportResource getAirport(RequestAirportDto request) {
        var airport = airportRepository.findAirportById(request.getId());
        return new AirportResource(airport, request.getRequestId(), request.getRequestTimeStamp(), UUID.randomUUID().toString());
    }
}
