package com.example.springcoredemo.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.springcoredemo.p2.Arithmetic;
import com.example.springcoredemo.p2.Aritmetic1;
import com.example.springcoredemo.p2.EmployeeDao;
import com.example.springcoredemo.p2.EmployeeEntity;
import com.example.springcoredemo.p2.EmployeeService;
import com.example.springcoredemo.p2.Validate;

@Configuration           //to make it container
@EnableAspectJAutoProxy
public class JavaContainer {
	@Bean
	@Lazy
	@Scope(value="singleton")
	public Holiday f1() {
		return new Holiday("Gandhi Jayanthi", "2 Oct");
	}
	
	@Bean
	public Holiday f2() {
		Holiday ob=new Holiday();
		ob.setHolidayname("Christmas");
		ob.setHolidaydate("25 Dec");
		return ob;
	}
	
	@Bean
	public EmployeeBuilder f3() {
		return new EmployeeBuilder.  Build().empid("1001").empname("Rahul").build();
	}
	
	@Bean
	public Arithmetic f4() {
		return new Aritmetic1();
	}
	
	@Bean
	public Validate f5() {
		return new Validate();
	}
	
	@Bean
	public EmployeeDao f6() {
		return new EmployeeDao();
	}
	
	@Bean
	public EmployeeService f7() {
		return new EmployeeService();
	}
}
