package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.models.dto.UniversityDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {

     University findUniversityByUniversityId(Long id);

}
