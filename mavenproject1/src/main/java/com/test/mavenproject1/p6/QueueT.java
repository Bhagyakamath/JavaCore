package com.test.mavenproject1.p6;

import com.test.mavenproject1.p1.Read;

public class QueueT {
	Integer arr[];
	int fe=-1;
	int re=-1;
	public QueueT() {
		arr=new Integer[10];
	}
	
	public QueueT(int n) {
		arr=new Integer[n];
	}
	
	private boolean isEmpty() {
		if(re==fe) {
			re=fe=-1;
			return true;
		}
		else return false;
	}
	
	private boolean isFull() {
		if(re>=arr.length-1) return true;
		else return false;
	}
	
	public void add() {
		
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			re++;
			System.out.println("Enter value: ");
			arr[re]=Read.sc.nextInt();
		}
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			fe++;
			System.out.println(arr[fe]);
		}
	}
}
