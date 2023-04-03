package com.example.studentmanagementsystem.Controller;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.Service.Student.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/student")
public class Student {

    private final StudentService studentService;

    @GetMapping("/get-by-student-id/{studentId}")
    List<StudentEnrolledClassesDto> getStudentEnrolledClasses(@PathVariable("studentId") Long studentId){
        log.info("Requested to get class Details By Student Id {}", studentId);
        return studentService.getStudentEnrolledClasses(studentId);}
}

}
