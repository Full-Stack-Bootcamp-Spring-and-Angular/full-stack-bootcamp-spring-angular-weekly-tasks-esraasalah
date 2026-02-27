package com.myApp ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!kjhjhlkjlkjlk");

        ApplicationContext context = new AnnotationConfigApplicationContext(com.myApp.config.Config.class);



    }
}
