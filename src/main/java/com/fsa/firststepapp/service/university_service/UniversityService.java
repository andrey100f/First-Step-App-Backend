package com.fsa.firststepapp.service.university_service;

import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.models.dto.UniversityDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.UniversityMapper;
import com.fsa.firststepapp.models.request.AddUniversityRequest;
import com.fsa.firststepapp.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService implements IUniversityService {
    private final UniversityRepository universityRepository;
    private final UniversityMapper universityMapper;

    @Autowired
    public UniversityService(UniversityRepository universityRepository, UniversityMapper universityMapper) {
        this.universityRepository = universityRepository;
        this.universityMapper = universityMapper;
    }

    @Override
    public List<UniversityDto> getAllUniversities() {
        List<University> universities = (List<University>) universityRepository.findAll();

        if (universities.isEmpty()) {
            throw new EntityNotFoundException("Universities Not Found!!");
        }

        return universityMapper.convertModelListToDtoList(universities);
    }
    @Override
    public UniversityDto addUniversity(AddUniversityRequest university) {
        University universityToAdd = new University();

        universityToAdd.setName(university.getUniversityName());
        universityToAdd.setImg(university.getUniversityImg());
        universityToAdd.setFaculties(new ArrayList<>());
        universityToAdd.setAnnouncements(new ArrayList<>());
        universityToAdd.setUsers(new ArrayList<>());

        return universityMapper.convertModelToDto(universityRepository.save(universityToAdd));
    }
    @Override
    public UniversityDto updateUniversity(AddUniversityRequest university, String universityId) {
        University universityToUpdate = universityRepository.findByUniversityId(Long.parseLong(universityId));

        if(universityToUpdate == null) {
            throw new EntityNotFoundException("University not found!! ");
        }

        universityToUpdate.setName(university.getUniversityName());
        universityToUpdate.setImg(university.getUniversityImg());

        return universityMapper.convertModelToDto(universityRepository.save(universityToUpdate));
    }
    @Override
    public void deleteUniversity(String universityId) {
        University university = universityRepository.findByUniversityId(Long.parseLong(universityId));

        if(university == null) {
            throw new EntityNotFoundException("Location not found!!");
        }

        universityRepository.delete(university);
    }

}
