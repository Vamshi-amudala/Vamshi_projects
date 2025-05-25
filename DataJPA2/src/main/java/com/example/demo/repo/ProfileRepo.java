package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile , Integer>{

}
