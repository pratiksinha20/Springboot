package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

// @RestController
// @CrossOrigin(origins = "http://localhost:3000")
// public class StudentController {
//     @Autowired
//     private StudentService service;
    
//     @PostMapping("/create")
//     public Student createStudentAPI(@RequestBody Student student)
//     {
//         return service.createStudent(student);
//     }


//     @PostMapping("/api/login")
// public ResponseEntity<?> login(@RequestBody User user) {
//     return ResponseEntity.ok(service.login(user));
// }

//     // fetch all students
//     // @PostMapping("/fetch")
//     // public Student fetchStudentAPI(@RequestBody Student student)
//     // {
//     //     return service.fetchStudent(student);
//     // }
// }

// // local:8080/createcd 
@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/create")
    public Student createStudentAPI(@RequestBody Student student) {
        return service.createStudent(student);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {
    return service.getAllStudents();    
}
@GetMapping("/students/{id}")
public Student getStudentById(@PathVariable Long id) {
    return service.getStudentById(id);
}
@DeleteMapping("/students/{id}")
public String deleteStudent(@PathVariable Long id) {
    service.deleteStudent(id);
    return "Student deleted successfully";
}
@PutMapping("/students/{id}")
public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
    return service.updateStudent(id, student);
}



}
