package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Faculty;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FacultyRepository extends CrudRepository<Faculty, Long> {
    Optional<Faculty> findByName(String name);
    Optional<Faculty> findByFacultyId(Long facultyId);
}
