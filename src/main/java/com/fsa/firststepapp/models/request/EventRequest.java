package com.fsa.firststepapp.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventRequest {
    private Long eventId;
    private String name;
    private String description;
    private Long participants;
    private String locationName;
    private Date eventDate;
}
