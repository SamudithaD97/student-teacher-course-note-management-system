package com.example.studentmanagementsystem.Service.SClass;

import com.example.studentmanagementsystem.DTO.ResponseDto;
import com.example.studentmanagementsystem.Entity.Note;
import com.example.studentmanagementsystem.Entity.Sclass;
import com.example.studentmanagementsystem.Repository.SclassRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class SClassServiceImpl implements SClassService {

    @Autowired
    private final SclassRepository sclassRepository;
    @Override
    public List<String> getSubjects(){
        List<String> subList=sclassRepository.getSubjects();
        return subList;
    }

    @Override
    public ResponseDto createClass(Sclass sclass){
        try {
            Sclass sclass1 = sclassRepository.save(sclass);
            return new ResponseDto("Successfully added", "01");

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseDto("Failed", "02");

        }
    }
}
