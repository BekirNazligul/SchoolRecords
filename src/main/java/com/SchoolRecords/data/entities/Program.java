package com.SchoolRecords.data.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_PROGRAM")
@Getter
@Setter
@NoArgsConstructor
public class Program extends AbstractUniqueEntity
{

    @Column(name = "NAME")
    private String name;

    @Column(name = "REQUIRED_CREDITS")
    private int requiredCredits;

    @ManyToMany
    @JoinTable(name = "T_COURSE_PROGRAM", joinColumns = {@JoinColumn(name = "PROGRAM_ID")}, inverseJoinColumns = {@JoinColumn(name = "COURSE_ID")})
    private List<Course> courses;

    @Column(name = "TYPE")
    private String type;

    @OneToMany(mappedBy = "enrolledProgram")
    private List<Student> students;
}
