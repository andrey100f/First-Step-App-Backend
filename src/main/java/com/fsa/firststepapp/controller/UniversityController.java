package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.models.dto.UniversityDto;
import com.fsa.firststepapp.service.location_service.ILocationService;
import com.fsa.firststepapp.service.university_service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/api/universities")
public class UniversityController {
    private final IUniversityService universityService;

    @Autowired
    public UniversityController(IUniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping("")
    public List<UniversityDto> getAllUniversities() {
        return universityService.getAllUniversities();
    }
}
