package com.trip.band.repository;

import com.trip.band.model.TripEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripEventRepository extends MongoRepository<TripEvent, String> {
}
