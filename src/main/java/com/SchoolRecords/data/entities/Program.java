package com.SchoolRecords.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_PROGRAM")
public class Program extends AbstractUniqueEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "REQUIRED_CREDITS")
    private int requiredCredits;

    @ManyToMany
    @JoinTable(name = "T_COURSE_PROGRAM", joinColumns = {@JoinColumn(name = "PROGRAM_ID")}, inverseJoinColumns = {@JoinColumn(name = "COURSE_ID")})
    private List<Course> courses;

}
