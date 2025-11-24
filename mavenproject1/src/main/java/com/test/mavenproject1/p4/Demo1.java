package com.test.mavenproject1.p4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {
//		Map<String, Long> mp=new HashMap<>();    //Unordered
//		Map<String, Long> mp=new TreeMap<>();    Data will be sorted 
		Map<String, Long> mp=new LinkedHashMap<>();   
		mp.put("Kolkata", 2156l);
		mp.put("Bangalore", 3995l);
		mp.put("Delhi", 6785l);
		mp.put("Mumbai", 5674l);
		mp.put("Kolkata", 4756l);
		System.out.println(mp);
		System.out.println();
		System.out.println(mp.get("Delhi"));
		
		System.out.println();
		mp.keySet().forEach(System.out :: println);
		
		System.out.println();
		mp.keySet().forEach((x)->{
			System.out.println(x+" "+mp.get(x));
		});
		
		System.out.println();
		System.out.println("Cities with population in between 2000 and 5000");
		mp.keySet().stream().filter((x)->(mp.get(x)>2000 && mp.get(x)<5000)).forEach((x)->{
			System.out.println(x+" "+mp.get(x));
		});
	}
}
