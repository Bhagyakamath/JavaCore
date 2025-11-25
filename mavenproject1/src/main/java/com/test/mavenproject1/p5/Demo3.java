package com.test.mavenproject1.p5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo3 {
	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("x.rm");
			AddTest ob=new AddTest();
			ob.setData(32, 42);
			ob.cal();
			new ObjectOutputStream(fo).writeObject(ob);
			fo.close();
			System.out.println("Serialization over");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
