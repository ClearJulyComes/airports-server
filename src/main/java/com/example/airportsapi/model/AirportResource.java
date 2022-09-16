package com.example.airportsapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirportResource {
    Airport airport;
    String requestId;
    long requestTimeStamp;
    String responseId;
    long responseTimeStamp;
}
