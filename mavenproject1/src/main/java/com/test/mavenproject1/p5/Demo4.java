package com.test.mavenproject1.p5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo4 {

	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("x.rm");
			AddTest ob=(AddTest) new ObjectInputStream(fi).readObject();
			ob.display();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
