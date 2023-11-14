package com.fsa.firststepapp.models.dto;

import com.fsa.firststepapp.models.Faculty;
import com.fsa.firststepapp.models.Message;
import com.fsa.firststepapp.models.University;

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
    private University university;
    private Faculty faculty;
    private String img;
    private List<Message> messages;

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

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Faculty getFaculty() { return faculty; }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
