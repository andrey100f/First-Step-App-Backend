package com.fsa.firststepapp.service.auth_service;

import com.fsa.firststepapp.models.AuthenticationRequest;
import com.fsa.firststepapp.models.AuthenticationResponse;
import com.fsa.firststepapp.models.RegisterRequest;

public interface IAuthenticationService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);

}
