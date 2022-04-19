package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDAO extends JpaRepository<User, String>
{
    Optional<User> findByEmail(String email);
}
