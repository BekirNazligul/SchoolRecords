package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorDAO extends JpaRepository<Instructor, String> {
}
