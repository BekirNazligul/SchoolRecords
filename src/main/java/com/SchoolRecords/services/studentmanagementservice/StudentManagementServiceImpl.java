package com.SchoolRecords.services.studentmanagementservice;

import com.SchoolRecords.controllers.model.StudentInfo;
import com.SchoolRecords.data.dao.StudentDAO;
import com.SchoolRecords.data.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentManagementServiceImpl implements StudentManagementService
{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Optional<StudentInfo> findStudentByNumber(long number)
    {
        Optional<Student> student = studentDAO.findByStudentNumber(number);
        return student.map(this::getStudentDisplayObjectFromEntity);
    }

    @Override
    public void saveStudent(StudentInfo studentInfo)
    {

    }

    private StudentInfo getStudentDisplayObjectFromEntity(Student student)
    {
        return StudentInfo.builder()
                .firstName(student.getPerson().getName())
                .studentNumber(student.getStudentNumber())
                .email(student.getPerson().getContactDetail().getEmail())
                .phone(student.getPerson().getContactDetail().getPhoneNumber())
                .enrolledProgram(student.getEnrolledProgram().getName())
                .gpa(student.getGpa())
                .build();
    }

    private Student getStudentEntityFromDisplayObject(StudentInfo studentInfo)
    {
        return new Student();
    }
}
