package com.inversionofcontrol;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	   public static void main (String[] args) 
	   {
		   
		 System.out.println(" Dependancy Injection with xml configuration ");
		 
		   
		 ApplicationContext container = new ClassPathXmlApplicationContext("application-context.xml");
		 
		 
		
	      Circle2 circle2 =    (Circle2) container.getBean("circle2") ;

		  circle2.draw();

	   Square2 square2 =   (Square2) container.getBean("square2");
                square2.draw();

		 
		 
		   
		   
		   
	   }
	
	
	
}
