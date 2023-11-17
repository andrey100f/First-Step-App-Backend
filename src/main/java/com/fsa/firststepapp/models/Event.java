package com.fsa.firststepapp.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Events")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eventId")
    private Long eventId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="participants")
    private Long participants;

    @ManyToOne()
    @JoinColumn(name = "location", nullable = false)
    private Location location;

    public Event() {
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParticipants() {
        return participants;
    }

    public void setParticipants(Long participants) {
        this.participants = participants;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
