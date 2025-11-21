package com.test.mavenproject1.p23;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Begin");
		int a=10;
		int b=0;
		int c;
		try {
//			c=a/b;
			c=new Demo2().cal(a, b);
			System.out.println(c);
			return;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End");
		}

	}
	public int cal(int a, int b) throws ArithmeticException {
		return a/b;
	}

}
