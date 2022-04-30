package com.trip.band.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.Bounds;
import com.google.maps.model.DirectionsResult;
import com.trip.band.repository.TripEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/trips/events")
public class EventTripController {

    private final TripEventRepository tripEventRepository;
    private final GeoApiContext context;

    @GetMapping
    public Bounds createNewEvent() throws IOException, InterruptedException, ApiException {
        DirectionsResult result =
                DirectionsApi.getDirections(context, "Sydney, AU", "Melbourne, AU").await();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return result.routes[0].bounds;
    }
}
