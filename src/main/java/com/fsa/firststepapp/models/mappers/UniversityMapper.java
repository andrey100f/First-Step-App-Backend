package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.models.dto.UniversityDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UniversityMapper {
    public UniversityDto convertModelToDto(University university) {
        UniversityDto universityDto = new UniversityDto();

        universityDto.setUniversityId(university.getUniversityId());
        universityDto.setName(university.getName());
        universityDto.setDetails(university.getDetails());
        universityDto.setImg(university.getImg());
        universityDto.setFaculties(university.getFaculties());
        universityDto.setAnnouncements(university.getAnnouncements());
        universityDto.setUsers(university.getUsers());

        return universityDto;
    }

    public List<UniversityDto> convertModelListToDtoList(List<University> universities) {
        List<UniversityDto> universityDtos = new ArrayList<>();

        for(University university: universities) {
            universityDtos.add(convertModelToDto(university));
        }

        return universityDtos;
    }
}
