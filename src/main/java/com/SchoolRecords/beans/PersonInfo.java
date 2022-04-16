package com.SchoolRecords.beans;

import com.SchoolRecords.data.entities.Person;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Session-global object representing the logged-in person.
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class PersonInfo
{
    private Person person;

    private String firstName;

    public void setPerson(Person person)
    {
        this.person = person;
        this.firstName = person.getPersonalDetail().getFirstName();
    }
}
