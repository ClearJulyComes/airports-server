package com.example.airportsapi.model;

import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@Document(collection = "airports")
public class Airport {
    @Id
    int id;
    String data;
}
