package com.trip.band;

import com.google.maps.GeoApiContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeoApiContextConfig {

    @Bean
    public GeoApiContext geoApiContext() {
        return new GeoApiContext.Builder()
                .apiKey("AIzaSyAVm1wdQ_L0gtt8L5H6Or1l_MvRz9NhGxU")
                .build();
    }
}
