package com.example.studentmanagementsystem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;
@Data
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long attendanceId;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @JoinColumn(name = "classId",referencedColumnName = "classId")
    @ManyToOne
    @JsonIgnore
    private Sclass sclass;

    @JoinColumn(name = "classId",referencedColumnName = "classId")
    @ManyToOne
    @JsonIgnore
    private Student student;
}
