package com.trip.band.controller;

import com.trip.band.model.HikingTripEvent;
import com.trip.band.model.TripEvent;
import com.trip.band.service.TripEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("api/trips/events")
public class EventTripController {

    private final TripEventService service;

    @GetMapping
    //api/trips/events/test2
    public List<TripEvent> createNewEvent() {
        return service.findAllTripEvents();
    }


    @PostMapping
    public void createEvent(@RequestBody HikingTripEvent trip) {
        service.createEvent(trip);
    }
}
