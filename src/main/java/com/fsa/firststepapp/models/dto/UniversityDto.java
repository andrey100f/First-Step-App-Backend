package com.fsa.firststepapp.models.dto;

import com.fsa.firststepapp.models.Announcement;
import com.fsa.firststepapp.models.Faculty;
import com.fsa.firststepapp.models.User;

import java.util.List;

public class UniversityDto {
    private Long universityId;
    private String name;
    private String details;
    private String img;
    private List<Faculty> faculties;
    private List<Announcement> announcements;
    private List<User> users;

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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
