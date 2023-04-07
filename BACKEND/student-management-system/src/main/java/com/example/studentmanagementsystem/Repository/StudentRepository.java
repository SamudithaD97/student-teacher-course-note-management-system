package com.example.studentmanagementsystem.Repository;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByUsername(String username);



}
