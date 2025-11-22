package com.test.mavenproject1.p3;

public class Demo1 {
	public static void main(String[] args) {
//		IsMath obj=new IsMath() {}  Creates a anonymous class
		IsMath obj=(x,y)->(x+y);     //Lambda Expression
		IsMath obj1=(x,y)->{
			int z=x-y;
			return z;
		};
		IsMath obj2=(x,y)->(x*y);
		System.out.println(obj.cal(50, 10));
		System.out.println(obj1.cal(10,20));
		
		f1((x,y)->(x+y), 10, 20);
	}
	public static void f1(IsMath obj,int a,int b) {
		System.out.println(obj.cal(a, b));
	}
	
}

@FunctionalInterface
interface IsMath{
	public int cal(int a, int b);
//	public void cal1();  Funtional Interface should contain only one abstract method
}
