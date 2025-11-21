package com.test.mavenproject1.p2;

public class Demo1 {
	public static void main(String args[]) {
//		Add obj=new Add();    //tightly coupled
		Arithmetic obj=new Add();   //loosely coupled
		obj.setData(40, 30);    
		obj.cal();
		obj.display();
		
		obj=new Subtract();
		obj.setData(30, 20);
		obj.cal();
		obj.display();
		
		obj=new Multiply();
		obj.setData(30, 20);
		obj.cal();
		obj.display();
		
		obj=new Division();
		obj.setData(30, 20);
		obj.cal();
		obj.display();
		
	}
}
