package com.test.mavenproject1.p4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo5 {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter two numbers: ");
			String s1=br.readLine();
			String s2=br.readLine();
			System.out.println("Sum= "+(Integer.parseInt(s1)+Integer.parseInt(s2)));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
