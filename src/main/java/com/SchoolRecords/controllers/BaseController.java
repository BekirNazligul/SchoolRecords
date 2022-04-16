package com.SchoolRecords.controllers;

import com.SchoolRecords.beans.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class BaseController
{
    @Autowired
    protected PersonInfo personInfo;

}
