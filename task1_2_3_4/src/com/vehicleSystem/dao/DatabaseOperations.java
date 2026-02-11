package com.vehicleSystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vehicleSystem.models.Bike;

import com.vehicleSystem.models.Vehicle;
import com.vehicleSystem.enums.Type;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope("singleton")
@Setter
@Getter
public class DatabaseOperations {

   @Value("${database.url}")
   private String url;

   @Value("${database.username}")
   private String username;

   @Value("${database.password}")
   private String password;

     Connection conn ;

   @PostConstruct // init method
   public void connectToDatabase() {
      System.out.println("connection stablished");

      
               try {
                  conn = DriverManager.getConnection(url, username, password);
               } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
     

   }

   @PreDestroy // distroy method
   public void disConnectFromTheDatabase() {

      System.out.println("connection closed");
   }

   public void saveVehicle(Vehicle vehicle) throws SQLException {

      System.out.println(vehicle);

      Integer id = vehicle.getId();
      System.out.println(vehicle.getId());

      String model = vehicle.getModel();
      System.out.println(vehicle.getModel());
      Type type = vehicle.getType();
      System.out.println(vehicle.getType());

      String sql = "INSERT INTO vehicle (model, type) VALUES (?, ?)";
      
            PreparedStatement ps = conn.prepareStatement(sql);

         ps.setString(1, vehicle.getModel());
         try {
            ps.setString(2, vehicle.getType().toString());
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } // enum

         ps.executeUpdate();
         System.out.println("Record inserted successfully");
   
      System.out.println("vehicle saved successfully");

   }

   // search / select vehicle by id

   public void searchById(Integer id) {

      String sql = "SELECT * FROM vehicle WHERE id = ?";
      try (
            PreparedStatement ps = conn.prepareStatement(sql)) // try-with-resources
      {

         ps.setInt(1, id);
         ResultSet rs = ps.executeQuery();
         if (rs.next()) {
            Bike bike = new Bike();
            bike.setId(rs.getInt("id"));
            bike.setModel(rs.getString("model"));
            bike.setType(Type.valueOf(rs.getString("type")));
            System.out.println(bike);
         }
         System.out.println("Record returned successfully");

      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   public void updateVehicle(Vehicle vehicle) {
      String sql = "update  vehicle set model = ?  WHERE id = ?";
      try (
            PreparedStatement ps = conn.prepareStatement(sql)) {

         ps.setString(1, vehicle.getModel());
         ps.setInt(2, vehicle.getId());
         ps.executeUpdate();

         System.out.println("Record updated successfully");

      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   public void deleteVehicle(Integer id) {

      String sql = " delete from  vehicle   WHERE id = ?";
      try (
            PreparedStatement ps = conn.prepareStatement(sql)) {

         ps.setInt(1, id);
         ps.executeUpdate();

         System.out.println("Record deleted successfully");

      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   public List<Vehicle> getAllVehicles() {

      List<Vehicle> vehicles = new ArrayList<>();
      String sql = "SELECT * FROM vehicle ";
      try (
            PreparedStatement ps = conn.prepareStatement(sql)) {

         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            Bike bike = new Bike();
            bike.setId(rs.getInt("id"));
            bike.setModel(rs.getString("model"));
            bike.setType(Type.valueOf(rs.getString("type")));
            System.out.println(bike);
            vehicles.add(bike);

         }
         System.out.println("all vehicles returned successfully");

      } catch (SQLException e) {
         e.printStackTrace();
      }

      return vehicles;

   }

}
