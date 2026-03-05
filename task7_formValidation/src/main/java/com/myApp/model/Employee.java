package com.myApp.model;


import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class Employee {



    Integer id ;
    @NotNull
    @Size(min =1 , message = "employee name cannot be null ")
    String name;

    @Email(message = "please enter valid email")
    String email ;
    String password ;
    public Employee(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }




}
