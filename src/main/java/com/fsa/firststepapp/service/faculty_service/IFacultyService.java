package com.fsa.firststepapp.service.faculty_service;

import com.fsa.firststepapp.models.dto.FacultyDto;
import com.fsa.firststepapp.models.request.AddFacultyRequest;

import java.util.List;

public interface IFacultyService {
    List<FacultyDto> getAllFaculties();
    FacultyDto addFaculty(AddFacultyRequest faculty);
    FacultyDto updateFaculty(String facultyId, AddFacultyRequest faculty);
    void deleteFaculty(String facultyId);
}
