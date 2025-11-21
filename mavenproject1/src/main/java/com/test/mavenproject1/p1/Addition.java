package com.test.mavenproject1.p1;

public class Addition {
	int num1, num2;
	int num3;
	
	public Addition() {
		System.out.println("Zero argumented contructor");
	}
	
	public void readData() {
		System.out.println("Enter two numbers: ");
		num1=Read.sc.nextInt();
		num2=Read.sc.nextInt();
		
	}
	public void setData(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void compute() {
		this.num3=this.num1+this.num2;
	}
	public void display() {
		System.out.println("Sum= "+ this.num3);
	}
	
	public void finalize() {
		System.out.println("Destructor");
	}
	{
		System.out.println("Welcome to anonymous block");
	}
	static{
		System.out.println("static block"); //executed only once in life cycle
	}
}
