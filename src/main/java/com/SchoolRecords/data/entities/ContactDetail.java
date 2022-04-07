package com.SchoolRecords.data.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_CONTACT_DETAIL")
@RequiredArgsConstructor
@Getter
@Setter
public class ContactDetail extends AbstractUniqueEntity {

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "E_MAIL")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    @OneToOne(mappedBy = "contactDetail")
    private Person person;
}
