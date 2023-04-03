package com.example.studentmanagementsystem.Repository;


import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.Entity.Sclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SclassRepository extends JpaRepository<Sclass, Long> {
    @Query("SELECT new com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto(s.subject,s.noOfCredits) FROM S s INNER JOIN Student st ON c.cooCertNumber=oa.cooCertNumber  WHERE s.student.")
    List<StudentEnrolledClassesDto> findClassesByStudentId(Long studentId);
}
