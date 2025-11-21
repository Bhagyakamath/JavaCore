package com.test.mavenproject1.p23;

import com.test.mavenproject1.p22.EncapsulationDemo;

public class Demo1 extends EncapsulationDemo{

	public static void main(String[] args) {
		EncapsulationDemo ob=new EncapsulationDemo();
//		System.out.println(ob.a);  a is private. Cannot be called outside class
//		System.out.println(ob.b);
//		System.out.println(ob.c);
		System.out.println(ob.d);
		
//		ob.f1();   f1() is private. Cannot be called outside class
//		ob.f2();
//		ob.f3();
		ob.f4();

	}
	public void test() {
//		System.out.println(a);    private is not allowed outside package
//		System.out.println(b);    default is not allowed outside package
		System.out.println(c);
		System.out.println(d);
		f3();
		f4();
		
	}
	

}
