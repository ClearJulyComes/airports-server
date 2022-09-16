package com.example.airportsapi.dto;

import lombok.Value;

@Value
public class RequestAirportDto {
    int id;
    String threadName;
    long requestId;
    long requestTimeStamp;
}
