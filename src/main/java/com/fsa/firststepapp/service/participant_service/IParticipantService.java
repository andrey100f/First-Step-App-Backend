package com.fsa.firststepapp.service.participant_service;

import com.fsa.firststepapp.models.dto.ParticipantDto;

import java.util.UUID;

public interface IParticipantService {
     ParticipantDto addParticipant(UUID userId, Long eventId) ;
}
