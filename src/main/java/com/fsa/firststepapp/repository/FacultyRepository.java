package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Faculty;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacultyRepository extends CrudRepository<Faculty, Long> {
    Faculty findFacultyByFacultyId(Long id);
}
