package com.fsa.firststepapp.service.participant_service;

import com.fsa.firststepapp.models.dto.ParticipantDto;
import com.fsa.firststepapp.models.request.AddParticipantRequest;

import java.util.List;

public interface IParticipantService {
     ParticipantDto addParticipant(AddParticipantRequest addParticipantRequest) ;
     List<ParticipantDto> getAllParticipants() ;
}
