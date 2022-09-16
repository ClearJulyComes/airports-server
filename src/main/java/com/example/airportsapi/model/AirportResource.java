package com.example.airportsapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AirportResource {
    final Airport airport;
    final String requestId;
    final long requestTimeStamp;
    final String responseId;
    long responseTimeStamp;
}
