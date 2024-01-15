package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
    Optional<Location> findByLocationId(Long locationId);
    Optional<Location> findByName(String name);
}
