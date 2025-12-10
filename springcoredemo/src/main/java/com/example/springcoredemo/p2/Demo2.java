package com.example.springcoredemo.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springcoredemo.p1.JavaContainer;

public class Demo2 {

	public static void main(String[] args) {
		try {
			ApplicationContext context=new AnnotationConfigApplicationContext(JavaContainer.class);
			EmployeeService ob=context.getBean(EmployeeService.class);
			EmployeeEntity entity=new EmployeeEntity();
			entity.setEmpid("102");
			entity.setEmpname("");
			ob.addEmployee(entity);
			System.out.println("Employee added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
