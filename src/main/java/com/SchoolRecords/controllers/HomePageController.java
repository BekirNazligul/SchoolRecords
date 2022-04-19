package com.SchoolRecords.controllers;

import com.SchoolRecords.controllers.model.PageDefinition;
import com.SchoolRecords.data.enums.Role;
import com.SchoolRecords.services.userdetailsservice.model.CustomUserDetail;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;

@Controller
public class HomePageController
{

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String getHomePage(UsernamePasswordAuthenticationToken principal, Model model)
    {
        CustomUserDetail userDetail = (CustomUserDetail) principal.getPrincipal();
        model.addAttribute("firstName", userDetail.getUser().getPerson().getPersonalDetail().getFirstName());
        model.addAttribute("pages", PageDefinition.filterPagesByRoles(Collections.singletonList(Role.ADMIN)));
        return "home";
    }
}
