package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Players;

public interface PlayerRepo extends JpaRepository<Players, Integer> {

}
