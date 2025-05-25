package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Players {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rank;
    
    private String pName;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    
    public Players() {
        // Required by JPA
    }

    

	public Players(String pName, Profile profile) {
		this.pName = pName;
		this.profile = profile;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}



	@Override
	public String toString() {
	    return "Players{" +
	           "rank=" + rank +
	           ", pName='" + pName + '\'' +
	           ", profile=" + profile +
	           '}';
	}

    
    
}
