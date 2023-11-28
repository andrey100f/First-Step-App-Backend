package com.fsa.firststepapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
