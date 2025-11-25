package com.test.mavenproject1.p5;

import com.test.mavenproject1.p2.Arithmetic;

public class DemoAF {

	public static void main(String[] args) {
		Arithmetic obj=new ArithmeticFactory().getArithmetic(1);
		obj.setData(20, 20);
		obj.cal();
		obj.display();

	}

}
