package com.fsa.firststepapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
    private Long locationId;
    private String name;
    private String city;
    private String street;
    private String number;
    private String type;
    private String latitude;
    private String longitude;
    private String img;
    private String description;
    private List<EventDto> eventDtos;
}
