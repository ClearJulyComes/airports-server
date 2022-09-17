package com.example.airportsapi.controller;

import com.example.airportsapi.model.Airport;
import com.example.airportsapi.model.AirportResource;
import com.example.airportsapi.service.AirportService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = AirportController.class)
class AirportControllerTest {
    private static final String AIRPORT = "/airport";
    private static final AirportResource AIRPORT_RESOURCE = new AirportResource(new Airport(1, "data"), "requestId", 1L, "id");

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AirportService airportService;

    @Test
    void getAirportThenSuccess() throws Exception {
        when(airportService.getAirport(any())).thenReturn(AIRPORT_RESOURCE);
        mockMvc.perform(get(AIRPORT)
                .param("id", "1")
                .param("threadName", "thread")
                .param("requestId", "requestId")
                .param("requestTimeStamp", "1"))
                .andExpect(status().isOk());
    }

    @Test
    void getAirportWithNotValidThenBadRequest() throws Exception {
        when(airportService.getAirport(any())).thenReturn(AIRPORT_RESOURCE);
        mockMvc.perform(get(AIRPORT)
                .param("id", "1")
                .param("threadName", "thread")
                .param("requestId", "requestId"))
                .andExpect(status().isBadRequest());
    }
}