package com.SchoolRecords.data.entities;


import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_STUDENT")
@Setter
@ToString
public class Student extends AbstractUniqueEntity
{

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @Column(name = "STUDENT_NUMBER")
    private long studentNumber;

    @Column(name = "ENROLLMENT_DATE")
    private String enrollmentDate;

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
