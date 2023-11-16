package com.fsa.firststepapp.service.announcement_service;

import com.fsa.firststepapp.models.Announcement;
import com.fsa.firststepapp.models.dto.AnnouncementDto;
import com.fsa.firststepapp.models.exception.models.EntityNotFoundException;
import com.fsa.firststepapp.models.mappers.AnnouncementMapper;
import com.fsa.firststepapp.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class AnnouncementService implements IAnnouncementService {
    private final AnnouncementRepository announcementRepository;
    private final AnnouncementMapper announcementMapper;

    @Autowired
    public AnnouncementService(AnnouncementRepository announcementRepository, AnnouncementMapper announcementMapper) {
        this.announcementRepository = announcementRepository;
        this.announcementMapper = announcementMapper;
    }

    @Override
    public List<AnnouncementDto> getAllAnnouncements() {
        List<Announcement> announcements = (List<Announcement>) announcementRepository.findAll();

        if(announcements.isEmpty()) {
            throw new EntityNotFoundException("Announcements Not Found!!");
        }

        return announcementMapper.convertModelListToDtoList(announcements);
    }
    public List<AnnouncementDto> getAnnouncementsByCategory(String category) {
        List<Announcement> announcements = (List<Announcement>) announcementRepository.findAll();
        List<AnnouncementDto> announcementsByCategory = new ArrayList<>();

        for (Announcement announcement : announcements) {
            if (announcement.getCategory().equalsIgnoreCase(category)) {
                announcementsByCategory.add(announcementMapper.convertModelToDto(announcement));
            }
        }

        if (announcementsByCategory.isEmpty()) {
            throw new EntityNotFoundException("Nici un anunt nu a fost gasit pentru aceasta categorie: " + category);
        }

        return announcementsByCategory;
    }
    public List<AnnouncementDto> getAnnouncementsByUniversity(String university) {
        List<Announcement> announcements = (List<Announcement>) announcementRepository.findAll();
        List<AnnouncementDto> announcementsByUniversity = new ArrayList<>();

        for (Announcement announcement : announcements) {
            if (announcement.getUniversity().equals(university)) {
                announcementsByUniversity.add(announcementMapper.convertModelToDto(announcement));
            }
        }

        if (announcementsByUniversity.isEmpty()) {
            throw new EntityNotFoundException("Nici un anunt nu a fost gasit pentru aceasta universitate: " + university);
        }

        return announcementsByUniversity;
    }


}
