package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Location;
import com.fsa.firststepapp.models.dto.LocationDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationMapper {

    public LocationMapper() {
    }

    public LocationDto convertModelToDto(Location location) {
        LocationDto locationDto = new LocationDto();

        locationDto.setLocationId(location.getLocationId());
        locationDto.setName(location.getName());
        locationDto.setCity(location.getCity());
        locationDto.setStreet(location.getStreet());
        locationDto.setNumber(location.getNumber());
        locationDto.setType(location.getType());
        locationDto.setLatitude(location.getLatitude());
        locationDto.setLongitude(location.getLongitude());
        locationDto.setImg(location.getImg());

        return locationDto;
    }

    public List<LocationDto> convertModelListToDtoList(List<Location> locations) {
        List<LocationDto> locationDtos = new ArrayList<>();

        for(Location location: locations) {
            locationDtos.add(convertModelToDto(location));
        }

        return locationDtos;
    }
}
