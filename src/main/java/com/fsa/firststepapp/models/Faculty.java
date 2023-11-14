package com.fsa.firststepapp.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Faculties")
public class Faculty implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="facultyId")
    private Long facultyId;

    @Column(name = "name")
    private String name;

    @Column(name = "img")
    private String img;

    @ManyToOne()
    @JoinColumn(name="university", nullable = false)
    private University university;

    public Faculty(){

    }

    public Faculty(String name, University university, String img){
        this.name=name;
        this.img=img;
        this.university=university;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}