package com.fsa.firststepapp.controller;


import com.fsa.firststepapp.models.dto.AnnouncementDto;
import com.fsa.firststepapp.models.dto.EventDto;
import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.service.announcement_service.IAnnouncementService;
import com.fsa.firststepapp.service.event_service.IEventService;
import com.fsa.firststepapp.service.location_service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/api/events")
public class EventController {
    private final IEventService eventService;

    @Autowired
    public EventController(IEventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/locationId")
    public List<EventDto> getEventsByLocationId(@PathVariable String locationId) {
        Long id = Long.getLong(locationId);
        return eventService.getEventsByLocationId(id);
    }
}
