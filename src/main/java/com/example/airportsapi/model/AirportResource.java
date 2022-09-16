package com.example.airportsapi.model;

import lombok.Data;

@Data
public class AirportResource {
    int id;
    String data;
    long requestId;
    long requestTimeStamp;
    long responseId;
    long responseTimeStamp;
}
