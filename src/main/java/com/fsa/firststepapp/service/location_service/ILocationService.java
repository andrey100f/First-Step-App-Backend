package com.fsa.firststepapp.service.location_service;

import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.models.request.AddLocationRequest;

import java.util.List;

public interface ILocationService {
    List<LocationDto> getAllLocations();
    LocationDto addLocation(AddLocationRequest location);
    LocationDto updateLocation(AddLocationRequest location, String locationId);
    void deleteLocation(String locationId);
}
