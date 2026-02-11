package com.vehicleSystem.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vehicleSystem.dao.DatabaseOperations;
import com.vehicleSystem.models.Bike;
import com.vehicleSystem.models.Type;
import com.vehicleSystem.models.Vehicle;

@Component
public class BikeController implements VehicleController {


    @Autowired
    DatabaseOperations databaseOperations ;
    
    

    @Override
    public  void saveVehicle(Vehicle bike) {

    

         databaseOperations.saveVehicle(bike);
         databaseOperations.disConnectFromTheDatabase
         ();
          
    }


       @Override
    public void searchById(Integer id) {
       
          databaseOperations.searchById(id);
         databaseOperations.disConnectFromTheDatabase();

         
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
       
                 databaseOperations.updateVehicle(vehicle);
                 databaseOperations.disConnectFromTheDatabase();

    }


    @Override
    public void deleteVehicle(Integer id) {
        
               databaseOperations.deleteVehicle(id);
                 databaseOperations.disConnectFromTheDatabase();

        
    }

 

    @Override
    public List<Vehicle> getAllVehicles() {

                
                return  databaseOperations.getAllVehicles();
                

    }

     

    
    
}
