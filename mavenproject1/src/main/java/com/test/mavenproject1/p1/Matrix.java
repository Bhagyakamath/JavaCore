package com.test.mavenproject1.p1;

public class Matrix {
	int m;
	int n;
	int a[][];
	
	public Matrix() {
		this.m=3;
		this.n=3;
		a=new int[m][n];
	}
	public Matrix(int m, int n) {
		this.m=m;
		this.n=n;
		a=new int[m][n];
	}

	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		int m=Read.sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n=Read.sc.nextInt();
		
		if(m==0 || n==0) {
			Matrix obj1=new Matrix();
			System.out.println(obj1.m+" X "+obj1.n);
		}
		else {
		Matrix obj2=new Matrix(m,n);
		System.out.println(obj2.m+" X "+obj2.n);
		
		}

	}

}
