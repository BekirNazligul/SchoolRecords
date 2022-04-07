package com.SchoolRecords.data.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_COURSE")
@Getter
@Setter
@RequiredArgsConstructor
public class Course extends AbstractUniqueEntity {

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREDITS")
    private int credits;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "T_COURSE_PROGRAM",
            joinColumns = {@JoinColumn(name = "COURSE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PROGRAM_ID")})
    private List<Program> programs;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private List<CourseInstance> instances;


}
