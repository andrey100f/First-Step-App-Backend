package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.EventMapper;
import com.fsa.firststepapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
            throw new EntityNotFoundException("Events Not Found!!");
        }

        return eventMapper.convertModelListToDtoList(events);
    }
  
    public Event updateEvent(Long eventId, Long newParticipants) {
        Optional<Event> optionalEvent = eventRepository.findById(eventId);

        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            event.setParticipants(newParticipants);
          
            return eventRepository.save(event);
        } else {
            throw new EntityNotFoundException("Event not found with ID: " + eventId);
        }
    }
}
