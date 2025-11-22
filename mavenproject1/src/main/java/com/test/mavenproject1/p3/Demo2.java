package com.test.mavenproject1.p3;

public class Demo2 {
	//Generic Template
	public static void main(String[] args) {
		Temp1<Integer> ob=new Temp1();
		ob.setData(10, 20);
		ob.display();
		
		Temp1<String> st=new Temp1();
		st.setData("Hi", "Hello");
		st.display();
		
		Temp2<Integer, String> ob1=new Temp2();
		ob1.setData(10, "Hi");
		ob1.display();
		
	}
	
}

class Temp1<T>{
	T a,b;
	public void setData(T x, T y) {
		a=x;
		b=y;
	}
	public void display() {
		System.out.println(a+ " "+ b);
	}
}

class Temp2<T1, T2>{
	T1 a;
	T2 b;
	public void setData(T1 x, T2 y) {
		a=x;
		b=y;
	}
	public void display() {
		System.out.println(a+ " "+ b);
	}
}
