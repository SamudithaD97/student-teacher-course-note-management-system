package com.example.studentmanagementsystem.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Long noteId;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "noteCreatedDate")
    private LocalDateTime noteCreatedDate;

    @JoinColumn(name = "student_id",referencedColumnName = "student_id")
    @ManyToOne
    @JsonIgnore
    private Student studentId;

    @JoinColumn(name = "teacher_id",referencedColumnName = "teacher_id")
    @ManyToOne
    @JsonIgnore
    private Teacher teacherId;
}
