package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.dto.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventMapper {
    private final LocationMapper locationMapper;

    @Autowired
    public EventMapper(LocationMapper locationMapper) {
        this.locationMapper = locationMapper;
    }

    public EventDto convertModelToDto(Event event) {
        EventDto eventDto = new EventDto();

        eventDto.setEventId(event.getEventId());
        eventDto.setName(event.getName());
        eventDto.setDescription(event.getDescription());
        eventDto.setParticipants(event.getParticipants());
        eventDto.setLocationDto(locationMapper.convertModelToDto(event.getLocation()));

        return eventDto;
    }

    public List<EventDto> convertModelListToDtoList(List<Event> events) {
        List<EventDto> eventDtos = new ArrayList<>();

        for(Event event: events) {
            eventDtos.add(convertModelToDto(event));
        }

        return eventDtos;
    }
}
