package com.example.studentmanagementsystem.Service.Student;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;

import java.util.List;

public interface StudentService {
    List<StudentEnrolledClassesDto> getStudentEnrolledClasses(Long studentId);
}
