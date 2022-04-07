package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramDAO extends JpaRepository<Program, String> {
}
