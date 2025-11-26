package com.test.mavenproject1.p6;

public class CompanyThread extends Thread{
	String n1;
	int m;
	public CompanyThread() {
		n1="ABCD";
		m=10;
	}
	public CompanyThread(String n1, int m) {
		super();
		this.n1 = n1;
		this.m = m;
	}
	@Override
	public void run() {
		for(int i=0; i<m; i++) {
			System.out.println(n1+"..."+i);
			try {
				sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
