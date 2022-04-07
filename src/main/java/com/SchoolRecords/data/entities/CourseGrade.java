package com.SchoolRecords.data.entities;

import com.SchoolRecords.data.enums.Status;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_COURSE_GRADE")
@RequiredArgsConstructor
@Getter
@Setter
public class CourseGrade extends AbstractUniqueEntity {

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "COURSE_INSTANCE")
    private CourseInstance courseInstance;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private Status status;

    @Column(name = "GRADE")
    private String grade;

}
