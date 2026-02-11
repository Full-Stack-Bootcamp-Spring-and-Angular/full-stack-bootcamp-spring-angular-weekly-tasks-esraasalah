package com.vehicleSystem.controllers;

import java.util.List;

import com.vehicleSystem.models.Vehicle;

public interface VehicleController {


     public void   saveVehicle(Vehicle  vehicle) ;

     public void updateVehicle(Vehicle vehicle);

     public void deleteVehicle(Integer id);

     public void searchById(Integer id);

     public List<Vehicle> getAllVehicles() ;


}
