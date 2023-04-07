package com.example.studentmanagementsystem.Controller;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.DTO.worksInClassDto;
import com.example.studentmanagementsystem.Service.Work.WorkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/work")
public class Work {
    private final WorkService workService;

    @GetMapping("/get-work-inclass/{classId}")
    List<worksInClassDto> getWorkDetailsInClass(@PathVariable("classId") Long classId){
        log.info("Requested to get work Details By Student Id {}", classId);
        return workService.getWorkDetailsInClass(classId);
}
}
