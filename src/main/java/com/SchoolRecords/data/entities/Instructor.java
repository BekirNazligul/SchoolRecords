package com.SchoolRecords.data.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_INSTRUCTOR")
@Getter
@Setter
@NoArgsConstructor
public class Instructor extends AbstractUniqueEntity
{

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @Column(name = "INSTRUCTOR_NUMBER")
    private long instructorNumber;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "T_INSTRUCTOR_COURSE_INSTANCE",
            joinColumns = {@JoinColumn(name = "INSTRUCTOR_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COURSE_INSTRUCTOR_ID")})
    private List<CourseInstance> courses;

}
