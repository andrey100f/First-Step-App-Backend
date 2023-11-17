package com.fsa.firststepapp.models.dto;

public class EventDto {
    private Long eventId;
    private String name;
    private String description;
    private Long participants;
    private LocationDto locationDto;

    public EventDto() {
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParticipants() {
        return participants;
    }

    public void setParticipants(Long participants) {
        this.participants = participants;
    }

    public LocationDto getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(LocationDto locationDto) {
        this.locationDto = locationDto;
    }
}
