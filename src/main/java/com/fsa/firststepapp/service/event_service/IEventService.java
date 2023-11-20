package com.fsa.firststepapp.service.event_service;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.dto.EventDto;

import java.util.List;

public interface IEventService {
    List<EventDto> getEventsByLocationId(Long id);

}
