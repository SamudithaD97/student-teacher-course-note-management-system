package com.example.studentmanagementsystem.Repository;

import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.DTO.worksInClassDto;
import com.example.studentmanagementsystem.Entity.Teacher;
import com.example.studentmanagementsystem.Entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkRepository extends JpaRepository<Work, Long> {

    @Query("SELECT new com.example.studentmanagementsystem.DTO.worksInClassDto(w.topic,w.docPath,cast(w.workCreatedDate as string)) FROM Work w  WHERE w.classId.classId IN :classId ")
    List<worksInClassDto> findClassesByStudentId(Long classId);
}
