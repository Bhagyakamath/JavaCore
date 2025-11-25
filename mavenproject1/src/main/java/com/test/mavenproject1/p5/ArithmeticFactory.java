package com.test.mavenproject1.p5;

import com.test.mavenproject1.p2.Add;
import com.test.mavenproject1.p2.Arithmetic;
import com.test.mavenproject1.p2.Division;
import com.test.mavenproject1.p2.Multiply;
import com.test.mavenproject1.p2.Subtract;

public class ArithmeticFactory {
	public static Arithmetic arr[]=new Arithmetic[] {new Add(), new Subtract(), new Multiply(), new Division() };
	public static Arithmetic getArithmetic(int i) {
		return arr[i];
	}
	
}
