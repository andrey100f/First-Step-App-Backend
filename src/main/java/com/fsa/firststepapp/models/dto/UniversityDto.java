package com.fsa.firststepapp.models.dto;

import java.util.List;

public class UniversityDto {
    private Long universityId;
    private String name;
    private String details;
    private String img;
    private List<FacultyDto> facultyDtos;

    public UniversityDto() {
    }

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<FacultyDto> getFacultyDtos() {
        return facultyDtos;
    }

    public void setFacultyDtos(List<FacultyDto> facultyDtos) {
        this.facultyDtos = facultyDtos;
    }
}
