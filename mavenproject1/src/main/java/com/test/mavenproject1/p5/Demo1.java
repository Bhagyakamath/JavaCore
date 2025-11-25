package com.test.mavenproject1.p5;

import java.io.File;

import com.test.mavenproject1.p1.Read;

public class Demo1 {

	public static void main(String[] args) {
		try {
			String fname;
			System.out.println("Enter file name with path and extension: ");
			fname=Read.sc.nextLine();
			File f1=new File(fname);
			if(f1.exists()) {
				if(f1.isDirectory()) {
					System.out.println("Given is a directory");
					String arr[]=f1.list();
					for(String x : arr) {
						System.out.println(x);
					}
				}
				else {
					System.out.println("Given is a file");
				}
			}
			else {
				System.out.println("File doesn't exist");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
