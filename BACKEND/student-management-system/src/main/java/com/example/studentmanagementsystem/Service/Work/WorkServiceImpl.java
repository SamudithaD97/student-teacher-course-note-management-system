package com.example.studentmanagementsystem.Service.Work;

import com.example.studentmanagementsystem.DTO.ResponseDto;
import com.example.studentmanagementsystem.DTO.worksInClassDto;
import com.example.studentmanagementsystem.Entity.Sclass;
import com.example.studentmanagementsystem.Entity.Work;
import com.example.studentmanagementsystem.Repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
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

    @Override
    public ResponseDto createWork(Work work){
        try {
            work.setWorkCreatedDate(LocalDate.now());
            Work work1 = workRepository.save(work);
            return new ResponseDto("Successfully added", "01");

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseDto("Failed", "02");

        }
    }
}
