package com.SchoolRecords.data.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_ADMIN")
@Getter
@Setter
@NoArgsConstructor
public class Admin extends AbstractUniqueEntity
{

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @Column(name = "ADMIN_NUMBER")
    private long adminNumber;

}
