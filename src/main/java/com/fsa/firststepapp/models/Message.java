package com.fsa.firststepapp.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="messageId")
    private Long messageId;

    @Column(name="text")
    private String text;

    @Column(name="messageDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messageDate;

    @Column(name="category")
    private String category;

    @ManyToOne()
    @JoinColumn(name="posterId", nullable = false)
    private User user;

    public Message(){
    }

    public Message(String text, User user, Date messageDate){
        this.text=text;
        this.messageDate=messageDate;
        this.user = user;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
