package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Participant;
import com.fsa.firststepapp.models.dto.ParticipantDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParticipantMapper {
    public ParticipantMapper() {
    }

    public ParticipantDto convertModelToDto(Participant participant) {
        ParticipantDto participantDto = new ParticipantDto();

        participantDto.setParticipationId(participant.getParticipationId());
        participantDto.setUserId(participant.getUserId());
        participantDto.setEventId(participant.getEventId());

        return participantDto;
    }

    public List<ParticipantDto> convertModelListToDtoList(List<Participant> participants) {
        List<ParticipantDto> participantDtos = new ArrayList<>();

        for(Participant participant: participants) {
            participantDtos.add(convertModelToDto(participant));
        }

        return participantDtos;
    }
}
