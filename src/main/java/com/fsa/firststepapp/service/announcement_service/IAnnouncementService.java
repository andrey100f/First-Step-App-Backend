package com.fsa.firststepapp.service.announcement_service;

import com.fsa.firststepapp.models.Announcement;
import com.fsa.firststepapp.models.dto.AnnouncementDto;
import com.fsa.firststepapp.models.dto.FacultyDto;
import com.fsa.firststepapp.models.request.FacultyRequest;

import java.util.List;

public interface IAnnouncementService {
    List<AnnouncementDto> getAllAnnouncements();
    //AnnouncementDto addAnnouncement(AnnouncementRequest announcement);
    //FacultyDto updateAnnouncement(AnnouncementRequest announcement, String announcementId);
    //void deleteAnnouncement(String announcementId);

}
