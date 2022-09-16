package com.example.airportsapi.dto;

import lombok.Value;
import org.springframework.lang.NonNull;

@Value
public class RequestAirportDto {
    @NonNull
    int id;
    @NonNull
    String threadName;
    @NonNull
    String requestId;
    @NonNull
    long requestTimeStamp;
}
