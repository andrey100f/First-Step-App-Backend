package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.University;
import com.fsa.firststepapp.models.dto.UniversityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UniversityMapper {
    private final FacultyMapper facultyMapper;
    private final AnnouncementMapper announcementMapper;
    private final UserMapper userMapper;

    @Autowired
    public UniversityMapper(FacultyMapper facultyMapper, AnnouncementMapper announcementMapper, UserMapper userMapper) {
        this.facultyMapper = facultyMapper;
        this.announcementMapper = announcementMapper;
        this.userMapper = userMapper;
    }

    public UniversityDto convertModelToDto(University university) {
        UniversityDto universityDto = new UniversityDto();

        universityDto.setUniversityId(university.getUniversityId());
        universityDto.setName(university.getName());
        universityDto.setDetails(university.getDetails());
        universityDto.setImg(university.getImg());
        universityDto.setFacultyDtos(facultyMapper.convertModelListToDtoList(university.getFaculties()));
        universityDto.setAnnouncementDtos(announcementMapper.convertModelListToDtoList(university.getAnnouncements()));
        universityDto.setUserDtos(userMapper.convertModelListToDtoList(university.getUsers()));

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
