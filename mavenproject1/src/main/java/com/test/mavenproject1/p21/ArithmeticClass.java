package com.test.mavenproject1.p21;

public abstract class ArithmeticClass implements ArithmeticInterface{
	int num1;
	int num2;
	int num3;

	@Override
	public void setData(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}

	@Override
	public void display() {
		System.out.println("Num1= "+num1+ ", Num2= "+num2+", Num3= "+num3);
		
	}
	
}
