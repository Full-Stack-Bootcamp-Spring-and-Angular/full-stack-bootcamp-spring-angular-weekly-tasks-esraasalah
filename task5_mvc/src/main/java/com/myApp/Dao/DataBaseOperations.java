package com.myApp.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.myApp.models.User;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope("singleton")
@Setter
@Getter
public class DataBaseOperations {

  @Value("${database.url}")
  private String url;

  @Value("${database.username}")
  private String username;

  @Value("${database.password}")
  private String password;

  Connection conn;

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

    try {
      if (conn != null && !conn.isClosed()) {
        conn.close();
        System.out.println("connecting to database closed.....\n");
      }
    } catch (SQLException ex) {
      System.err.println("Failed to disconnect from database");
      System.err.println(ex.getMessage());
    }

  }

  public void saveUser(User user) {
    String sql = "INSERT INTO users (first_name, last_name,  date_of_birth , City ) VALUES (?, ?, ?, ?)";

    try (PreparedStatement st = conn.prepareStatement(sql)) {
      st.setString(1, user.getFirstName());
      st.setString(2, user.getLastName());
      st.setDate(4, Date.valueOf(user.getDateOfBirth()));
      st.setString(5, user.getCity());

      st.executeUpdate();
    } catch (SQLException ex) {
      throw new RuntimeException("Failed to save user", ex);
    }

  }

}
