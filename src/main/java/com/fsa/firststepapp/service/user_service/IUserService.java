package com.fsa.firststepapp.service.user_service;

import com.fsa.firststepapp.models.dto.UserDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    List<UserDto> getAllUsers();
     User getById(UUID userId) ;
}
