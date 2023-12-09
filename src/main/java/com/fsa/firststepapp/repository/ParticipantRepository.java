package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Participant;
<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
=======
import com.fsa.firststepapp.models.Participant;
import com.fsa.firststepapp.models.dto.ParticipantDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
