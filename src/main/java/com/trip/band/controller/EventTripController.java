package com.trip.band.controller;

import com.trip.band.model.TripEvent;
import com.trip.band.repository.TripEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/trips/events")
public class EventTripController {

    private final TripEventRepository tripEventRepository;

    @GetMapping
    public List<TripEvent> createNewEvent() {
        return tripEventRepository.findAll();
    }
}
