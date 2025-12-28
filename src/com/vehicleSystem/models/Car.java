package com.vehicleSystem.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vehicleSystem.dao.DatabaseOperations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Component
@Scope("property")
@AllArgsConstructor
public class Car  implements Vehicle  {

public  DatabaseOperations   databaseOperations ;

       @Autowired
     public  Car(DatabaseOperations   databaseOperations)
       {
            this.databaseOperations = databaseOperations ;    

       }

    Integer id ;
    String model ;
    Type type ;
    
}
