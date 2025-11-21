package com.test.mavenproject1.p1;

public class Conversion {
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number: ");
		num=Read.sc.nextInt();
		toBinary(num);
		toOctal(num);
		
	}
	public static void toBinary(int num) {
		String binary="";
		while(num>0) {
			binary= (num%2)+binary;
			num/=2;
		}
		System.out.println(binary);
	}
	
	public static  void toOctal(int num) {
		String octal="";
		while(num>0) {
			octal= (num%8)+octal;
			num/=8;
		}
		System.out.println(octal);
	}
}
