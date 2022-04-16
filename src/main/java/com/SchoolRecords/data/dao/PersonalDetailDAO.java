package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.PersonalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetailDAO extends JpaRepository<PersonalDetail, String>
{
}
