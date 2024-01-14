package com.fsa.firststepapp.service.faculty_service;

import com.fsa.firststepapp.models.Faculty;
import com.fsa.firststepapp.models.dto.FacultyDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.FacultyMapper;
import com.fsa.firststepapp.models.request.FacultyRequest;
import com.fsa.firststepapp.repository.FacultyRepository;
import com.fsa.firststepapp.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyService implements IFacultyService {
    private final FacultyRepository facultyRepository;
    private final UniversityRepository universityRepository;
    private final FacultyMapper facultyMapper;

    @Autowired
    public FacultyService(FacultyRepository facultyRepository, FacultyMapper facultyMapper,UniversityRepository universityRepository) {
        this.facultyRepository = facultyRepository;
        this.facultyMapper = facultyMapper;
        this.universityRepository = universityRepository;
    }

    @Override
    public List<FacultyDto> getAllFaculties() {
        List<Faculty> faculties = (List<Faculty>) facultyRepository.findAll();

        if (faculties.isEmpty()) {
            throw new EntityNotFoundException("Universities Not Found!!");
        }

        return facultyMapper.convertModelListToDtoList(faculties);
    }
    @Override
    public FacultyDto addFaculty(FacultyRequest faculty) {
        Faculty facultyToAdd = new Faculty();

        facultyToAdd.setName(faculty.getFacultyName());
        facultyToAdd.setUniversity(universityRepository.findUniversityByName(faculty.getFacultyName()));
        facultyToAdd.setUsers(new ArrayList<>());
        facultyToAdd.setAnnouncements(new ArrayList<>());
        return facultyMapper.convertModelToDto(facultyRepository.save(facultyToAdd));
    }
    @Override
    public FacultyDto updateFaculty(FacultyRequest faculty, String facultyId) {
        Faculty facultyToUpdate = facultyRepository.findByFacultyId(String.valueOf(Long.parseLong(facultyId)));

        if(facultyToUpdate == null) {
            throw new EntityNotFoundException("University not found!! ");
        }

        facultyToUpdate.setName(faculty.getUniversityName());
        facultyToUpdate.setAnnouncements(new ArrayList<>());
        facultyToUpdate.setUsers(new ArrayList<>());
        facultyToUpdate.setUniversity(universityRepository.findUniversityByName(faculty.getFacultyName()));

        return facultyMapper.convertModelToDto(facultyRepository.save(facultyToUpdate));
    }
    @Override
    public void deleteFaculty(String facultyId) {
        Faculty faculty = facultyRepository.findByFacultyId(String.valueOf(Long.parseLong(facultyId)));

        if(faculty == null) {
            throw new EntityNotFoundException("Location not found!!");
        }

        facultyRepository.delete(faculty);
    }

}
