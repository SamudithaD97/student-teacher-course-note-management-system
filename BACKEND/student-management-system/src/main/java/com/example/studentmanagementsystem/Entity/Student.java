package com.example.studentmanagementsystem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "full_name",nullable = false)
    private String fullName;

    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "contact_number",length = 15)
    private String contactNo;

    @Column(name = "password")
    private String password;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "studentId",cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Note> noteCollection;

    @ManyToMany(mappedBy ="student")
    private List<Sclass> sclass=new ArrayList<>();

    @OneToMany(mappedBy = "studentId",cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<Attendance> attendanceCollection;

}
