package com.SchoolRecords.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@ComponentScan("com.SchoolRecords")
@EntityScan(basePackages={"com.SchoolRecords.data.entities"})
@EnableJpaRepositories("com.SchoolRecords.data.dao")
public class SchoolRecordsApplication {

	public static void main(String[] args) {
        try
        {
            SpringApplication.run(SchoolRecordsApplication.class, args);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

}
