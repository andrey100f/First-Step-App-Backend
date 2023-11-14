package com.fsa.firststepapp.models.dto;

import com.fsa.firststepapp.models.University;

public class FacultyDto {
    private Long facultyId;
    private String name;
    private String img;
    private University university;

    public FacultyDto() {
    }

    public Long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
