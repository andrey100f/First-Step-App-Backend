package com.fsa.firststepapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniversityDto {
    private Long universityId;
    private String name;
    private String details;
    private String img;
    private List<FacultyDto> facultyDtos;
}
