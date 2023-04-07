package com.example.studentmanagementsystem.Service.Work;

import com.example.studentmanagementsystem.DTO.worksInClassDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface WorkService {
    List<worksInClassDto> getWorkDetailsInClass(Long classId);
}
