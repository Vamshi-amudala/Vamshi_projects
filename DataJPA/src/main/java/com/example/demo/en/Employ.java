package com.example.demo.en;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employ {
	@Id
	Integer id;
	String Name;
	double fee;
	
	public Employ() {
	    // required by JPA
	}
	
	public Employ(Integer id, String name, double fee) {
		super();
		this.id = id;
		Name = name;
		this.fee = fee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", Name=" + Name + ", fee=" + fee + "]";
	}
	
	
	
}