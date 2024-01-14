package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.dto.UniversityDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.EventMapper;
import com.fsa.firststepapp.models.request.AddParticipantToEventRequest;
import com.fsa.firststepapp.models.request.AddUniversityRequest;
import com.fsa.firststepapp.models.request.EventRequest;
import com.fsa.firststepapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Autowired
    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public List<EventDto> getAllEvents() {
        List<Event> events = (List<Event>) eventRepository.findAll();

        if (events.isEmpty()) {
            throw new EntityNotFoundException("Events not found!");
        }

        return eventMapper.convertModelListToDtoList(events);
    }

    @Override
    public EventDto addParticipantToEvent(AddParticipantToEventRequest addParticipantToEventRequest) {
        Event event = eventRepository.findByEventId(addParticipantToEventRequest.getEventId()).orElseThrow();
        event.setParticipants(addParticipantToEventRequest.getParticipants());
        Event eventUpdated = eventRepository.save(event);
        return eventMapper.convertModelToDto(eventUpdated);
    }
    @Override
    public EventDto addEvent(EventRequest event) {
        Event eventToAdd = new Event();

        eventToAdd.setName(event.getName());
        eventToAdd.setEventDate(event.getEventDate());
        eventToAdd.setParticipants(event.getParticipants());
        eventToAdd.setDescription(event.getDescription());
        eventToAdd.setParticipants(event.getParticipants());
        return eventMapper.convertModelToDto(eventRepository.save(eventToAdd));
    }
    @Override
    public EventDto updateEvent(EventRequest event, String eventId) {
        Event eventToUpdate = eventRepository.findByEventId(event.getEventId()).orElseThrow();

        if(eventToUpdate == null) {
            throw new EntityNotFoundException("University not found!! ");
        }

        eventToUpdate.setName(event.getName());
        eventToUpdate.setEventDate(event.getEventDate());
        eventToUpdate.setParticipants(eventToUpdate.getParticipants());
        eventToUpdate.setDescription(event.getDescription());
        eventToUpdate.setParticipants(event.getParticipants());

        return eventMapper.convertModelToDto(eventRepository.save(eventToUpdate));
    }
    @Override
    public void deleteEvent(String eventId) {
        Event event = eventRepository.findByEventId(Long.valueOf(String.valueOf(eventId))).orElseThrow();

        if(event == null) {
            throw new EntityNotFoundException("Location not found!!");
        }

        eventRepository.delete(event);
    }



}
