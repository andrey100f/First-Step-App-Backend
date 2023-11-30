package com.fsa.firststepapp.service.auth_service;

import com.fsa.firststepapp.models.AuthenticationRequest;
import com.fsa.firststepapp.models.AuthenticationResponse;
import com.fsa.firststepapp.models.RegisterRequest;
import com.fsa.firststepapp.models.UpdateUserRequest;

public interface IAuthenticationService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
    AuthenticationResponse updateUser(UpdateUserRequest request);

}
