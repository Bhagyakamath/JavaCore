package com.test.mavenproject1.p22;

public class EncapsulationDemo {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void f1() {
		System.out.println("F1");
	}
	
	void f2() {
		System.out.println("F2");
	}
	
    protected void f3() {
		System.out.println("F3");
	}
	
	public void f4() {
		System.out.println("F4");
	}
}
