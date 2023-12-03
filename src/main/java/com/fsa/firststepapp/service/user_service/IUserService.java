package com.fsa.firststepapp.service.user_service;

import com.fsa.firststepapp.models.User;
import com.fsa.firststepapp.models.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<UserDto> getAllUsers();
    Optional<User> findByEmail(String email) ;

}
