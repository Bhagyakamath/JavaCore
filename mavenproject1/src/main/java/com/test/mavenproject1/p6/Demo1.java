package com.test.mavenproject1.p6;

public class Demo1 {

	public static void main(String[] args) {
		Festival f=new Festival();
		try {
			f.setData("2025-03-31");
			f.ramCal();
			f.setData("2025-10-20");
			f.diwaliCal();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
