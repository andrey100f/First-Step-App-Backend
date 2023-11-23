package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.User;
import com.fsa.firststepapp.models.dto.LocationDto;
import com.fsa.firststepapp.models.dto.UserDto;
import com.fsa.firststepapp.service.location_service.ILocationService;
import com.fsa.firststepapp.service.user_service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:8100", allowedHeaders = "*")
@RequestMapping("/api/users")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
}
