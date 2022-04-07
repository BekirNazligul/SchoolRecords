package com.SchoolRecords.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_INSTRUCTOR")
public class Instructor extends AbstractUniqueEntity {

    @OneToOne
    @JoinColumn(name = "PERSON")
    private Person person;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "T_INSTRUCTOR_COURSE_INSTANCE",
            joinColumns = {@JoinColumn(name = "INSTRUCTOR_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COURSE_INSTRUCTOR_ID")})
    private List<CourseInstance> courses;

}
