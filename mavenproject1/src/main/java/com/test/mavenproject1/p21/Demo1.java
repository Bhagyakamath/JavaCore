package com.test.mavenproject1.p21;

public class Demo1 {
	public static void main(String[] args) {
		ArithmeticInterface ob=new Add(); //When we have interface, always create reference of interface
		ob.setData(30, 20);
		ob.cal();
		ob.display();
	}
}
