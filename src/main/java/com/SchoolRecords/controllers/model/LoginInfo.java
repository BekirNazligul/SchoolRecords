package com.SchoolRecords.controllers.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo
{

    private String email;

    private String password;

    private boolean error;

    public void clear()
    {
        this.email = "";
        this.password = "";
    }
}
