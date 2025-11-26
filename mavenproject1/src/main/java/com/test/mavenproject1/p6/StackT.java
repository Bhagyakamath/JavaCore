package com.test.mavenproject1.p6;

import com.test.mavenproject1.p1.Read;

public class StackT {
	Integer arr[];
	int sp=-1;
	public StackT() {
		arr=new Integer[10];
	}
	
	public StackT(int n) {
		arr=new Integer[n];
	}
	
	private boolean isUnderflow() {
		if(sp==-1) {
			return true;
		}
		else return false;
	}
	
	private boolean isOverflow() {
		if(sp>=arr.length-1) return true;
		else return false;
	}
	
	public void add() {
		
		if(isOverflow()) {
			System.out.println("Overflow");
		}
		else {
			sp++;
			System.out.println("Enter value: ");
			arr[sp]=Read.sc.nextInt();
		}
	}
	
	public void remove() {
		if(isUnderflow()) {
			System.out.println("Underflow");
		}
		else {
			System.out.println(arr[sp]);
			sp--;
		}
	}
}
