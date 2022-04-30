package com.trip.band.model;

import com.trip.band.model.enums.EventStatus;
import com.trip.band.model.enums.TripEventType;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public abstract class TripEvent {

    @Id
    private ObjectId id;
    private TripEventType eventType;
    private String name;
    private String description;
    private EventStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer maxParticipants;
    private Integer minParticipants;
}
