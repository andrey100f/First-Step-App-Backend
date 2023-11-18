package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Event;
import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.EventDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepository extends CrudRepository<Location, Long> {
    List<Event> getEventsByLocationID(Long id);
}
