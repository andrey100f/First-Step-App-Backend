package com.fsa.firststepapp.service.event_service;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.request.AddEventRequest;
import com.fsa.firststepapp.models.request.AddParticipantToEventRequest;

import java.util.List;

public interface IEventService {
    List<EventDto> getAllEvents();
    EventDto addParticipantToEvent(AddParticipantToEventRequest addParticipantToEventRequest);
    EventDto addEvent(AddEventRequest event);
    EventDto updateEvent(String eventId, AddEventRequest event);
    void deleteEvent(String eventId);
}
