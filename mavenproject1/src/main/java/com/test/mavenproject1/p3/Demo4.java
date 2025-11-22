package com.test.mavenproject1.p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo4 {
	//Collections - ArrayList
	public static void main(String[] args) {
				List<Integer> l1=new ArrayList<>();
				l1.add(90);
				l1.add(20);
				l1.add(30);
				l1.add(4);
				l1.add(87);
				l1.add(15);
				System.out.println(l1);
				
				for(int i=0; i<l1.size(); i++) {
					System.out.print(l1.get(i)+" ");
				}
				System.out.println("....using index");
				
				for(Integer x : l1) {
					System.out.print(x+" ");
				}
				System.out.println("....using for each");
				
				l1.forEach((x)->System.out.print(x+" "));     //forEach is a consumer
				System.out.println("....using forEach consumer");
				
				l1.forEach(System.out :: print);   //Using static reference
				System.out.println("....using forEach consumer and method reference");
				
				l1.forEach(Demo4 :: psv);
				System.out.println("....using forEach consumer and user static method");
				
				Demo4 obj=new Demo4();
				l1.forEach(obj :: p1);
				System.out.println("....using forEach consumer and user instance method");
				
				Iterator<Integer> it=l1.iterator();
				while(it.hasNext()) {
					System.out.print(it.next()+" ");
				}
				System.out.println("....using Iteroator");
				
				System.out.println(l1.get(4));
				l1.remove(4);
				System.out.println(l1);
				l1.remove(new Integer(15));
				System.out.println(l1);
				
				
				List<Integer> l2=new ArrayList<Integer>(Arrays.asList(new Integer[] {12, 34, 56, 67,78}));
				System.out.println(l2);
				System.out.println();
//				l1.addAll(l2);   //adds all elements
//				l1.retainAll(l2);  retains common element
//				l1.removeAll(l2);
				Collections.sort(l1);
				Collections.shuffle(l2);
				System.out.println(l2);
//				l1.clear();
				System.out.println(l1);
	}
	public static void psv(Integer x) {
		System.out.print(x+"-->"+(x*x)+" ");
	}
	public void p1(Integer x) {
		System.out.print(x+"-->"+(Math.sqrt(x))+" ");
	}
}
