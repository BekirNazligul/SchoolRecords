package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentDAO extends JpaRepository<Student, String> {

    @Query("from Student s where s.studentNumber = :studentNumber")
    Student findStudentByStudentNumber(@Param(value = "studentNumber") long studentNumber);
}
