package com.example.studentmanagementsystem.Repository;

import com.example.studentmanagementsystem.Entity.Note;
import com.example.studentmanagementsystem.Entity.Student;
import com.example.studentmanagementsystem.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher findByUsername(String username);
}
