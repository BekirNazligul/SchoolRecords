package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseInstanceDAO extends JpaRepository<CourseInstance, String> {
}
