package com.SchoolRecords.controllers;

import com.SchoolRecords.data.dao.StudentDAO;
import com.SchoolRecords.data.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//@RestController
//public class TestController {
//
//    @Autowired
//    private StudentDAO studentDAO;
//
//    @GetMapping("/hello")
//    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return String.format("Hello %s!", name);
//    }
//
//    @GetMapping("/testdb")
//    @Transactional
//    public String testdb() {
//        Student test = new Student();
//        test.setStudentNumber(20170808046L);
//        test.setEnrollmentDate("2017");
//        studentDAO.save(test);
//
//        return studentDAO.findStudentByStudentNumber(20170808046L).toString();
//
//    }
//
//    @GetMapping("/")
//    public String def() {
//        return "<a href=\"http://localhost:8080/testdb\">DB Test</a>\n" +
//                "<a href=\"http://localhost:8080/hello\">hello</a>";
//    }
//}
