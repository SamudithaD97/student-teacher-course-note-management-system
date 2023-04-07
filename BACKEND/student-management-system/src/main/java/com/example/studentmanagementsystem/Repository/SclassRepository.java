package com.example.studentmanagementsystem.Repository;


import com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto;
import com.example.studentmanagementsystem.Entity.Sclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SclassRepository extends JpaRepository<Sclass, Long> {

    @Query("SELECT new com.example.studentmanagementsystem.DTO.StudentEnrolledClassesDto(c.subject,c.noOfCredits) FROM Sclass c  JOIN c.studentId st  WHERE st.studentId = :studentId ")
    List<StudentEnrolledClassesDto> findClassesByStudentId(Long studentId);

}
