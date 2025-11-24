package com.test.mavenproject1.p4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo6 {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\bhagyalakshmee.x1\\Desktop\\JavaCore\\mavenproject1\\src\\main\\java\\com\\test\\mavenproject1\\p4\\data.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\bhagyalakshmee.x1\\Desktop\\JavaCore\\mavenproject1\\src\\main\\java\\com\\test\\mavenproject1\\p4\\data1.txt"));
			String s1;
			while((s1=br.readLine())!=null) {
				int sum=0;
				for(String x : s1.split(",")) {
					sum+=Integer.parseInt(x);
				}
				bw.write(s1+"="+sum);
				bw.newLine();
			}
			br.close();
			bw.close();
			System.out.println("Your file is processed");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
