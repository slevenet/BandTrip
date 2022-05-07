package com.trip.band.model;

import lombok.Data;

import java.util.LinkedList;

@Data
public class HikingTripEvent extends TripEvent {

    private int tripDuration;
    private LinkedList<Point> routes;
}
