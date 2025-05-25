package com.example.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.percentage = (SELECT MAX(s2.percentage) FROM Student s2)")
    List<Student> findStudentsWithMaxPercentage();
}
