package com.fsa.firststepapp.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnouncementDto {
    private Long announcementId;
    private String title;
    private String text;
    private String category;
    private String img;
    private String url;
    private UniversityDto universityDto;
}
