package com.SchoolRecords.controllers;

import com.SchoolRecords.controllers.model.StudentInfo;
import com.SchoolRecords.services.studentmanagementservice.StudentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class StudentManagementController
{

    @Autowired
    private StudentManagementService studentManagementService;


    @RequestMapping(value = "/studentManagement", method = RequestMethod.GET)
    public String studentManagement(Model model,
                                    @RequestParam(value = "new", required = false) boolean isNew,
                                    @RequestParam(value = "student", required = false) String studentNumber)
    {
        model.addAttribute("studentNumber", "");

        if (isNew)
        {
            model.addAttribute("studentInfo", new StudentInfo());
        }
        return "studentManagement";
    }


    @RequestMapping(value = "/studentManagement/search", method = RequestMethod.POST)
    public String findStudent(Model model, @RequestParam(value = "action") String action, @ModelAttribute String studentNumber)
    {
       if ("new".equals(action))
       {
           return "redirect:/studentManagement?new=true";
       }

       if ("search".equals(action))
       {
           return "redirect:/studentManagement?student=";
       }
       return "studentManagement";
    }


//    @RequestMapping(value = "/studentManagement/search", method = RequestMethod.POST)
//    public String findStudent(Model model, @RequestParam(value = "action") String action)
//    {
//        resetFields(model);
//        model.addAttribute("renderInfoForm", true);
//        return "studentManagement";
//    }
//
//    @RequestMapping(value = "/studentManagement/search", method = RequestMethod.GET)
//    public String findStudent(Model model, @RequestAttribute(name = "student") String studentNumber)
//    {
//        return "studentManagement";
//    }
//
//    public String saveStudent(@Validated @ModelAttribute(name = "studentInfo") StudentInfo studentInfo)
//    {
//
//    }
//
//    @RequestMapping(value = "/studentManagement", method = RequestMethod.GET)
//    public String init(Model model)
//    {
//        resetFields(model);
//        return "studentManagement";
//    }
//
//    private void resetFields(Model model)
//    {
//        model.addAttribute("render", Boolean.FALSE);
//        model.addAttribute("renderInfoForm", Boolean.FALSE);
//        model.addAttribute("studentInfo", new StudentInfo());
//        model.addAttribute("studentNumber", "");
//    }

}
