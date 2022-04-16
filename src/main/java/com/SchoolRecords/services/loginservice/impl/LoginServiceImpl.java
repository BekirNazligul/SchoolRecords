package com.SchoolRecords.services.loginservice.impl;

import com.SchoolRecords.controllers.model.LoginInfo;
import com.SchoolRecords.data.dao.UserDAO;
import com.SchoolRecords.data.entities.Person;
import com.SchoolRecords.data.entities.User;
import com.SchoolRecords.services.loginservice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService
{

    @Autowired
    private UserDAO userDAO;

    @Override
    public Optional<Person> login(LoginInfo loginInfo)
    {
        User user = userDAO.findUserByNumber(loginInfo.getEmail());
        return user != null ? Optional.ofNullable(user.getPerson()) : Optional.empty();
    }
}
