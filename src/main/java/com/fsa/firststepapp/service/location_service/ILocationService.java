package com.fsa.firststepapp.service.location_service;

import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.models.dto.LocationDto;

import java.util.List;

public interface ILocationService {
    List<LocationDto> getAllLocations();
    List<LocationDto> getLocationsByType(String type);

}
