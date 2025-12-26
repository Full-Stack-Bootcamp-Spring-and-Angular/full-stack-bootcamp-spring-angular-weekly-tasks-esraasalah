package com.BeanInitAndDistroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {

      public static void main (String[] args) 
	   {
             System.out.println(" Bean init and distroy ");
		 
		   
		 ApplicationContext container = new ClassPathXmlApplicationContext("application-context.xml");   
         
         DatabaseOperations databaseOperations = ( DatabaseOperations) container.getBean("init-destroy");

         databaseOperations.connectToDatabase();

         databaseOperations.disconnectFromDatabase();



       }



    
}
