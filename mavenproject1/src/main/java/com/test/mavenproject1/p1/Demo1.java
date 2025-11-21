package com.test.mavenproject1.p1;

public class Demo1 {

	public static void main(String[] args) {
		int sum=0;
		for(String x: args) {
			sum=sum+Integer.parseInt(x);
		}
		System.out.println("Sum= "+sum);

	}

}