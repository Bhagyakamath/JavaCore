package com.example.service;

import com.example.dao.StudentRepository;
import com.example.entity.Student;
import com.example.microserviceEntity.CourseDTO;
import com.example.microserviceInterface.CourseClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseClientInterface courseClient;

    public Student addStudent(Student student) {

        // Validate course using Course-Service
        CourseDTO course = courseClient.getCourseById(student.getCourseId());

        if (course == null) {
            throw new RuntimeException("Invalid Course ID");
        }

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
