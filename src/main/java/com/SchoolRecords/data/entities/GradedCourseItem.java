package com.SchoolRecords.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_GRADED_COURSE_ITEM")
public class GradedCourseItem extends AbstractUniqueEntity {

    @Column(name = "PERCENTAGE")
    int percentage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COURSE_INSTANCE_ID")
    CourseInstance courseInstance;

    @Column(name = "TYPE")
    private String type;

    @OneToMany(mappedBy = "gradedItem")
    private List<CourseItemGrade> courseItemGrades;
}
