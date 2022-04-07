package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.GradedCourseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradedCourseItemDAO extends JpaRepository<GradedCourseItem, String> {
}
