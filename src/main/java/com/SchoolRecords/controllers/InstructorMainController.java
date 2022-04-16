package com.SchoolRecords.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope(value = "request")
public class InstructorMainController extends BaseController
{

    @RequestMapping(value = "/instructorMain", method = RequestMethod.GET)
    public String init(Model model)
    {
        model.addAttribute("personInfo", personInfo);
        return "instructorMain";
    }
}