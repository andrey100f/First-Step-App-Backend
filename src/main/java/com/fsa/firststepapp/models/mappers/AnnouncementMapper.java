package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Announcement;
import com.fsa.firststepapp.models.dto.AnnouncementDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnnouncementMapper {
    public AnnouncementDto convertModelToDto(Announcement announcement) {
        AnnouncementDto announcementDto = new AnnouncementDto();

        announcementDto.setCategory(announcement.getCategory());
        announcementDto.setText(announcement.getText());
        announcementDto.setImg(announcement.getImg());
        announcementDto.setTitle(announcement.getTitle());

        return announcementDto;
    }

    public List<AnnouncementDto> convertModelListToDtoList(List<Announcement> announcements) {
        List<AnnouncementDto> announcementDtos = new ArrayList<>();

        for(Announcement announcement: announcements) {
            announcementDtos.add(convertModelToDto(announcement));
        }

        return announcementDtos;
    }
}
