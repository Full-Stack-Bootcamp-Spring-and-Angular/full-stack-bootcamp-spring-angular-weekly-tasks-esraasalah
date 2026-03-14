package com.example.hibernateStart.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name="users")
@Getter
@Setter

@NoArgsConstructor
public class UserEntity {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private Integer id;

 @Column (name="first_name")
  private String firstName;

 @Column(name="last_name")
  private String lastName;

 public UserEntity( String firstName, String lastName) {


     this.firstName = firstName;
     this.lastName = lastName;
 }

    public  String toString()
    {

        return  this.id + " " + this.firstName + " " + this.lastName;

    }

}