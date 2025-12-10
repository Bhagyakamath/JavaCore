package com.example.springcoredemo.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3 {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaContainer.class);
		EmployeeBuilder ob= context.getBean(EmployeeBuilder.class);
		ob.display();

	}

}
