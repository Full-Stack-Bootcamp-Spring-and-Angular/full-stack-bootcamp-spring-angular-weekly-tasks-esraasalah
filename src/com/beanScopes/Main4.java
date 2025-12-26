package com.beanScopes ;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

	   public static void main (String[] args) 
	   {
		   
		 System.out.println(" Bean Scopes with xml configuration ");
		 
		   
		 ApplicationContext container = new ClassPathXmlApplicationContext("application-context.xml");
		 
		 
		
	      Circle3 circleObj1 =    (Circle3) container.getBean("circle3") ;

		  circleObj1 .draw();
		  System.out.println("circleObj1 : " + circleObj1);
		  Circle3 circleObj2 =    (Circle3) container.getBean("circle3") ;
		  System.out.println("circleObj2 : " + circleObj2);



	   Square3 squareObj1 =   (Square3) container.getBean("square3");
                squareObj1.draw();
                 System.out.println("squareObj1 : " + squareObj1);
				 Square3 squareObj2 =   (Square3) container.getBean("square3");
				 System.out.println("squareObj2 : " + squareObj2);


		 
		 
		   
		   
		   
	   }
	
	
	
}
