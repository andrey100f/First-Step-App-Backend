package com.fsa.firststepapp.models;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.fsa.firststepapp.models.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    USER(Sets.newHashSet(EVENT_READ, LOCATION_READ, UNIVERSITY_READ, FACULTY_READ)),
    ADMIN(Sets.newHashSet(EVENT_READ, EVENT_CREATE, EVENT_UPDATE, EVENT_DELETE,
            LOCATION_CREATE, LOCATION_READ, LOCATION_DELETE, LOCATION_UPDATE,
            UNIVERSITY_CREATE, UNIVERSITY_DELETE, UNIVERSITY_READ, UNIVERSITY_UPDATE,
            FACULTY_CREATE, FACULTY_DELETE, FACULTY_READ, FACULTY_UPDATE
            ));

    private final Set<ApplicationUserPermission> permissions;

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    ApplicationUserRole(Set<ApplicationUserPermission> permissions){
        this.permissions=permissions;
    }

    public List<SimpleGrantedAuthority> getAuthorities(){
        var authorities = getPermissions()
                .stream()
                .map(permissions -> new SimpleGrantedAuthority(permissions.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return authorities;
    }
}
