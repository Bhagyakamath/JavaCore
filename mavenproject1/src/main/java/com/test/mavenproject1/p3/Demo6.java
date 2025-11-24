package com.test.mavenproject1.p3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo6 {
	public static void main(String[] args) {
		Set<EmployeeDto> employee=new HashSet();
		employee.add(new EmployeeDto(1, "Ram"));
		employee.add(new EmployeeDto(2, "Rahul"));
		employee.add(new EmployeeDto(3, "Priya"));
		employee.add(new EmployeeDto(4, "Naina"));
		employee.add(new EmployeeDto(5, "Kavya"));
//		employee.forEach(System.out :: println);
		System.out.println(employee);
		
		Iterator it=employee.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println();
		
		System.out.println("Sort names");
//		Collections.sort(employee);   cannot sort a set as it is unordered
        System.out.println(employee);
        System.out.println();
        
        System.out.println("Even Employee id");
        employee.stream().filter((ob)->(ob.getEmpid()%2==0)).forEach(System.out :: println);
        System.out.println("Name of employee");
        employee.stream().map((ob)->(ob.getEmpname())).forEach(System.out :: println);
        
        System.out.println();
        System.out.println("Name of the employee whose name starts with R");
        employee.stream()
        .filter((ob)->(ob.getEmpname().charAt(0)=='R'))
        .map((ob)->(ob.getEmpname()))
        .forEach(System.out :: println);
        
        System.out.println("Name of the employee whose name starts with R using regular expressions");
        employee.stream()
        .filter((ob)->(ob.getEmpname().matches("[Rr].*")))
        .map((ob)->(ob.getEmpname()))
        .forEach(System.out :: println);   //forEach is consumer
        
        System.out.println("Count of the employees whose name start with R");
        int c= (int) employee.stream()
        .filter((ob)->(ob.getEmpname().matches("[Rr].*")))
        .map((ob)->(ob.getEmpname()))
        .count();     //count is supplier
        System.out.println(c);
        
        //create a seaparate ArrayList of employees whose name between A to M
        System.out.println("Name between A to M");
        Set<EmployeeDto> x= (Set<EmployeeDto>) employee.stream()
                .filter((ob)->(ob.getEmpname().matches("[A-Ma-m].*")))
                .collect(Collectors.toSet());
        System.out.println(x);
        
        System.out.println();
        employee.remove(1);
        System.out.println(employee);
        
        
        

		}
}
