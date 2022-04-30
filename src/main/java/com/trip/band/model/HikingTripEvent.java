package com.trip.band.model;

import lombok.Data;

import java.util.List;

@Data
public class HikingTripEvent extends TripEvent {

    private int tripDuration;
    private List<Route> routes;
}
