package com.fsa.firststepapp.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Announcements")
public class Announcement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="announcementId")
    private Long announcementId;

    @Column(name="title")
    private String title;

    @Column(name="text")
    private String text;

    @Column(name="category")
    private String category;

    @Column(name="img")
    private String img;

    /* TODO: Map the relationship with the table "Universities"
    *        Add getters and setters for this attribute
    *        Read more about @ManyToOne and @OneToMany - these will be in both model classes to make the relationship between models */

    public Announcement() {
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
