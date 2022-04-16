package com.SchoolRecords.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_FACULTY")
public class Faculty extends AbstractUniqueEntity
{

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private int code;

    @OneToMany(mappedBy = "faculty")
    private List<Person> people;

}
