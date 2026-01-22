package com.vehicleSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vehicleSystem.dao.DatabaseOperations;
import com.vehicleSystem.models.Vehicle;

@Component
public class CarController implements VehicleController {

    @Autowired
    DatabaseOperations databaseOperations;

    @Override
    public void saveVehicle(Vehicle vehicle) {
        System.out.println("Car saved successfully");
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateVehicle'");
    }

    @Override
    public void deleteVehicle(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteVehicle'");
    }

    @Override
    public void searchById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchById'");
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllVehicles'");
    }

}
