package com.SchoolRecords.data.dao;

import com.SchoolRecords.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDAO extends JpaRepository<User, String>
{

    @Query("from User user where user.email = :email")
    User findUserByNumber(@Param("email") String email);
}
