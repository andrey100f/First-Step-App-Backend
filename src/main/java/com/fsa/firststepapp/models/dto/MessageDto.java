package com.fsa.firststepapp.models.dto;

import com.fsa.firststepapp.models.User;

import java.util.Date;

public class MessageDto {
    private Long messageId;
    private String text;
    private User user;
    private Date messageDate;

    public MessageDto() {
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
}
