package com.fsa.firststepapp.models.dto;

import java.util.UUID;

public class UserDto {
    private UUID userId;
    private String name;
    private String email;
    private String password;
    private UniversityDto universityDto;
    private FacultyDto facultyDto;

    public UserDto() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UniversityDto getUniversityDto() {
        return universityDto;
    }

    public void setUniversityDto(UniversityDto universityDto) {
        this.universityDto = universityDto;
    }

    public FacultyDto getFacultyDto() { return facultyDto; }

    public void setFacultyDto(FacultyDto facultyDto) {
        this.facultyDto = facultyDto;
    }
}
