package com.fsa.firststepapp.models;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRole {
    USER(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(ApplicationUserPermission.EVENT_READ,
            ApplicationUserPermission.EVENT_WRITE,
            ApplicationUserPermission.LOCATION_READ,
            ApplicationUserPermission.LOCATION_WRITE
            ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions){
        this.permissions=permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
