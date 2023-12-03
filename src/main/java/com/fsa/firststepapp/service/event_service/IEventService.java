package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.EventDto;

import java.util.Date;
import java.util.List;

public interface IEventService {
    List<EventDto> getAllEvents();
    public Event updateEvent(Long eventId, Long newParticipants);
}