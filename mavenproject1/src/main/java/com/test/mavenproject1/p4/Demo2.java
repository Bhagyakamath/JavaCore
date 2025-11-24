package com.test.mavenproject1.p4;

import java.util.LinkedHashMap;
import java.util.Map;

import com.test.mavenproject1.p1.Read;

public class Demo2 {
	public static void main(String[] args) {
		String sentence;
		Map<String, Integer> mp=new LinkedHashMap<>();
		System.out.println("Enter sentence: ");
		sentence=Read.sc.nextLine();
		String arr[]=sentence.split(" "); //split on space
		
		for(String x : arr ) {  
			int y=mp.getOrDefault(x, 0);
			y++;
			mp.put(x, y);
		}
		System.out.println(mp);
	}
}
