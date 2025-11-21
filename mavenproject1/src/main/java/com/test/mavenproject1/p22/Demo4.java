package com.test.mavenproject1.p22;

public class Demo4 {

	public static void main(String[] args) {
		EncapsulationDemo ob=new EncapsulationDemo();
//		System.out.println(ob.a);  a is private. Cannot be called outside class
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		
//		ob.f1();   f1() is private. Cannot be called outside class
		ob.f2();
		ob.f3();
		ob.f4();

	}

}
