package com.SchoolRecords.data.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@RequiredArgsConstructor
@Table(name = "t_test")
public class test {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "t_testcol")
    private String test;

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                ", test='" + test + '\'' +
                '}';
    }
}
