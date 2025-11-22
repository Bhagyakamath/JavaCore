package com.test.mavenproject1.p3;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo3 {
	public static void main(String[] args) {
		Test1<String, Integer> ob=(a)->(a.length());
		System.out.println(ob.f1("Hello"));
		
		Predicate<Integer> ob1=(x)->(x%2==0);
		if(ob1.test(3)) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		Consumer<String> name= s-> System.out.println("Hi");
		Supplier<Integer> ab=()->8;
		System.out.println(ab.get());
		//System.out.println(name.accept(s));
		
	}
}

interface Test1<T, T1>{
	public T1 f1(T x);
}