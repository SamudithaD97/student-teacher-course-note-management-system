package com.example.studentmanagementsystem.Service.Student.StudentServiceImpl;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.Repository.SclassRepository;
import com.example.studentmanagementsystem.Repository.StudentRepository;
import com.example.studentmanagementsystem.Service.Student.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final SclassRepository sclassRepository;

    @Override
    public List<StudentEnrolledClassesDto> getStudentEnrolledClasses(Long studentId){
        List<StudentEnrolledClassesDto> classList = sclassRepository.findClassesByStudentId(studentId);
        return classList;
    }
    
    
}
