package com.fsa.firststepapp.models.dto;

import java.util.UUID;

public class ParticipantDto {
    private Long participationId;
    private UUID userId;
    private Long eventId;

    public ParticipantDto() {
    }

    public Long getParticipationId() {
        return participationId;
    }

    public void setParticipationId(Long participationId) {
        this.participationId = participationId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
