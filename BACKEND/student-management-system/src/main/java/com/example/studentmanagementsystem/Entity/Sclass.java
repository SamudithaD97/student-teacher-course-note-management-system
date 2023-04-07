package com.example.studentmanagementsystem.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@Table(name = "Sclass")
public class Sclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;

    @Column(name = "subject",nullable = false)
    private String subject;

    @Column(name = "noOfStudents")
    private Long noOfStudents;

    @Column(name = "noOfCredits")
    private Long noOfCredits;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "class_student",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> studentId=new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "class_teacher",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teacherId=new ArrayList<>();

    @OneToMany(mappedBy = "classId",cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Attendance> attendanceCollection;

    @OneToMany(mappedBy = "classId",cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Work> workCollection;
}
