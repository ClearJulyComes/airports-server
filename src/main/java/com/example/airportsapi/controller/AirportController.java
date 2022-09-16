package com.example.airportsapi.controller;

import com.example.airportsapi.dto.RequestAirportDto;
import com.example.airportsapi.model.AirportResource;
import com.example.airportsapi.service.AirportService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AirportController {
    private static final String AIRPORT = "/airport";

    private final AirportService airportService;

    @GetMapping(AIRPORT)
    public ResponseEntity<AirportResource> getAirport(@RequestBody RequestAirportDto request) {
        return ResponseEntity.ok().body(airportService.getAirport(request));
    }
}
