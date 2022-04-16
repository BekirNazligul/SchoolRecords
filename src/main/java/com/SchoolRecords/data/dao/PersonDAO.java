package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person, String>
{
}
