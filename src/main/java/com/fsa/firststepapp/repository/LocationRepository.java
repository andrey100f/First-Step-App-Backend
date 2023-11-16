package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.LocationDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
    List<LocationDto> getAllLocations();

}
