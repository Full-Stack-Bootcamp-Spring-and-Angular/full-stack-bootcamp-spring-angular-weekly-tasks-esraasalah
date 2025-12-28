package com.vehicleSystem ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vehicleSystem.controllers.BikeController;
import com.vehicleSystem.controllers.VehicleController;
import com.vehicleSystem.models.Bike;
import com.vehicleSystem.models.Type;
import com.vehicleSystem.models.Vehicle;

public class Main5 {

    

    public static void main(String[] args)
    {

        ApplicationContext context =
        new AnnotationConfigApplicationContext(com.vehicleSystem.config.Config.class);

        Vehicle bike = new Bike("kia", Type.bike ); 

      BikeController bikeController = context.getBean(BikeController.class);
           
            // bikeController.saveVehicle(bike);
             
         //    bikeController.searchById(1);
            
            Vehicle newBike = new Bike(2,"new model",Type.bike);
                    
             
             //  bikeController.updateVehicle(newBike); 

          //  bikeController.deleteVehicle(3);

             bikeController.getAllVehicles();

            

              
             






           
          

          
           
            


    }




    
}
