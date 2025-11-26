package com.test.mavenproject1.p6;

public class TicToc{
	public synchronized void f1() {
		try {
			notify();
			System.out.print("Tic - ");
			wait();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public synchronized void f2(int x) {
		try {
			notify();
			System.out.println("Toc");
			if(x!=19) {
				wait();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void finalize() {
		try {
			notifyAll();
		} catch (Exception e) {
			
		}
	}

	
}
