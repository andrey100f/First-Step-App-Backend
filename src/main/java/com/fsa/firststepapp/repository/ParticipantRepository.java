package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Participant;
import com.fsa.firststepapp.models.Participant;
import com.fsa.firststepapp.models.dto.ParticipantDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}