package com.inversionofcontrol;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDependencyInjectionDemo {

	public static void main(String[] args) {

		System.out.println(" Dependency Injection with xml configuration ");

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("config/application-context.xml");

		Circle2 circle2 = (Circle2) container.getBean("circle2");

		circle2.draw();

		Square2 square2 = (Square2) container.getBean("square2");
		square2.draw();

		container.close();

	}

}
