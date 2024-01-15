package com.fsa.firststepapp.service.announcement_service;

import com.fsa.firststepapp.models.dto.AnnouncementDto;
import com.fsa.firststepapp.models.request.AddAnnouncementRequest;

import java.util.List;

public interface IAnnouncementService {
    List<AnnouncementDto> getAllAnnouncements();
    AnnouncementDto addAnnouncement(AddAnnouncementRequest announcement);
    AnnouncementDto updateAnnouncement(String announcementId, AddAnnouncementRequest announcement);
    void deleteAnnouncement(String announcementId);
}
