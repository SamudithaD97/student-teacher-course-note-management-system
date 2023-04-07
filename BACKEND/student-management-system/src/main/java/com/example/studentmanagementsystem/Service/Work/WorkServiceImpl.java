package com.example.studentmanagementsystem.Service.Work;

import com.example.studentmanagementsystem.DTO.worksInClassDto;
import com.example.studentmanagementsystem.Repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class WorkServiceImpl implements WorkService {
    @Autowired
    private final WorkRepository workRepository;

    @Override
    public List<worksInClassDto> getWorkDetailsInClass(Long classId){
        List<worksInClassDto> workList=workRepository.findClassesByStudentId(classId);
        return workList;
    }
}
