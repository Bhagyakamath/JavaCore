package com.example.springcoredemo.p2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)     //weaving
public class Validate {
	@Before("execution(* *.*(Integer, Integer))")  //* *.* : any package, any class, any method
	public void valid(JoinPoint arg) throws IllegalArgumentException{
		for(Object x: arg.getArgs()) {
			if((Integer) x <0) {
				throw new IllegalArgumentException("Negative numbers not supported");
			}
		}
	}
	
	@AfterReturning(pointcut="execution(* *.*(Integer, Integer))", returning="abc" )
	public void validate2(JoinPoint jp, Object abc) throws IllegalArgumentException{
		if((Integer) abc>200000) {
			throw new IllegalArgumentException("Value crosses max limit");
		}
	}
}








