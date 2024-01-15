package com.fsa.firststepapp.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddAnnouncementRequest {
    private String title;
    private String text;
    private String facultyName;
    private String universityName;
    private String url;
}
