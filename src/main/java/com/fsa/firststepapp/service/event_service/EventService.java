package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.EventMapper;
import com.fsa.firststepapp.models.request.AddParticipantToEventRequest;
import com.fsa.firststepapp.models.request.EventRequest;
import com.fsa.firststepapp.repository.EventRepository;
import com.fsa.firststepapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService implements IEventService {
    private final EventRepository eventRepository;
    private final LocationRepository locationRepository;
    private final EventMapper eventMapper;

    @Autowired
    public EventService(EventRepository eventRepository, EventMapper eventMapper,LocationRepository locationRepository) {
        this.eventRepository = eventRepository;
        this.locationRepository = locationRepository;
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
        eventToAdd.setLocation(locationRepository.findLocationByName(event.getLocationName()));
        eventToAdd.setEventDate(event.getEventDate());
        eventToAdd.setParticipants(event.getParticipants());
        eventToAdd.setDescription(event.getDescription());
        return eventMapper.convertModelToDto(eventRepository.save(eventToAdd));
    }
    @Override
    public EventDto updateEvent(EventRequest event, String eventId) {
        Event eventToUpdate = eventRepository.findByEventId(Long.valueOf(Long.parseLong(eventId))).orElseThrow();

        eventToUpdate.setName(event.getName());
        eventToUpdate.setLocation(locationRepository.findLocationByName(event.getLocationName()));
        eventToUpdate.setEventDate(event.getEventDate());
        eventToUpdate.setParticipants(eventToUpdate.getParticipants());
        eventToUpdate.setDescription(event.getDescription());

        return eventMapper.convertModelToDto(eventRepository.save(eventToUpdate));
    }
    @Override
    public void deleteEvent(String eventId) {
        Event event = eventRepository.findByEventId(Long.parseLong(eventId)).orElseThrow();

        eventRepository.delete(event);
    }



}
