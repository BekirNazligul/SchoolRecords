package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StudentDAO extends JpaRepository<Student, String>
{

    Optional<Student> findByStudentNumber(long studentNumber);
}
