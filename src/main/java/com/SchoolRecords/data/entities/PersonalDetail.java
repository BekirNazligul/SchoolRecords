package com.SchoolRecords.data.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_PERSONAL_DETAIL")
public class PersonalDetail extends AbstractUniqueEntity {

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "IDENTITY_NUMBER")
    private String identityNumber;

}
