package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.CourseItemGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseItemGradeDAO extends JpaRepository<CourseItemGrade, String>
{
}
