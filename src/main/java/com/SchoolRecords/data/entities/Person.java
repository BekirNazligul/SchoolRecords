package com.SchoolRecords.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_PERSON")
@Getter
@Setter
public class Person extends AbstractUniqueEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PERSONAL_DETAIL_ID", referencedColumnName = "ID")
    private PersonalDetail personalDetail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTACT_DETAIL_ID", referencedColumnName = "ID")
    private ContactDetail contactDetail;

    @ManyToOne
    @JoinColumn(name = "FACULTY")
    private Faculty faculty;

    @OneToOne(mappedBy = "person")
    private Instructor instructor;

    @OneToOne(mappedBy = "person")
    private Student student;

}
