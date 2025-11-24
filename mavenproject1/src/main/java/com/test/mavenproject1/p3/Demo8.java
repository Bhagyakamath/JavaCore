package com.test.mavenproject1.p3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo8 {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(100);
		dq.push(200);
		dq.add(300);
		dq.push(600);
		System.out.println(dq);
		System.out.println(dq.remove());
		System.out.println(dq.pop());
		
 
	}

}
