package com.learning.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.beans.Employee;
import com.learning.spring.beans.HelloWorld;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello(); 
		
		Employee empObjOne = (Employee) context.getBean("employeeBean");
		String messageOne = empObjOne.welcomeMessage();
        System.out.println("Welcome message in APP.java file .....:  "+messageOne);
        
        Employee empObjTwo = (Employee) context.getBean("employeeBean");
		String messageTwo = empObjTwo.welcomeMessage();
        System.out.println("Welcome message in APP.java file .....:  "+messageTwo);
	    
        empObjOne.setSalary(75000);
        System.out.println("empObjTwo.welcomeMessage() :::::: "+empObjTwo.welcomeMessage());
        
        empObjTwo.setEmployeeName("Rama Krishna");
        System.out.println("empObjOne.welcomeMessage() :::::: "+empObjOne.welcomeMessage());

        
	}
}
