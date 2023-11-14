package com.fsa.firststepapp.models.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class UserDto {
    private UUID userId;
    private String name;
    private String sex;
    private Date birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    private UniversityDto universityDto;
    private FacultyDto facultyDto;
    private String img;
    private List<MessageDto> messageDtos;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<MessageDto> getMessageDtos() {
        return messageDtos;
    }

    public void setMessageDtos(List<MessageDto> messageDtos) {
        this.messageDtos = messageDtos;
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
