package com.test.mavenproject1.p5;

import java.io.File;
import java.io.RandomAccessFile;

import com.test.mavenproject1.p1.Read;

public class Demo2 {

	public static void main(String[] args) {
		try {
			String fname;
			System.out.println("Enter file name with path and extension: ");
			fname=Read.sc.nextLine();
			File f1=new File(fname);
			RandomAccessFile rm=new RandomAccessFile(f1, "rw");
			
			long fp=0L;
			int ch;
			while((ch=rm.read())!=-1) {
				if(ch==97) {
					rm.seek(fp);
					rm.write(65);
				}
				fp++;
			}
			rm.close();
			System.out.println("File processing done");
		} catch (Exception e) {
			
		}

	}

}
