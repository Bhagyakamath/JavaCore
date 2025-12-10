package com.example.springcoredemo.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2 {

	public static void main(String[] args) {
		//Using Java container
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaContainer.class);
//		Holiday ob=context.getBean(Holiday.class);
		Holiday ob=(Holiday) context.getBean("f1");
		ob.display();
		ob=(Holiday) context.getBean("f2");
		ob.display();

	}

}
