package com.test.mavenproject1.p2;

public class Add extends Arithmetic{ //is a relationship- because of extends
	public void cal() {
		this.num3=this.num1+this.num2;
	}
	public void display() {                        //Overriding
		System.out.println("Sum= ");
		super.display();
	}
}
