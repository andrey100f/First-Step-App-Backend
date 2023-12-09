package com.fsa.firststepapp.service.participant_service;

import com.fsa.firststepapp.models.Participant;
<<<<<<< HEAD
=======
import com.fsa.firststepapp.models.dto.ParticipantDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
import com.fsa.firststepapp.models.mappers.ParticipantMapper;
import com.fsa.firststepapp.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
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
<<<<<<< HEAD

=======
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
    public Participant addParticipant(UUID userId, Long eventId) {
        Participant participant = new Participant();
        participant.setUserId(userId);
        participant.setEventId(eventId);

        return participantRepository.save(participant);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
