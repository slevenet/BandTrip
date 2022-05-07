package com.trip.band.model;

import lombok.Data;

@Data
public class Point {

    private double lat;
    private double lng;
    private String description;
    private String label;
    private String type;
    private int order;
}
