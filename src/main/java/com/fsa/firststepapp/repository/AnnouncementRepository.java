package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Announcement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnnouncementRepository extends CrudRepository<Announcement, Long> {
    Optional<Announcement> findByAnnouncementId(Long announcementId);
}
