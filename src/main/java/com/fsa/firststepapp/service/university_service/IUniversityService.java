package com.fsa.firststepapp.service.university_service;

import com.fsa.firststepapp.models.dto.UniversityDto;
import com.fsa.firststepapp.models.request.AddUniversityRequest;

import java.util.List;

public interface IUniversityService {
    List<UniversityDto> getAllUniversities();
    UniversityDto addUniversity(AddUniversityRequest university);
    UniversityDto updateUniversity(String universityId, AddUniversityRequest university);
    void deleteUniversity(String universityId);
}
