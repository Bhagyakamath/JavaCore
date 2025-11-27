package com.test.mavenproject1.p7;

import java.util.Date;

public class Student {
	int sid;
	String name;
	Date dob;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + "]";
	}

	Student next = null;
	
}
