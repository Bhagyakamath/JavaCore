package com.test.mavenproject1.p1;

public class Demo3 {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.setData(10, 20);
		obj.compute();
		obj.display();
		//obj=null;
		obj = new Addition();
		obj.display();
		System.gc(); //Calling garbage collector

	}

}
