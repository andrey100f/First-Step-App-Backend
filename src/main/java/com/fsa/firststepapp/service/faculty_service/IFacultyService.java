package com.fsa.firststepapp.service.faculty_service;


import com.fsa.firststepapp.models.dto.FacultyDto;
import com.fsa.firststepapp.models.request.FacultyRequest;

import java.util.List;

public interface IFacultyService {
    List<FacultyDto> getAllFaculties();
    FacultyDto addFaculty(FacultyRequest faculty);
    FacultyDto updateFaculty(FacultyRequest faculty, String facultyId);
    void deleteFaculty(String facultyId);

}
