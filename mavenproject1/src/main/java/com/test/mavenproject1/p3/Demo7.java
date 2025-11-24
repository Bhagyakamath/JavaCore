package com.test.mavenproject1.p3;

import java.util.LinkedList;
import java.util.Queue;

public class Demo7 {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(100);
		q.add(200);
		q.add(300);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
		

	}

}
