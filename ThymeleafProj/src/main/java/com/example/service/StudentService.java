package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public Student addStudent(Student student) {
        if (student.getPercentage() == null) {
            student.setPercentage(0);
        }
        return repo.save(student);
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student) {
        student.setId(id);
        return repo.save(student);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }

    public Page<Student> getPaginatedStudents(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findAll(pageable);
    }

    public List<Student> getStudentsWithMaxPercentage() {
        return repo.findStudentsWithMaxPercentage();
    }
}
