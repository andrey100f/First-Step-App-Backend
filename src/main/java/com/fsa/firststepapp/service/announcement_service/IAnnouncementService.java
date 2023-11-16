package com.fsa.firststepapp.service.announcement_service;

import com.fsa.firststepapp.models.dto.AnnouncementDto;

import java.util.List;

public interface IAnnouncementService {
    List<AnnouncementDto> getAllAnnouncements();
    List<AnnouncementDto> getAnnouncementsByCategory(String category);
    List<AnnouncementDto> getAnnouncementsByUniversity(String university);
}