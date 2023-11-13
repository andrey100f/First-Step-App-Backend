package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.AnnouncementDto;
import com.fsa.firststepapp.service.announcement_service.IAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/api/announcements")
public class AnnouncementController {
    private final IAnnouncementService announcementService;

    @Autowired
    public AnnouncementController(IAnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping("")
    public List<AnnouncementDto> getAllAnnouncements() {
        return announcementService.getAllAnnouncements();
    }
}
