package com.SchoolRecords.data.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_STUDENT")
@Setter
@Getter
@ToString
public class Student extends AbstractUniqueEntity
{

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @Column(name = "STUDENT_NUMBER", unique = true)
    private long studentNumber;

    @Column(name = "ENROLLMENT_DATE")
    private String enrollmentDate;

    @Column(name = "GPA")
    private String gpa;

    @ManyToOne
    @JoinColumn(name = "PROGRAM_ID")
    private Program enrolledProgram;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "T_STUDENT_COURSE_INSTANCE",
            joinColumns = {@JoinColumn(name = "STUDENT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COURSE_INSTANCE_ID")})
    @ToString.Exclude
    private List<CourseInstance> enrolledCourses;

    @OneToMany(mappedBy = "student")
    @ToString.Exclude
    private List<CourseGrade> courseGrades;

    public List<CourseGrade> getCourseGrades()
    {
        return courseGrades;
    }

}
