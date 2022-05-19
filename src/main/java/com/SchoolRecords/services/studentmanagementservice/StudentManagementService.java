package com.SchoolRecords.services.studentmanagementservice;

import com.SchoolRecords.controllers.model.StudentInfo;

import java.util.Optional;

public interface StudentManagementService
{

    Optional<StudentInfo> findStudentByNumber(long number);

    void saveStudent(StudentInfo studentInfo) ;
}
