package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.EventMapper;
import com.fsa.firststepapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        public List<EventDto> getEventsByLocationId(Long id){
            List<Event> events = eventRepository.getEventsByLocationId(id);
            if(events.isEmpty()) {
                throw new EntityNotFoundException("Events not found for this location id");
            }
            return eventMapper.convertModelListToDtoList(events);
        }


}
