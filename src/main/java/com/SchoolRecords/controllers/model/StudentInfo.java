package com.SchoolRecords.controllers.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StudentInfo
{

    private String firstName;

    private String lastName;

    private int year;

    private long studentNumber;

    private String email;

    private String phone;

    private String enrolledProgram;

    private String gpa;

}
