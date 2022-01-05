package com.SchoolRecords.controllers;

import com.SchoolRecords.data.entities.test;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@PropertySource("Properties/application.properties")
public class TestController {
    @Getter
    private String string;

    @Autowired
    private SessionFactory factory;


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/testdb")
    @Transactional
    public String testdb() {
        Session session = factory.getCurrentSession();
        Query<test> query = session.createQuery("from test", test.class);
        return query.getResultList().get(0).toString();
    }

    @GetMapping("/")
    public String def() {
        return "<a href=\"http://localhost:8080/testdb\">DB Test</a>\n" +
                "<a href=\"http://localhost:8080/hello\">hello</a>";
    }
}
