package com.fsa.firststepapp.service.participant_service;

import com.fsa.firststepapp.models.Participant;
import com.fsa.firststepapp.models.dto.ParticipantDto;


import java.util.List;
import java.util.UUID;

public interface IParticipantService {
     Participant addParticipant(UUID userId, Long eventId) ;
}
