package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String role;
    private String format;
    private String runs;
    private int trophies;

    // No-arg constructor required by JPA
    public Profile() {}

    public Profile(String role, String format, String runs, int trophies) {
        this.role = role;
        this.format = format;
        this.runs = runs;
        this.trophies = trophies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    @Override
    public String toString() {
        return "Profile{" +
               "id=" + id +
               ", role='" + role + '\'' +
               ", format='" + format + '\'' +
               ", runs='" + runs + '\'' +
               ", trophies=" + trophies +
               '}';
    }

    
}
