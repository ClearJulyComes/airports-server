package com.example.airportsapi.controller;

import com.example.airportsapi.dto.RequestAirportDto;
import com.example.airportsapi.model.AirportResource;
import com.example.airportsapi.service.AirportService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Slf4j
@RestController
@AllArgsConstructor
public class AirportController {
    private static final String AIRPORT = "/airport";

    private final AirportService airportService;

    @GetMapping(AIRPORT)
    public ResponseEntity<AirportResource> getAirport(@Validated RequestAirportDto request) {
        log.info(request.toString());
        var airport = airportService.getAirport(request);
        airport.setResponseTimeStamp(Instant.now().toEpochMilli());
        return ResponseEntity.ok().body(airport);
    }
}
