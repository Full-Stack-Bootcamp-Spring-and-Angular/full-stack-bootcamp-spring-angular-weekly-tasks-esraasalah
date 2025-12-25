package com.inversionofcontrol;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	   public static void main (String[] args) 
	   {
		   
		 System.out.println(" inversion of control with xml configuration ");
		 
		   
		 ApplicationContext container = new ClassPathXmlApplicationContext("application-context.xml");
		 
		 
		 System.out.println("enter x value");  
		 Scanner scanner = new Scanner(System.in);
		 
		 Double x = scanner.nextDouble();
		 
		 Shape circle = container.getBean("circle", Shape.class);
		 
		System.out.println(" circle area is : "  + circle.getArea(x));
		  
		 Shape square = container.getBean("square" , Shape.class );
		 
		 System.out.println(" circle area is : "  + square.getArea(x));
		 
		 
		   
		   
		   
	   }
	
	
	
}
