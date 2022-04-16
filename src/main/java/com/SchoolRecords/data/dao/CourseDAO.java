package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course, String>
{
}
