package com.SchoolRecords.data.entities;

import com.SchoolRecords.data.enums.Role;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "T_PERSON")
@Getter
@Setter
@NoArgsConstructor
public class Person extends AbstractUniqueEntity
{

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

    @OneToOne(mappedBy = "person")
    private Admin admin;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "ROLE")
    private Role role;

    @OneToOne(mappedBy = "person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
}
