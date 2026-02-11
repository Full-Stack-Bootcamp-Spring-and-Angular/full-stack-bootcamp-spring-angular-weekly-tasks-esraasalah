package com.literalValuesInjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiteralValuesInjectionTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("config/application-context.xml");

        Car car = (Car) container.getBean("car");
        car.saveDataToDataBase();

        Plane plane = (Plane) container.getBean("plane");
        plane.saveDataToDataBase();

        container.close();
    }

}
