package com.example.hibernatestart.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="users")
@Getter
@Setter


public class UserEntity {


  private Integer id;

 @Column (name="first_name")
  private String firstName;

 @Column(name="last_name")
  private String lastName;




}