package com.vehicleSystem.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vehicleSystem.enums.Type;

import com.vehicleSystem.dao.DatabaseOperations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
@AllArgsConstructor
public class Plane implements Vehicle {

  Integer id;
  String model;
  Type type;

}
