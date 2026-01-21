package com.BeanInitAndDistroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansInitAndDistroyTest {

  public static void main(String[] args) {
    System.out.println(" Bean init and distroy ");

    ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application-context.xml");

    DatabaseOperations databaseOperations = (DatabaseOperations) container.getBean("databaseOperations");

    databaseOperations.connectToDatabase();
    
    container.close();

  }





}
