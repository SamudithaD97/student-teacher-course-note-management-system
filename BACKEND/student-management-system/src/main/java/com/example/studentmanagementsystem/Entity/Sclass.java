package com.example.studentmanagementsystem.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "Sclass")
public class Sclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classId")
    private Long classId;

    @Column(name = "subject",nullable = false)
    private String subject;

    @Column(name = "noOfStudents")
    private Long noOfStudents;

    @ManyToMany
    @JoinTable(name = "class_student",joinColumns = @JoinColumn(name="classId"),
    inverseJoinColumns = @JoinColumn(name="studentId"))
    private List<Student> student=new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "class_teacher",joinColumns = @JoinColumn(name="classId"),
            inverseJoinColumns = @JoinColumn(name="teacherId"))
    private List<Teacher> teacher=new ArrayList<>();

    @OneToMany(mappedBy = "classId",cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Attendance> attendanceCollection;
}
