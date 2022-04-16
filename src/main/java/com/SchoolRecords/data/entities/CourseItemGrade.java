package com.SchoolRecords.data.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_COURSE_ITEM_GRADE")
@RequiredArgsConstructor
@Getter
@Setter
public class CourseItemGrade extends AbstractUniqueEntity
{

    @ManyToOne
    @JoinColumn(name = "GRADED_ITEM_ID")
    private GradedCourseItem gradedItem;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @Column(name = "SCORE")
    private int score;

}
