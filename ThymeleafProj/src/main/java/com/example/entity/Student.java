package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;

    private String name;

    private String course;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer percentage = 0;

//    public Student() {
//    	
//    }

//    public Integer getId() { return id; }
//    public void setId(Integer id) { this.id = id; }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public String getCourse() { return course; }
//    public void setCourse(String course) { this.course = course; }
//
//    public Integer getPercentage() { return percentage; }
//    public void setPercentage(Integer percentage) { this.percentage = percentage; }
}
