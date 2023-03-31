package com.example.studentmanagementsystem.Repository;

import com.example.studentmanagementsystem.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface NoteRepository extends JpaRepository<Note, Long> {
}
