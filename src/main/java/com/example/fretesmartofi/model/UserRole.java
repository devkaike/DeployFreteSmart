package com.example.fretesmartofi.model;

public enum UserRole {
    ADMIN("admin"),
    MOTORISTA("motorista"),
    USER("user");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
