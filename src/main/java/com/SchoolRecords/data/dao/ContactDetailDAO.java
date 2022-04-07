package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.ContactDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDetailDAO extends JpaRepository<ContactDetail, String> {
}
