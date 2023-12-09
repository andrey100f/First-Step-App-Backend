package com.fsa.firststepapp.repository;

import com.fsa.firststepapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
<<<<<<< HEAD
    Optional<User> findByEmail(String email);
=======
     Optional<User> findByEmail(String email) ;

    User findByUserId(UUID userId);
>>>>>>> e76753342bcc4ac65edfcce4935e62cc95b6f8ee
}
