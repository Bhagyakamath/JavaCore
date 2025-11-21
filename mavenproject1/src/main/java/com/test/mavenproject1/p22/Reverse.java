package com.test.mavenproject1.p22;

public class Reverse {
	public int reverse(int a) {
//		int r=0;
//		while(a>0) {
//			int digit=a%10;
//			r=r*10+digit;
//			a/=10;
//		}
//		return r;
		return Integer.parseInt(reverse(String.valueOf(a)));
	}
	
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public long reverse(long a) {
		return Long.parseLong(reverse(String.valueOf(a)));
	}
	
	public float reverse(float a) {
		return Float.parseFloat(reverse(String.valueOf(a)));
	}
}
