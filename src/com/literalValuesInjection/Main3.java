package com.literalValuesInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {


    public static void main(String[] args)
    {
                   ApplicationContext container = new ClassPathXmlApplicationContext("application-context.xml");
            
                        Car car = (Car)container.getBean("car");
                        car.saveDataToDataBase();

                        Plane plane = (Plane) container.getBean("plane");
                        plane.saveDataToDataBase();
    }


    
}
