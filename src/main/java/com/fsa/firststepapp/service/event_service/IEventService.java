package com.fsa.firststepapp.service.event_service;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.dto.FacultyDto;
import com.fsa.firststepapp.models.request.AddParticipantRequest;
import com.fsa.firststepapp.models.request.AddParticipantToEventRequest;
import com.fsa.firststepapp.models.request.EventRequest;
import com.fsa.firststepapp.models.request.FacultyRequest;

import java.util.List;

public interface IEventService {
    List<EventDto> getAllEvents();
    EventDto addParticipantToEvent(AddParticipantToEventRequest addParticipantToEventRequest);
    EventDto addEvent(EventRequest event);
    EventDto updateEvent(EventRequest event, String eventId);
    void deleteEvent(String eventId);
}
