package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hello = (HelloWorld) applicationContext.getBean("helloBean");

        System.out.println(hello.toString());
    }
}