package com.example.springcoredemo.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("container.xml");
			Holiday ob=(Holiday) context.getBean("a1");  //IOC- Getting the object not creating
			ob.display();
			ob=(Holiday) context.getBean("a2");
			ob.display();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
