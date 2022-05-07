package com.trip.band.service;

import com.trip.band.model.HikingTripEvent;
import com.trip.band.model.TripEvent;
import com.trip.band.repository.TripEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TripEventService {

    private final TripEventRepository tripEventRepository;

    public List<TripEvent> findAllTripEvents() {
        return tripEventRepository.findAll();
    }

    public TripEvent createEvent(HikingTripEvent event) {
        return tripEventRepository.save(event);
    }

}
