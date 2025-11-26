package com.test.mavenproject1.p6;

public class Demo3 {

	public static void main(String[] args) throws Exception{
		System.out.println("I'm in main company thread t1");
		CompanyThread t1=new CompanyThread("ABsis", 15);
		CompanyThread t2=new CompanyThread("XYosys", 10);
		CompanyThread t3=new CompanyThread("MNro", 25);
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Program over");   //4 threads are running at the time including main

	}

}
