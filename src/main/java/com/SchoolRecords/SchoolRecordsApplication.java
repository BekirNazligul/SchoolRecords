package com.SchoolRecords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@ComponentScan(basePackages = "com.SchoolRecords")
@EntityScan(basePackages = {"com.SchoolRecords.data.entities"})
@EnableJpaRepositories("com.SchoolRecords.data.dao")
public class SchoolRecordsApplication
{

    public static void main(String[] args)
    {
        try
        {
            SpringApplication.run(SchoolRecordsApplication.class, args);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}
