package com.example.studentmanagementsystem.Controller;

import com.example.studentmanagementsystem.DTO.ResponseDto;
import com.example.studentmanagementsystem.Service.Teacher.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/teacher")
public class Teacher {
    private final TeacherService teacherService;

    @PostMapping(value = "/enroll")
    public ResponseDto enrollClass(@RequestParam("subject") String subject,
                                   @RequestParam("teacherId") Long teacherId) {
        log.info("Requested to enroll class {} teacherId{}", subject,teacherId);
        return teacherService.enrollClass(subject,teacherId);
    }
}
