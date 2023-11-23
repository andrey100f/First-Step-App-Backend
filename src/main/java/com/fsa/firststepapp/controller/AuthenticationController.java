package com.fsa.firststepapp.controller;


import com.fsa.firststepapp.models.AuthenticationRequest;
import com.fsa.firststepapp.models.AuthenticationResponse;
import com.fsa.firststepapp.models.RegisterRequest;
import com.fsa.firststepapp.service.auth_service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:8100", allowedHeaders = "*")
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @PostMapping("/test-req")
    public ResponseEntity<String> testPost(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok("POST SUCCESS!");
    }
}
