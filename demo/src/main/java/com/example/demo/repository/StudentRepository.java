package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

// @Repository
// public interface StudentRepository extends JpaRepository<Student , Long>{
//     // here we can write custom query methods if needed, but for basic CRUD operations, JpaRepository provides all the necessary methods.
// }

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
