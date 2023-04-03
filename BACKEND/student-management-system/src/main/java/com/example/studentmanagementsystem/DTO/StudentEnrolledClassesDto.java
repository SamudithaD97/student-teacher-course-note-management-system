package com.example.studentmanagementsystem.DTO;

import com.example.studentmanagementsystem.Entity.Teacher;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
public class StudentEnrolledClassesDto {
    private String subject;
    private Long noOfCredits;
}
