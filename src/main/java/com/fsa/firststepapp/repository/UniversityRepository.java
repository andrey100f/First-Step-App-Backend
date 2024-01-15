package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
     Optional<University> findUniversityByName(String name);
     Optional<University> findByUniversityId(Long universityId);
}
