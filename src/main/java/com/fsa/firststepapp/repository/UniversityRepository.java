package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.service.university_service.UniversityService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
     University findUniversityByName(String name);
     University findByUniversityId(String id);
     //University findByUniversityName(String )

}
