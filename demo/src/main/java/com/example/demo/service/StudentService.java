package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

// @Service
// public class StudentService {

//     @Autowired // 
//     private StudentRepository repository;
//     public Student createStudent (Student student) {
//         // Logic to save the student to the database
//          return repository.save(student);
//     }
// }

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student createStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }
    public void deleteStudent(Long id) {
    repo.deleteById(id);
}

public Student updateStudent(Long id, Student newStudent) {
    Student existing = repo.findById(id).orElse(null);
    if (existing != null) {
        existing.setName(newStudent.getName());
        existing.setEmail(newStudent.getEmail());
        existing.setPhone(newStudent.getPhone());
        return repo.save(existing);
    }
    return null;
}


}
