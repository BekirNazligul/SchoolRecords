package com.SchoolRecords.data.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_PERSONAL_DETAIL")
@Getter
@Setter
@NoArgsConstructor
public class PersonalDetail extends AbstractUniqueEntity
{

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
