package com.SchoolRecords.data.entities;

import com.SchoolRecords.data.enums.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_COURSE_INSTANCE")
@Getter
@Setter
public class CourseInstance extends AbstractUniqueEntity
{

    @ManyToOne
    @JoinColumn(name = "COURSE")
    private Course course;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "T_STUDENT_COURSE_INSTANCE",
            joinColumns = {@JoinColumn(name = "COURSE_INSTANCE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "STUDENT_ID")})
    private List<Student> enrolledStudents;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "T_INSTRUCTOR_COURSE_INSTANCE",
            joinColumns = {@JoinColumn(name = "COURSE_INSTANCE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "INSTRUCTOR_ID")})
    private List<Instructor> instructors;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courseInstance")
    private List<GradedCourseItem> gradedItems;

    @Column
    private String year;

    @Column
    private String semester;

    @Column
    private Status status;

}
