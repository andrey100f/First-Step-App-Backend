package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Faculty;
import com.fsa.firststepapp.models.dto.FacultyDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FacultyMapper {
    private final UniversityMapper universityMapper = new UniversityMapper();

    public FacultyDto convertModelToDto(Faculty faculty) {
        FacultyDto facultyDto = new FacultyDto();

        facultyDto.setFacultyId(faculty.getFacultyId());
        facultyDto.setName(faculty.getName());
        facultyDto.setImg(faculty.getImg());
        facultyDto.setUniversityDto(universityMapper.convertModelToDto(faculty.getUniversity()));

        return facultyDto;
    }

    public List<FacultyDto> convertModelListToDtoList(List<Faculty> faculties) {
        List<FacultyDto> facultyDtos = new ArrayList<>();

        for(Faculty faculty: faculties) {
            facultyDtos.add(convertModelToDto(faculty));
        }

        return facultyDtos;
    }
}
