package com.fsa.firststepapp.service.participant_service;

import com.fsa.firststepapp.models.Participant;
import com.fsa.firststepapp.models.dto.ParticipantDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.ParticipantMapper;
import com.fsa.firststepapp.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService implements IParticipantService {
    private final ParticipantRepository participantRepository;
    private final ParticipantMapper participantMapper;

    @Autowired
    public ParticipantService(ParticipantRepository participantRepository, ParticipantMapper participantMapper) {
        this.participantRepository = participantRepository;
        this.participantMapper = participantMapper;
    }
    public Participant addParticipant(UUID userId, Long eventId) {
        Participant participant = new Participant();
        participant.setUserId(userId);
        participant.setEventId(eventId);

        return participantRepository.save(participant);
    }
}