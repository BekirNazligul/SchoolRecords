package com.SchoolRecords.data.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "T_USER")
@Getter
@Setter
@NoArgsConstructor
public class User extends AbstractUniqueEntity
{

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;
}
