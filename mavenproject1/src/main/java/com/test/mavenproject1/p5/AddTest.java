package com.test.mavenproject1.p5;

import java.io.Serializable;

public class AddTest implements Serializable{
	int num1;
	int num2;
	int num3;
	
	public void setData(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void cal() {
		this.num3=num1+num2;
	}
	
	public void display() {
		System.out.println("Num1= "+num1+", Num2= "+num2+", Num3= "+num3);
	}
}
