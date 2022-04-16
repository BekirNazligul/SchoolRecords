package com.SchoolRecords.services.loginservice;

import com.SchoolRecords.controllers.model.LoginInfo;
import com.SchoolRecords.data.entities.Person;

import java.util.Optional;

/**
 * Simple, unsecure login service. Going to replace with Spring Security.
 */
public interface LoginService
{

    /**
     * Queries the database and returns the Person matching the login info, if it exists.
     *
     * @param loginInfo model attribute carrying email and password.
     * @return An optional person object, empty if login fails.
     * @deprecated Unsafe, will replace with Spring Security.
     */
    @Deprecated
    Optional<Person> login(LoginInfo loginInfo);

}
