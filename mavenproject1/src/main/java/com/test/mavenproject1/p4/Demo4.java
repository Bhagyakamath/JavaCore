package com.test.mavenproject1.p4;

import com.test.mavenproject1.p1.Read;

public class Demo4 {

	public static void main(String[] args) {
		String strongpassword="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
		String password;
		System.out.println("Enter a password: ");
		password=Read.sc.nextLine();
		if(password.matches(strongpassword)) {
			System.out.println("Strong Password");
		}
		else {
			System.out.println("Your password is invalid");
		}

	}

}
