package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.CourseGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseGradeDAO extends JpaRepository<CourseGrade, String> {
}
