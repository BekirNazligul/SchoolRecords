package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyDAO extends JpaRepository<Faculty, String> {
}
