package com.SchoolRecords.controllers;

import com.SchoolRecords.controllers.model.LoginInfo;
import com.SchoolRecords.data.entities.Person;
import com.SchoolRecords.services.loginservice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;
import java.util.logging.Logger;

@Controller
@Scope(value = "request")
public class LoginController extends BaseController
{

    Logger logger = Logger.getLogger(String.valueOf(LoginController.class));

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name = "loginInfo") LoginInfo loginInfo)
    {
        Optional<Person> person = loginService.login(loginInfo);
        if (person.isPresent())
        {
            personInfo.setPerson(person.get());
            return switch (person.get().getRole())
                    {
                        case STUDENT -> "redirect:/studentMain";
                        case ADMIN -> "redirect:/adminMain";
                        case INSTRUCTOR -> "redirect:/instructorMain";
                    };
        } else
        {
            loginInfo.clear();
            loginInfo.setError(true);
            return null;
        }
    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String def(Model model)
    {
        model.addAttribute("loginInfo", new LoginInfo());
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout()
    {

        return "redirect:/login";
    }
}
