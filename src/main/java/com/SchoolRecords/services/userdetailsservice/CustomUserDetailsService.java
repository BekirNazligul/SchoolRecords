package com.SchoolRecords.services.userdetailsservice;


import com.SchoolRecords.data.dao.UserDAO;
import com.SchoolRecords.data.entities.User;
import com.SchoolRecords.services.userdetailsservice.model.CustomUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService
{

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Optional<User> user = userDAO.findByEmail(username);
        if (user.isPresent())
        {
            return new CustomUserDetail(user.get());
        }
        else
        {
            throw new UsernameNotFoundException("Authentication Failed!");
        }
    }
}
