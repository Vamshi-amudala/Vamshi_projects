package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entity.Players;
import com.example.demo.entity.Profile;
import com.example.demo.repo.PlayerRepo;
import com.example.demo.repo.ProfileRepo;

@SpringBootApplication
public class DataJpa2Application {

	public static void main(String[] args) {
	    ApplicationContext context = SpringApplication.run(DataJpa2Application.class, args);
	    PlayerRepo playersRepository = context.getBean(PlayerRepo.class);

	    Profile pf = new Profile("Batsman", "Test, Odi, t20", "23000", 5);
	    Profile pf2 = new Profile("Batsman", "Test, Odi, t20", "18000", 1);

	    Players p1 = new Players("Virat", pf);
	    Players p2 = new Players("AB Devilliers", pf2);

	    playersRepository.save(p1);
	    playersRepository.save(p2);
	    
	    
	    System.out.println(p1);
	    System.out.println(p2);

	}
     
}
