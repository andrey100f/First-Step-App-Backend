package com.fsa.firststepapp.models;

public enum ApplicationUserPermission {
    LOCATION_READ("location:read"),
    LOCATION_WRITE("location:write"),
    EVENT_READ("event:read"),
    EVENT_WRITE("event:write");

    private final String permission;

    ApplicationUserPermission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
