package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.en.Employ;
@Repository
public interface Myrepo extends CrudRepository<Employ, Integer>{
	
}