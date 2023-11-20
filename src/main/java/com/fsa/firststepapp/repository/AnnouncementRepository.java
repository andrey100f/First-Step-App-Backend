package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Announcement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnnouncementRepository extends CrudRepository<Announcement, Long> {
    List<Announcement> getAnnouncementsByUniversityName(String university);
}