package com.myApp.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;




@Getter
@Setter

public class User {


    Integer id ;
    String firstName ;
    String lastName ;
    LocalDate dateOfBirth ;
    String city ;

    public User(Integer id, String firstName, String lastName, LocalDate dateOfBirth, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
    }
}
