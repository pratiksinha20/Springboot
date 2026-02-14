package com.example.demo.model;

// import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Entity
@Table(name = "StudentsInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
// public class Student {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long uid;
//     private String name;
//     private String email;
//     private String course;
//     private String section;
// }
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    // getters and setters
}




