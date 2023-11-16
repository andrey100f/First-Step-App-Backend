package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.AnnouncementDto;
import com.fsa.firststepapp.service.announcement_service.IAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/filterCategory")
    public List<AnnouncementDto> getAnnouncementsByCategory(@RequestParam String category){
        return announcementService.getAnnouncementsByCategory(category);
    }

    @GetMapping("/filterUniversity")
    public List<AnnouncementDto> getAnnouncementsByUniversity(@RequestParam String university){
        return announcementService.getAnnouncementsByUniversity(university);
    }
}
